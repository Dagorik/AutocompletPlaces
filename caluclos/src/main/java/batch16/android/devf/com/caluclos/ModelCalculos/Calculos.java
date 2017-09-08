package batch16.android.devf.com.caluclos.ModelCalculos;

import android.util.Log;

import io.realm.Realm;

/**
 * Created by Dagorik on 08/09/17.
 */

public class Calculos {


    public double perdidaSubida(Tap up, String cable, double metros) {

        Tec2 tec = new Tec2(up, Realm.getDefaultInstance());
        double atenuacion = tec.calcularAtenucacion(cable, metros);
        double potencia = tec.obtenerPotenciaSubida(atenuacion);
//        Log.e("MyLogResult", atenuacion + "     " + potencia);
        Log.e("MyLogAtenuación", "" + atenuacion);
        return atenuacion;


    }


    public double perdidaBajada(Tap dw, String cable, double metros) {
        Tec2 tec = new Tec2(dw, Realm.getDefaultInstance());
        double atenuacion = tec.calcularAtenucacion(cable, metros);
        double potencia = tec.obtenerPotencia(atenuacion);
//        Log.e("MyLogResult", atenuacion + "     " + potencia);
        Log.e("MyLogAtenuación", "" + atenuacion);
        return atenuacion;
    }

    public double perdidaPasivo(Tap dw, String cable, double metros) {
        Tec2 tec = new Tec2(dw, Realm.getDefaultInstance());
        double atenuacion = tec.calcularAtenucacion(cable, metros);
        double potencia = tec.obtenerPotencia(atenuacion);
//        Log.e("MyLogResult", atenuacion + "     " + potencia);
        Log.e("MyLogPasivo", "" + potencia);
        return tec.obtenerPasivos();
    }
}
