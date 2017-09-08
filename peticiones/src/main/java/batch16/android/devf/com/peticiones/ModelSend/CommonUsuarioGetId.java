package batch16.android.devf.com.peticiones.ModelSend;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Dagorik on 08/09/17.
 */

public class CommonUsuarioGetId {


    @SerializedName("usr")
    private String usr;
    @SerializedName("pwd")
    private String pwd;
    @SerializedName("dispositivo")
    private String dispositivo;

    public String getUsr() {
        return usr;
    }

    public void setUsr(String usr) {
        this.usr = usr;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getDispositivo() {
        return dispositivo;
    }

    public void setDispositivo(String dispositivo) {
        this.dispositivo = dispositivo;
    }
}
