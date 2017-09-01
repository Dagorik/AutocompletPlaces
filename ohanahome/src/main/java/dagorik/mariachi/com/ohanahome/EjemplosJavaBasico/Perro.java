package dagorik.mariachi.com.ohanahome.EjemplosJavaBasico;

/**
 * Created by Dagorik on 31/08/17.
 */

public class Perro extends Animal {

    String raza;
    String patas;

    public Perro(String raza, String patas) {
        this.raza = raza;
        this.patas = patas;

        System.out.println("El perro es de raza: " + raza);
        System.out.println("El perro tiene: " + patas + " patas");
    }


    public void ladrar() {
        System.out.println("El perro " + raza +" ladra");
    }

    public void jadea() {
        System.out.println("El perro" + raza+" jadea");
    }

}
