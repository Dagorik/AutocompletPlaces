package batch16.android.devf.com.caluclos.ModelCalculos;

import android.util.Log;

import java.util.Hashtable;

import batch16.android.devf.com.caluclos.DataBase.Model.AtenuacionTabla;
import io.realm.Realm;

/**
 * Created by Dagorik on 07/09/17.
 */

public class Tec {

    Realm realm;
    Tap cajaDigital;
    Tap dw;
    Tap up;
    private double dBCD;
    private double dBDW;
    private double dBUp;
    private double potenciaCD;
    private double potenciaUP;
    private double potenciaDW;

    public Tec(Tap cajaDigital, Tap dw, Tap up, Realm realm) {
        this.cajaDigital = cajaDigital;
        this.dw = dw;
        this.up = up;
        this.realm = realm;
    }


    public double[] calcularAtenucacion(String cable, int distancia) {

        //Busca en la tabla de valores de a cuerdo a su cable
        finddBinCable(cable);


        double atenuacionCD = (distancia * dBCD) / 100;
        double atenuacionDw = (distancia * dBDW) / 100;
        double atenuacionUp = (distancia * dBUp) / 100;

        //obtenerPotencia(atenuacionCD, atenuacionUp, atenuacionDw);

        return new double[]{atenuacionCD, atenuacionDw, atenuacionUp};
    }


    public void finddBinCable(String cable) {

        String canalCD = cajaDigital.getCanal();
        String canalDw = dw.getCanal();
        String calanUp = up.getCanal();

        String dbCD = realm.where(AtenuacionTabla.class).equalTo("cable", cable).equalTo("chan", canalCD).findFirst().getdB();
        String dbDw = realm.where(AtenuacionTabla.class).equalTo("cable", cable).equalTo("chan", canalDw).findFirst().getdB();
        String dbUp = realm.where(AtenuacionTabla.class).equalTo("cable", cable).equalTo("chan", calanUp).findFirst().getdB();

        dBCD = Double.parseDouble(dbCD);
        dBDW = Double.parseDouble(dbDw);
        dBUp = Double.parseDouble(dbUp);

    }

    public double[] obtenerPotencia(double atenuacionCD, double atenuacionDw, double atenuacionUp) {
        double potenciaCd = Double.parseDouble(cajaDigital.getPotencia());
        double potenciaDw = Double.parseDouble(dw.getPotencia());
        double potenciaUp = Double.parseDouble(up.getPotencia());

        potenciaCD = potenciaCd - atenuacionCD;
        potenciaDW = potenciaDw - atenuacionDw;
        potenciaUP = potenciaUp + atenuacionUp;

        return new double[]{potenciaCD, potenciaDW, potenciaUP};


    }
}
