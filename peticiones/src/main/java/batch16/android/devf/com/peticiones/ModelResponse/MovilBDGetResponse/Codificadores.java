package batch16.android.devf.com.peticiones.ModelResponse.MovilBDGetResponse;

import com.google.gson.annotations.SerializedName;

public class Codificadores {
    @SerializedName("guidCodificador")
    private String guidCodificador;
    @SerializedName("nombre")
    private String nombre;

    public String getGuidCodificador() {
        return guidCodificador;
    }

    public void setGuidCodificador(String guidCodificador) {
        this.guidCodificador = guidCodificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
