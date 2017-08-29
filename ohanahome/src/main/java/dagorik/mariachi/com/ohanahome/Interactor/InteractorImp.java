package dagorik.mariachi.com.ohanahome.Interactor;

import java.util.ArrayList;
import java.util.List;

import dagorik.mariachi.com.ohanahome.Interfaces.Interactor;
import dagorik.mariachi.com.ohanahome.Models.Porcentaje;
import dagorik.mariachi.com.ohanahome.Models.Porsentajes;

/**
 * Created by Dagorik on 25/08/17.
 */

public class InteractorImp implements Interactor {
    List<Integer> list = new ArrayList<>();
    List<Porsentajes> listP = new ArrayList<>();

    @Override
    public Porcentaje getDataFromAPI() {

        Porsentajes porsentajes = new Porsentajes();
        porsentajes.setName("Raul Amador");
        porsentajes.setPorsent(30);

        Porsentajes porsentajes1 = new Porsentajes();
        porsentajes1.setName("Jose Perez");
        porsentajes1.setPorsent(30);

        Porsentajes porsentajes2 = new Porsentajes();
        porsentajes2.setName("Paco Juarez");
        porsentajes2.setPorsent(20);

        Porsentajes porsentajes3 = new Porsentajes();
        porsentajes3.setName("Juan de la Madrid");
        porsentajes3.setPorsent(10);

        Porsentajes porsentajes4 = new Porsentajes();
        porsentajes4.setName("Jorge Martinez");
        porsentajes4.setPorsent(10);


        listP.add(porsentajes);
        listP.add(porsentajes1);
        listP.add(porsentajes2);
        listP.add(porsentajes3);
        listP.add(porsentajes4);

        Porcentaje porcentaje = new Porcentaje();
        porcentaje.setName("POR");
        porcentaje.setPorsentajes(listP);


        return porcentaje;
    }
}
