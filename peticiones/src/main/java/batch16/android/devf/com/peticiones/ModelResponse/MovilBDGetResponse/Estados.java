package batch16.android.devf.com.peticiones.ModelResponse.MovilBDGetResponse;

import com.google.gson.annotations.SerializedName;

public class Estados {
    @SerializedName("clvEstado")
    private int clvEstado;
    @SerializedName("estado")
    private String estado;
    @SerializedName("clvCiudad")
    private int clvCiudad;
    @SerializedName("ciudad")
    private String ciudad;

    public int getClvEstado() {
        return clvEstado;
    }

    public void setClvEstado(int clvEstado) {
        this.clvEstado = clvEstado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getClvCiudad() {
        return clvCiudad;
    }

    public void setClvCiudad(int clvCiudad) {
        this.clvCiudad = clvCiudad;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
}
