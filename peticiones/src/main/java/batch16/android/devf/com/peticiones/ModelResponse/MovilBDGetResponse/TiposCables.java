package batch16.android.devf.com.peticiones.ModelResponse.MovilBDGetResponse;

import com.google.gson.annotations.SerializedName;

public class TiposCables {
    @SerializedName("clvTipoCable")
    private int clvTipoCable;
    @SerializedName("nombre")
    private String nombre;

    public int getClvTipoCable() {
        return clvTipoCable;
    }

    public void setClvTipoCable(int clvTipoCable) {
        this.clvTipoCable = clvTipoCable;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
