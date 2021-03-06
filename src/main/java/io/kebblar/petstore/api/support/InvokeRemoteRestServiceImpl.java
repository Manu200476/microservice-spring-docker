/*
 * Licencia:    Este  código y cualquier  derivado  de  el, es  propiedad de la
 *              empresa Metasoft SA de CV y no debe, bajo ninguna circunstancia
 *              ser copiado, donado,  cedido, modificado, prestado, rentado y/o
 *              mostrado  a ninguna persona o institución sin el permiso expli-
 *              cito  y  por  escrito de  la empresa Metasoft SA de CV, que es,
 *              bajo cualquier criterio, el único dueño de la totalidad de este
 *              código y cualquier derivado de el.
 *              ---------------------------------------------------------------
 * Paquete:     io.kebblar.petstore.api.support
 * Proyecto:    petstore-back
 * Tipo:        Clase
 * Nombre:      InvokeRemoteRestServiceImpl
 * Autor:       Gustavo Adolfo Arellano (GAA)
 * Correo:      gustavo.arellano@metasoft.com.mx
 * Versión:     0.0.1-SNAPSHOT
 *
 * Historia:
 *              Creación: 5 Sep 2021 @ 08:28:57
 */
package io.kebblar.petstore.api.support;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Implementación de la interfaz {@link io.kebblar.petstore.api.support.InvokeRemoteRestService}.
 *
 * @author dalvarez
 * @version 1.0-SNAPSHOT
 * @since 1.0-SNAPSHOT
 */
@Service("invokeRestService")
public class InvokeRemoteRestServiceImpl implements InvokeRemoteRestService {
    private RestTemplate restTemplate;

    @Value("${bitso}")
    private String bitso; // loading something like https://api.bitso.com/v3/

    @Value("${binance}")
    private String binance;

    @Value("${google_recaptcha_url}")
    private String googleRecaptchaUrl;

    @Value("${google.recaptcha.secret}")
    private String googleRecaptchaSecret;

    @Value("${sms_url}")
    String smsUrl;

    @Value("${sms.secret}")
    String smsSecret;

    /**
     * <p>Constructor for InvokeRemoteRestServiceImpl.</p>
     *
     * @param restTemplate a {@link org.springframework.web.client.RestTemplate} object.
     */
    public InvokeRemoteRestServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    /**
     * <p>getBitsoInfo.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getBitsoInfo() {
        String url = this.bitso + "ticker/?book=btc_mxn";
        HttpHeaders headers = new HttpHeaders();
        headers.add("user-agent", "curl");     //"Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");
        HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
        return restTemplate.postForObject(url, entity, String.class);
        // https://stackoverflow.com/questions/16781680/http-get-with-headers-using-resttemplate
        //return restTemplate.exchange(smsUrl, HttpMethod.GET, entity, String.class).getBody();
    }

    /**
     * <p>getBinanceInfo.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getBinanceInfo() {
        String url = this.binance + "ticker/24hr?symbol=BTCUSDT";
        return restTemplate.getForObject(url, String.class);
    }

}
