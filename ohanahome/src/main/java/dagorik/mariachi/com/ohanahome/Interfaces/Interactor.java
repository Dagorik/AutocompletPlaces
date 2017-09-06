package dagorik.mariachi.com.ohanahome.Interfaces;

import org.json.JSONException;

import java.util.List;

import dagorik.mariachi.com.ohanahome.Models.Compras.Buy;
import dagorik.mariachi.com.ohanahome.Models.Porcentaje;
import dagorik.mariachi.com.ohanahome.Models.Porsentajes;

/**
 * Created by Dagorik on 25/08/17.
 */

public interface Interactor {

    Porcentaje getDataFromAPI();


    Buy getDataCompras();


}
