package batch16.android.devf.com.peticiones.ModelResponse.MovilBDGetResponse;

import com.google.gson.annotations.SerializedName;

public class Contenidos {
    @SerializedName("guidContenido")
    private String guidContenido;
    @SerializedName("clvTipoContenido")
    private int clvTipoContenido;
    @SerializedName("tipoContenido")
    private String tipoContenido;
    @SerializedName("nombre")
    private String nombre;
    @SerializedName("liga")
    private String liga;

    public String getGuidContenido() {
        return guidContenido;
    }

    public void setGuidContenido(String guidContenido) {
        this.guidContenido = guidContenido;
    }

    public int getClvTipoContenido() {
        return clvTipoContenido;
    }

    public void setClvTipoContenido(int clvTipoContenido) {
        this.clvTipoContenido = clvTipoContenido;
    }

    public String getTipoContenido() {
        return tipoContenido;
    }

    public void setTipoContenido(String tipoContenido) {
        this.tipoContenido = tipoContenido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLiga() {
        return liga;
    }

    public void setLiga(String liga) {
        this.liga = liga;
    }
}
