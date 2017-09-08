package batch16.android.devf.com.peticiones.ModelSend.MovilOrdenInsert;

import com.google.gson.annotations.SerializedName;

public class Canales {
    @SerializedName("guidCanal")
    private String guidCanal;
    @SerializedName("guidCodificador")
    private String guidCodificador;
    @SerializedName("potenciaInicial")
    private double potenciaInicial;
    @SerializedName("potenciaFinal")
    private double potenciaFinal;
    @SerializedName("totalPerdidas")
    private int totalPerdidas;

    public String getGuidCanal() {
        return guidCanal;
    }

    public void setGuidCanal(String guidCanal) {
        this.guidCanal = guidCanal;
    }

    public String getGuidCodificador() {
        return guidCodificador;
    }

    public void setGuidCodificador(String guidCodificador) {
        this.guidCodificador = guidCodificador;
    }

    public double getPotenciaInicial() {
        return potenciaInicial;
    }

    public void setPotenciaInicial(double potenciaInicial) {
        this.potenciaInicial = potenciaInicial;
    }

    public double getPotenciaFinal() {
        return potenciaFinal;
    }

    public void setPotenciaFinal(double potenciaFinal) {
        this.potenciaFinal = potenciaFinal;
    }

    public int getTotalPerdidas() {
        return totalPerdidas;
    }

    public void setTotalPerdidas(int totalPerdidas) {
        this.totalPerdidas = totalPerdidas;
    }
}
