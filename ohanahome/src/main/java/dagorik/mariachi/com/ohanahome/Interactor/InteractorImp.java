package dagorik.mariachi.com.ohanahome.Interactor;

import java.util.ArrayList;
import java.util.List;

import dagorik.mariachi.com.ohanahome.Interfaces.Interactor;
import dagorik.mariachi.com.ohanahome.Models.Compras.Buy;
import dagorik.mariachi.com.ohanahome.Models.Compras.Compra;
import dagorik.mariachi.com.ohanahome.Models.Porcentaje;
import dagorik.mariachi.com.ohanahome.Models.Porsentajes;

/**
 * Created by Dagorik on 25/08/17.
 */

public class InteractorImp implements Interactor {
    List<Porsentajes> listP = new ArrayList<>();

    List<Compra> buyList = new ArrayList<>();

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

    @Override
    public Buy getDataCompras() {

        Compra compra = new Compra();
        compra.setName("Compra del mes de Junio");
        compra.setDescription("Chedrahui Selecto Santa Fe");
        compra.setPerson("10");
        compra.setCheck("20");
        compra.setTotal("3419.00");

        Compra compra2 = new Compra();
        compra2.setName("Asado del fin de Semana");
        compra2.setDescription("Costco Per");
        compra2.setPerson("1");
        compra2.setCheck("4");
        compra2.setTotal("419.00");


        Compra compra3 = new Compra();
        compra3.setName("Cumpleaños de Juan");
        compra3.setDescription("Soriana Av norte");
        compra3.setPerson("5");
        compra3.setCheck("20");
        compra3.setTotal("1319.50");


        Compra compra4 = new Compra();
        compra4.setName("Compra de xbox");
        compra4.setDescription("Liverpool Sur");
        compra4.setPerson("10");
        compra4.setCheck("20");
        compra4.setTotal("6419.00");

        Compra compra5 = new Compra();
        compra5.setName("Compra de Play 4");
        compra5.setDescription("Plaza Copilcp");
        compra5.setPerson("1");
        compra5.setCheck("2");
        compra5.setTotal("9419.00");

        buyList.add(compra);
        buyList.add(compra2);
        buyList.add(compra3);
        buyList.add(compra4);
        buyList.add(compra5);

        Buy buy = new Buy();

        buy.setCompra(buyList);

        return buy;
    }
}
