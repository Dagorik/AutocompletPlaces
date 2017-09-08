package batch16.android.devf.com.peticiones.ModelResponse.MovilBDGetResponse;

import com.google.gson.annotations.SerializedName;

public class TiposOrdenes {
    @SerializedName("clvTipoOrden")
    private int clvTipoOrden;
    @SerializedName("nombre")
    private String nombre;

    public int getClvTipoOrden() {
        return clvTipoOrden;
    }

    public void setClvTipoOrden(int clvTipoOrden) {
        this.clvTipoOrden = clvTipoOrden;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
