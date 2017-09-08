package batch16.android.devf.com.peticiones.ModelResponse.MovilBDGetResponse;

import com.google.gson.annotations.SerializedName;

public class Configuraciones {
    @SerializedName("nivelMinimoSubida")
    private int nivelMinimoSubida;
    @SerializedName("nivelMaximoSubida")
    private int nivelMaximoSubida;
    @SerializedName("nivelMinimoBajada")
    private int nivelMinimoBajada;
    @SerializedName("nivelMaximoBajada")
    private int nivelMaximoBajada;
    @SerializedName("numeroSesiones")
    private int numeroSesiones;
    @SerializedName("tiempoExpiracion")
    private int tiempoExpiracion;
    @SerializedName("pwdLongitud")
    private int pwdLongitud;
    @SerializedName("numeroAdministradores")
    private int numeroAdministradores;
    @SerializedName("validarResultados")
    private boolean validarResultados;

    public int getNivelMinimoSubida() {
        return nivelMinimoSubida;
    }

    public void setNivelMinimoSubida(int nivelMinimoSubida) {
        this.nivelMinimoSubida = nivelMinimoSubida;
    }

    public int getNivelMaximoSubida() {
        return nivelMaximoSubida;
    }

    public void setNivelMaximoSubida(int nivelMaximoSubida) {
        this.nivelMaximoSubida = nivelMaximoSubida;
    }

    public int getNivelMinimoBajada() {
        return nivelMinimoBajada;
    }

    public void setNivelMinimoBajada(int nivelMinimoBajada) {
        this.nivelMinimoBajada = nivelMinimoBajada;
    }

    public int getNivelMaximoBajada() {
        return nivelMaximoBajada;
    }

    public void setNivelMaximoBajada(int nivelMaximoBajada) {
        this.nivelMaximoBajada = nivelMaximoBajada;
    }

    public int getNumeroSesiones() {
        return numeroSesiones;
    }

    public void setNumeroSesiones(int numeroSesiones) {
        this.numeroSesiones = numeroSesiones;
    }

    public int getTiempoExpiracion() {
        return tiempoExpiracion;
    }

    public void setTiempoExpiracion(int tiempoExpiracion) {
        this.tiempoExpiracion = tiempoExpiracion;
    }

    public int getPwdLongitud() {
        return pwdLongitud;
    }

    public void setPwdLongitud(int pwdLongitud) {
        this.pwdLongitud = pwdLongitud;
    }

    public int getNumeroAdministradores() {
        return numeroAdministradores;
    }

    public void setNumeroAdministradores(int numeroAdministradores) {
        this.numeroAdministradores = numeroAdministradores;
    }

    public boolean getValidarResultados() {
        return validarResultados;
    }

    public void setValidarResultados(boolean validarResultados) {
        this.validarResultados = validarResultados;
    }
}
