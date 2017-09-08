package batch16.android.devf.com.peticiones.api;

import batch16.android.devf.com.peticiones.ModelResponse.CommonUsuarioGetIdResponse;
import batch16.android.devf.com.peticiones.ModelResponse.MovilBDGetResponse.MovilBDGetResponse;
import batch16.android.devf.com.peticiones.ModelResponse.MovilOrdenInsertResponse;
import batch16.android.devf.com.peticiones.ModelSend.CommonUsuarioGetId;
import batch16.android.devf.com.peticiones.ModelSend.MovilBDGet;
import batch16.android.devf.com.peticiones.ModelSend.MovilOrdenInsert.MovilOrdenInsert;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by Dagorik on 08/09/17.
 */

public interface ServicesInterface {

    @POST("commonUsuarioGetId.ashx")
    Call<CommonUsuarioGetIdResponse> login(@Body CommonUsuarioGetId commonUsuarioGetId);

    @POST("movilBDGet.ashx")
    Call<MovilBDGetResponse> getBD(@Body MovilBDGet movilBDGet);

    @POST("movilOrdenInsert.ashx")
    Call<MovilOrdenInsertResponse> insertOrder(@Body MovilOrdenInsert movilOrdenInsert);

}
