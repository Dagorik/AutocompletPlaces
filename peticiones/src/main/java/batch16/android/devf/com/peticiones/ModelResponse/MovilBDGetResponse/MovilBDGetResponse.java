package batch16.android.devf.com.peticiones.ModelResponse.MovilBDGetResponse;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Dagorik on 08/09/17.
 */

public class MovilBDGetResponse {


    @SerializedName("err")
    private boolean err;
    @SerializedName("msg")
    private String msg;
    @SerializedName("configuraciones")
    private Configuraciones configuraciones;
    @SerializedName("tiposCables")
    private List<TiposCables> tiposCables;
    @SerializedName("tiposOrdenes")
    private List<TiposOrdenes> tiposOrdenes;
    @SerializedName("tiposPasivos")
    private List<TiposPasivos> tiposPasivos;
    @SerializedName("estados")
    private List<Estados> estados;
    @SerializedName("canales")
    private List<Canales> canales;
    @SerializedName("codificadores")
    private List<Codificadores> codificadores;
    @SerializedName("contenidos")
    private List<Contenidos> contenidos;
    @SerializedName("pasivos")
    private List<Pasivos> pasivos;

    public boolean getErr() {
        return err;
    }

    public void setErr(boolean err) {
        this.err = err;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Configuraciones getConfiguraciones() {
        return configuraciones;
    }

    public void setConfiguraciones(Configuraciones configuraciones) {
        this.configuraciones = configuraciones;
    }

    public List<TiposCables> getTiposCables() {
        return tiposCables;
    }

    public void setTiposCables(List<TiposCables> tiposCables) {
        this.tiposCables = tiposCables;
    }

    public List<TiposOrdenes> getTiposOrdenes() {
        return tiposOrdenes;
    }

    public void setTiposOrdenes(List<TiposOrdenes> tiposOrdenes) {
        this.tiposOrdenes = tiposOrdenes;
    }

    public List<TiposPasivos> getTiposPasivos() {
        return tiposPasivos;
    }

    public void setTiposPasivos(List<TiposPasivos> tiposPasivos) {
        this.tiposPasivos = tiposPasivos;
    }

    public List<Estados> getEstados() {
        return estados;
    }

    public void setEstados(List<Estados> estados) {
        this.estados = estados;
    }

    public List<Canales> getCanales() {
        return canales;
    }

    public void setCanales(List<Canales> canales) {
        this.canales = canales;
    }

    public List<Codificadores> getCodificadores() {
        return codificadores;
    }

    public void setCodificadores(List<Codificadores> codificadores) {
        this.codificadores = codificadores;
    }

    public List<Contenidos> getContenidos() {
        return contenidos;
    }

    public void setContenidos(List<Contenidos> contenidos) {
        this.contenidos = contenidos;
    }

    public List<Pasivos> getPasivos() {
        return pasivos;
    }

    public void setPasivos(List<Pasivos> pasivos) {
        this.pasivos = pasivos;
    }

    @Override
    public String toString() {
        return "MovilBDGetResponse{" +
                "err=" + err +
                ", msg='" + msg + '\'' +
                ", configuraciones=" + configuraciones +
                ", tiposCables=" + tiposCables +
                ", tiposOrdenes=" + tiposOrdenes +
                ", tiposPasivos=" + tiposPasivos +
                ", estados=" + estados +
                ", canales=" + canales +
                ", codificadores=" + codificadores +
                ", contenidos=" + contenidos +
                ", pasivos=" + pasivos +
                '}';
    }
}
