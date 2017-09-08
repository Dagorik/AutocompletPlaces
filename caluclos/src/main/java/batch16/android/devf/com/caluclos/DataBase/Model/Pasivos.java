package batch16.android.devf.com.caluclos.DataBase.Model;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Dagorik on 08/09/17.
 */

public class Pasivos extends RealmObject {

    @PrimaryKey
    String idDevice;
    String type;

    public Pasivos(String idDevice, String type) {
        this.idDevice = idDevice;
        this.type = type;
    }

    public Pasivos() {
    }

    public String getIdDevice() {
        return idDevice;
    }

    public void setIdDevice(String idDevice) {
        this.idDevice = idDevice;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Pasivos{" +
                "idDevice='" + idDevice + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
