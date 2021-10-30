package io.kebblar.petstore.api.model.domain;

public class Gente {
	private int id;
	private String correo;
	private String clave;
	private int instanteBloqueo;
	    
    public Gente(int id, String correo, String clave, int instanteBloqueo) {
        this.id = id;
        this.correo = correo;
        this.clave = clave;
        this.instanteBloqueo = instanteBloqueo;
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getClave() {
        return clave;
    }
    public void setClave(String clave) {
        this.clave = clave;
    }
    public int getInstanteBloqueo() {
        return instanteBloqueo;
    }
    public void setInstanteBloqueo(int instanteBloqueo) {
        this.instanteBloqueo = instanteBloqueo;
    }
}
