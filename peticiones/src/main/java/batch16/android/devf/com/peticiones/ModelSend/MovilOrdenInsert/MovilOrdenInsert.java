package batch16.android.devf.com.peticiones.ModelSend.MovilOrdenInsert;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Dagorik on 08/09/17.
 */

public class MovilOrdenInsert {

    @SerializedName("clvTipoOrden")
    private int clvTipoOrden;
    @SerializedName("guidUsuario")
    private String guidUsuario;
    @SerializedName("numero")
    private int numero;
    @SerializedName("imagen")
    private String imagen;
    @SerializedName("metrosRG6")
    private double metrosRG6;
    @SerializedName("metrosRG11")
    private double metrosRG11;
    @SerializedName("canales")
    private List<Canales> canales;
    @SerializedName("pasivos")
    private List<Pasivos> pasivos;

    public int getClvTipoOrden() {
        return clvTipoOrden;
    }

    public void setClvTipoOrden(int clvTipoOrden) {
        this.clvTipoOrden = clvTipoOrden;
    }

    public String getGuidUsuario() {
        return guidUsuario;
    }

    public void setGuidUsuario(String guidUsuario) {
        this.guidUsuario = guidUsuario;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public double getMetrosRG6() {
        return metrosRG6;
    }

    public void setMetrosRG6(double metrosRG6) {
        this.metrosRG6 = metrosRG6;
    }

    public double getMetrosRG11() {
        return metrosRG11;
    }

    public void setMetrosRG11(double metrosRG11) {
        this.metrosRG11 = metrosRG11;
    }

    public List<Canales> getCanales() {
        return canales;
    }

    public void setCanales(List<Canales> canales) {
        this.canales = canales;
    }

    public List<Pasivos> getPasivos() {
        return pasivos;
    }

    public void setPasivos(List<Pasivos> pasivos) {
        this.pasivos = pasivos;
    }

    @Override
    public String toString() {
        return "MovilOrdenInsert{" +
                "clvTipoOrden=" + clvTipoOrden +
                ", guidUsuario='" + guidUsuario + '\'' +
                ", numero=" + numero +
                ", imagen='" + imagen + '\'' +
                ", metrosRG6=" + metrosRG6 +
                ", metrosRG11=" + metrosRG11 +
                ", canales=" + canales +
                ", pasivos=" + pasivos +
                '}';
    }
}
