package batch16.android.devf.com.caluclos.DataBase.Model;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Dagorik on 07/09/17.
 */

public class AtenuacionTabla extends RealmObject {

    @PrimaryKey
    String id;
    String chan;
    String video;
    String dB;
    String cable;

    public AtenuacionTabla(String id, String chan, String video, String dB, String cable) {
        this.id = id;
        this.chan = chan;
        this.video = video;
        this.dB = dB;
        this.cable = cable;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public AtenuacionTabla() {
    }

    public String getChan() {
        return chan;
    }

    public void setChan(String chan) {
        this.chan = chan;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public String getdB() {
        return dB;
    }

    public void setdB(String dB) {
        this.dB = dB;
    }

    public String getCable() {
        return cable;
    }

    public void setCable(String cable) {
        this.cable = cable;
    }

    @Override
    public String toString() {
        return "AtenuacionTabla{" +
                "id='" + id + '\'' +
                ", chan='" + chan + '\'' +
                ", video='" + video + '\'' +
                ", dB='" + dB + '\'' +
                ", cable='" + cable + '\'' +
                '}';
    }
}
