package batch16.android.devf.com.peticiones.ModelResponse.MovilBDGetResponse;

import com.google.gson.annotations.SerializedName;

public class Canales {
    @SerializedName("guidCanal")
    private String guidCanal;
    @SerializedName("clvTipoCable")
    private int clvTipoCable;
    @SerializedName("tipoCable")
    private String tipoCable;
    @SerializedName("nombre")
    private String nombre;
    @SerializedName("video")
    private int video;
    @SerializedName("atenuacion")
    private double atenuacion;
    @SerializedName("subida")
    private boolean subida;
    @SerializedName("clvCiudad")
    private int clvCiudad;
    @SerializedName("ciudad")
    private String ciudad;
    @SerializedName("clvEstado")
    private int clvEstado;
    @SerializedName("estado")
    private String estado;

    public String getGuidCanal() {
        return guidCanal;
    }

    public void setGuidCanal(String guidCanal) {
        this.guidCanal = guidCanal;
    }

    public int getClvTipoCable() {
        return clvTipoCable;
    }

    public void setClvTipoCable(int clvTipoCable) {
        this.clvTipoCable = clvTipoCable;
    }

    public String getTipoCable() {
        return tipoCable;
    }

    public void setTipoCable(String tipoCable) {
        this.tipoCable = tipoCable;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVideo() {
        return video;
    }

    public void setVideo(int video) {
        this.video = video;
    }

    public double getAtenuacion() {
        return atenuacion;
    }

    public void setAtenuacion(double atenuacion) {
        this.atenuacion = atenuacion;
    }

    public boolean getSubida() {
        return subida;
    }

    public void setSubida(boolean subida) {
        this.subida = subida;
    }

    public int getClvCiudad() {
        return clvCiudad;
    }

    public void setClvCiudad(int clvCiudad) {
        this.clvCiudad = clvCiudad;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getClvEstado() {
        return clvEstado;
    }

    public void setClvEstado(int clvEstado) {
        this.clvEstado = clvEstado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
