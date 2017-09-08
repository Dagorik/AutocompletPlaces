package batch16.android.devf.com.caluclos.ModelCalculos;

import android.util.Log;

import batch16.android.devf.com.caluclos.DataBase.Model.AtenuacionTabla;
import io.realm.Realm;

/**
 * Created by Dagorik on 08/09/17.
 */

public class Tec2 {
    Realm realm;
    Tap señales;


    public Tec2(Tap señales, Realm realm) {
        this.señales = señales;
        this.realm = realm;
    }


    public double calcularAtenucacion(String cable, double distancia) {


        double dB = finddBinCable(cable);


        double atenuacion = (distancia * dB) / 100;


        return atenuacion;
    }


    public double finddBinCable(String cable) {

        String canal = señales.getCanal();

        String db = realm.where(AtenuacionTabla.class).equalTo("cable", cable).equalTo("chan", canal).findFirst().getdB();

        double dBCD = Double.parseDouble(db);

        return dBCD;

    }

    public double obtenerPotencia(double atenuacion) {
        double potencia = Double.parseDouble(señales.getPotencia());

        potencia = potencia - atenuacion;

        return potencia;
    }

    public double obtenerPasivos() {
        double potencia = Double.parseDouble(señales.getPotencia());

        potencia = potencia;

        return potencia;
    }


    public double obtenerPotenciaSubida(double atenuacion) {
        double potencia = Double.parseDouble(señales.getPotencia());
        potencia = potencia + atenuacion;

        return potencia;
    }
}
