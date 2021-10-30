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
 * Tipo:        Interface
 * Nombre:      InvokeRemoteRestService
 * Autor:       Gustavo Adolfo Arellano (GAA)
 * Correo:      gustavo.arellano@metasoft.com.mx
 * Versión:     0.0.1-SNAPSHOT
 *
 * Historia:
 *              Creación: 5 Sep 2021 @ 08:28:47
 */
package io.kebblar.petstore.api.support;

/**
 * <p>Definición de la interfaz de servicios para 'InvokeRemoteRestService'.
 *
 * @author  dalvarez
 * @version 1.0-SNAPSHOT
 * @since   1.0-SNAPSHOT
 */
public interface InvokeRemoteRestService {

    /**
     * <p>getBitsoInfo.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    String getBitsoInfo();

    /**
     * <p>getBinanceInfo.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    String getBinanceInfo();

}
