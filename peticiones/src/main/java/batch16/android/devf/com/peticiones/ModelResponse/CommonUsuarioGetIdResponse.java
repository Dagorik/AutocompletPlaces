package batch16.android.devf.com.peticiones.ModelResponse;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Dagorik on 08/09/17.
 */

public class CommonUsuarioGetIdResponse {


    @SerializedName("err")
    private boolean err;
    @SerializedName("msg")
    private String msg;
    @SerializedName("guidUsuario")
    private String guidUsuario;

    public boolean getErr() {
        return err;
    }

    public void setErr(boolean err) {
        this.err = err;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getGuidUsuario() {
        return guidUsuario;
    }

    public void setGuidUsuario(String guidUsuario) {
        this.guidUsuario = guidUsuario;
    }
}
