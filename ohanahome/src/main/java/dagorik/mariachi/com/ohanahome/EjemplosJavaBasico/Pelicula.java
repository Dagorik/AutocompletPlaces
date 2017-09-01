package dagorik.mariachi.com.ohanahome.EjemplosJavaBasico;

/**
 * Created by Dagorik on 31/08/17.
 */

public class Pelicula extends Largometraje{

    String precio;
    String genero;
    String nombre = "Soy una pelicula";

    public Pelicula(String precio, String genero) {
        this.precio = precio;
        this.genero = genero;
    }


    public void getNombre(){
        System.out.println(nombre);
    }



}
