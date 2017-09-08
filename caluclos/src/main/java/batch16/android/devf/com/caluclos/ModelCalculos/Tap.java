package batch16.android.devf.com.caluclos.ModelCalculos;

/**
 * Created by Dagorik on 07/09/17.
 */

public class Tap {

    String canal;
    String potencia;

    public Tap(String canal, String potencia) {
        this.canal = canal;
        this.potencia = potencia;
    }

    public String getCanal() {
        return canal;
    }

    public void setCanal(String canal) {
        this.canal = canal;
    }

    public String getPotencia() {
        return potencia;
    }

    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }
}
