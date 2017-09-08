package batch16.android.devf.com.peticiones.ModelResponse;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Dagorik on 08/09/17.
 */

public class MovilOrdenInsertResponse {

    @SerializedName("err")
    private boolean err;
    @SerializedName("msg")
    private String msg;
    @SerializedName("success")
    private boolean success;

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

    public boolean getSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}
