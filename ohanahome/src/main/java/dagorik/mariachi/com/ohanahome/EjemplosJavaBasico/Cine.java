package dagorik.mariachi.com.ohanahome.EjemplosJavaBasico;

/**
 * Created by Dagorik on 31/08/17.
 */

public class Cine {

    public void reproducirPelicula(Pelicula pelicula) {
        System.out.println("Se reproduce una pelicua" + pelicula.genero);
    }

    public void reproducirDocumental(Documental documental) {
        System.out.println("Se reproduce documental  " + documental.audiencia);
    }




    public void resproducirLArgometraje(Largometraje largometraje) {
        System.out.println("Se reproduce un largometraje");
    }



}
