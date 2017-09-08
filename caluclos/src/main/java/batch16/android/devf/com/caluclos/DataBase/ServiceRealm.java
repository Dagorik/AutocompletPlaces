package batch16.android.devf.com.caluclos.DataBase;

import android.text.LoginFilter;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import batch16.android.devf.com.caluclos.DataBase.Model.AtenuacionTabla;
import batch16.android.devf.com.caluclos.DataBase.Model.Conector;
import batch16.android.devf.com.caluclos.DataBase.Model.Pasivos;
import batch16.android.devf.com.caluclos.ModelCalculos.Calculos;
import batch16.android.devf.com.caluclos.ModelCalculos.Tap;
import io.realm.Realm;
import io.realm.RealmResults;

/**
 * Created by Dagorik on 07/09/17.
 */

public class ServiceRealm {

    Realm realm;

    public ServiceRealm(Realm realm) {
        this.realm = realm;
    }

    public RealmResults<AtenuacionTabla> dBForCableandCanal(String canal, String cable) {

        RealmResults<AtenuacionTabla> db = realm.where(AtenuacionTabla.class).equalTo("cable", cable).equalTo("chan", cable).findAll();

        return db;
    }


    public void cargarData(String id, String chan, String video, String dB, String cable) {
        AtenuacionTabla atenuacionTabla = new AtenuacionTabla();

        atenuacionTabla.setId(id);
        atenuacionTabla.setChan(chan);
        atenuacionTabla.setdB(dB);
        atenuacionTabla.setVideo(video);
        atenuacionTabla.setCable(cable);

        realm.beginTransaction();
        realm.copyToRealmOrUpdate(atenuacionTabla);
        realm.commitTransaction();

    }


    public void cargarPasivos() {

        Pasivos pasivos = new Pasivos("1", "base");
        Pasivos pasivos1 = new Pasivos("2", "Acoplador 6");
        Pasivos pasivos2 = new Pasivos("3", "Acoplador 6");
        Pasivos pasivos3 = new Pasivos("4", "terminal");
        Pasivos pasivos4 = new Pasivos("5", "terminal");
        Pasivos pasivos5 = new Pasivos("6", "terminal");


        realm.beginTransaction();
        realm.copyToRealmOrUpdate(pasivos);
        realm.copyToRealmOrUpdate(pasivos1);
        realm.copyToRealmOrUpdate(pasivos2);
        realm.copyToRealmOrUpdate(pasivos3);
        realm.copyToRealmOrUpdate(pasivos4);
        realm.copyToRealmOrUpdate(pasivos5);
        realm.commitTransaction();

    }


    public void cargarConectores() {

        Conector conector = new Conector("2", "1", "RG11", "60");
        Conector conector1 = new Conector("3", "2", "RG6", "0");
        Conector conector2 = new Conector("4", "2", "RG6", "15");
        Conector conector3 = new Conector("5", "3", "RG6", "5");
        Conector conector4 = new Conector("6", "3", "RG6", "10");


        realm.beginTransaction();
        realm.copyToRealmOrUpdate(conector);
        realm.copyToRealmOrUpdate(conector1);
        realm.copyToRealmOrUpdate(conector2);
        realm.copyToRealmOrUpdate(conector3);
        realm.copyToRealmOrUpdate(conector4);
        realm.commitTransaction();


    }

    public void getDiagram() {

        List<String> list = new ArrayList<>();

        RealmResults<Pasivos> terminales = realm.where(Pasivos.class).equalTo("type", "terminal").findAll();
        Log.e("MyTerminales", terminales.size() + "");
        double total = 0;
        for (int i = 0; i < terminales.size(); i++) {
            Pasivos pasiva = terminales.get(i);
            Conector conector = null;
            double sumaConectores = 0;
            double sumPasivos = 0;
            while (!pasiva.getType().equalsIgnoreCase("base")) {

                conector = realm.where(Conector.class).equalTo("idIn", pasiva.getIdDevice()).findFirst();
                pasiva = realm.where(Pasivos.class).equalTo("idDevice", conector.getIdDevice()).findFirst();


                Calculos calculos = new Calculos();
                Tap up = new Tap("T12", "32");
                Tap dw = new Tap("104", "12");

                sumaConectores += calculos.perdidaBajada(dw, conector.getCable(), Double.parseDouble(conector.getMetros()));
                //calculos.perdidaSubida(up, conector.getCable(), Double.parseDouble(conector.getMetros()));
                if (!pasiva.getType().equalsIgnoreCase("terminal") && !pasiva.getType().equalsIgnoreCase("base")
                        ) {

                    if (pasiva.getType().equalsIgnoreCase("Acoplador 6")) {
                        sumPasivos += 3.5;
                    }
                }
            }

            Log.e("MyLogConectores", sumaConectores + "");
            Log.e("MyLogPasivos", sumPasivos + "");

            Log.e("TotalDW: ", (sumaConectores + sumPasivos) + "");
            total = sumaConectores + sumPasivos;
        }

        Log.e("TEC", ( 12- total) + "");


//        for (int i = 0; i < terminales.size(); i++) {
//
//
//            Conector conector = realm.where(Conector.class).equalTo("idIn", terminales.get(i).getIdDevice()).findFirst();
//            pasiva = realm.where(Pasivos.class).equalTo("idDevice", conector.getIdDevice()).findFirst();
//
//
//            Log.e("MyLogFor", conector.toString());
//            Log.e("MyLogFor", pasiva.toString());
//        }

        //RealmResults<Conector> conectores = realm.where(Conector.class).equalTo("idIn", idTermianl).findAll();
        //RealmResults<Pasivos> pasivo = realm.where(Pasivos.class).equalTo("idDevice", conectores.get(0).getIdDevice()).findAll();


    }
}
