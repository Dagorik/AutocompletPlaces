package batch16.android.devf.com.peticiones.ModelSend;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Dagorik on 08/09/17.
 */

public class MovilBDGet {


    @SerializedName("guidUsuario")
    private String guidUsuario;

    public String getGuidUsuario() {
        return guidUsuario;
    }

    public void setGuidUsuario(String guidUsuario) {
        this.guidUsuario = guidUsuario;
    }
}
