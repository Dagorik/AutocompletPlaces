package batch16.android.devf.com.peticiones.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Dagorik on 08/09/17.
 */

public class ServiceGenerator {
    private static Retrofit retrofit;

    private static Retrofit.Builder builder =
            new Retrofit.Builder()
                    .addConverterFactory(GsonConverterFactory.create())
                    .baseUrl("http://izzi.expange.com/rest/");

    public static ServicesInterface createService() {
        if (retrofit == null) {
            retrofit = builder.build();
        }
        return retrofit.create(ServicesInterface.class);
    }
}
