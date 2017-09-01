package dagorik.mariachi.com.ohanahome.EjemplosJavaBasico;

/**
 * Created by Dagorik on 30/08/17.
 */

public class Carro {

    String color = "ROJO";
    int velocidad = 60;
    String motor = "6 cilindros";

    public Carro(String color, int velocidad, String motor) {
        this.color = color;
        this.velocidad = velocidad;
        this.motor = motor;
    }

    public Carro() {
    }

    public void acelera(){
        System.out.println("ACELERA");
    }

    public void frena(){
        System.out.println("FRENA");
    }

    public void detallesCarro(){
        System.out.println("El color es " + color +
                " su velocidad es " + velocidad +
                " tiene un motor" + motor);
    }


    public String getColor() {
        return color;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public String getMotor() {
        return motor;
    }
}
