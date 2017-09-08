package batch16.android.devf.com.peticiones.ModelResponse.MovilBDGetResponse;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Pasivos {
    @SerializedName("guidPasivo")
    private String guidPasivo;
    @SerializedName("clvTipoPasivo")
    private int clvTipoPasivo;
    @SerializedName("tipoPasivo")
    private String tipoPasivo;
    @SerializedName("nombre")
    private String nombre;
    @SerializedName("salidas")
    private List<Salidas> salidas;

    public String getGuidPasivo() {
        return guidPasivo;
    }

    public void setGuidPasivo(String guidPasivo) {
        this.guidPasivo = guidPasivo;
    }

    public int getClvTipoPasivo() {
        return clvTipoPasivo;
    }

    public void setClvTipoPasivo(int clvTipoPasivo) {
        this.clvTipoPasivo = clvTipoPasivo;
    }

    public String getTipoPasivo() {
        return tipoPasivo;
    }

    public void setTipoPasivo(String tipoPasivo) {
        this.tipoPasivo = tipoPasivo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Salidas> getSalidas() {
        return salidas;
    }

    public void setSalidas(List<Salidas> salidas) {
        this.salidas = salidas;
    }
}
