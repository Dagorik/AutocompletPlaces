package batch16.android.devf.com.peticiones.ModelResponse.MovilBDGetResponse;

import com.google.gson.annotations.SerializedName;

public class TiposPasivos {
    @SerializedName("clvTipoPasivo")
    private int clvTipoPasivo;
    @SerializedName("nombre")
    private String nombre;

    public int getClvTipoPasivo() {
        return clvTipoPasivo;
    }

    public void setClvTipoPasivo(int clvTipoPasivo) {
        this.clvTipoPasivo = clvTipoPasivo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
