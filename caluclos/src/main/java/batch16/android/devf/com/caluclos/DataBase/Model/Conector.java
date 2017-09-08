package batch16.android.devf.com.caluclos.DataBase.Model;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Dagorik on 08/09/17.
 */

public class Conector extends RealmObject {

    @PrimaryKey
    String idIn;
    String idDevice;
    String cable;
    String metros;

    public Conector(String idIn, String idDevice, String cable, String metros) {
        this.idIn = idIn;
        this.idDevice = idDevice;
        this.cable = cable;
        this.metros = metros;
    }

    public Conector() {
    }

    public String getIdIn() {
        return idIn;
    }

    public void setIdIn(String idIn) {
        this.idIn = idIn;
    }

    public String getIdDevice() {
        return idDevice;
    }

    public void setIdDevice(String idDevice) {
        this.idDevice = idDevice;
    }

    public String getCable() {
        return cable;
    }

    public void setCable(String cable) {
        this.cable = cable;
    }

    public String getMetros() {
        return metros;
    }

    public void setMetros(String metros) {
        this.metros = metros;
    }

    @Override
    public String toString() {
        return "Conector{" +
                "idIn='" + idIn + '\'' +
                ", idDevice='" + idDevice + '\'' +
                ", cable='" + cable + '\'' +
                ", metros='" + metros + '\'' +
                '}';
    }
}
