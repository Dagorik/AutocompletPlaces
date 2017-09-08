package batch16.android.devf.com.caluclos.DataBase;

import android.util.Log;

import batch16.android.devf.com.caluclos.DataBase.Model.AtenuacionTabla;
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


}
