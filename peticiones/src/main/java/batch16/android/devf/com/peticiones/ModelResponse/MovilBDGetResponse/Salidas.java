package batch16.android.devf.com.peticiones.ModelResponse.MovilBDGetResponse;

import com.google.gson.annotations.SerializedName;

public class Salidas {
    @SerializedName("atenuacion")
    private double atenuacion;

    public double getAtenuacion() {
        return atenuacion;
    }

    public void setAtenuacion(double atenuacion) {
        this.atenuacion = atenuacion;
    }
}
