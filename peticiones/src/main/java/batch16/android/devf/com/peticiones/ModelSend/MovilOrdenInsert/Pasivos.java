package batch16.android.devf.com.peticiones.ModelSend.MovilOrdenInsert;

import com.google.gson.annotations.SerializedName;

public class Pasivos {
    @SerializedName("guidPasivo")
    private String guidPasivo;

    public String getGuidPasivo() {
        return guidPasivo;
    }

    public void setGuidPasivo(String guidPasivo) {
        this.guidPasivo = guidPasivo;
    }
}
