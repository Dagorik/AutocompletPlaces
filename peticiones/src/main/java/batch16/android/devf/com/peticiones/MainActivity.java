package batch16.android.devf.com.peticiones;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.LockSupport;

import batch16.android.devf.com.peticiones.ModelResponse.CommonUsuarioGetIdResponse;
import batch16.android.devf.com.peticiones.ModelResponse.MovilBDGetResponse.MovilBDGetResponse;
import batch16.android.devf.com.peticiones.ModelResponse.MovilOrdenInsertResponse;
import batch16.android.devf.com.peticiones.ModelSend.CommonUsuarioGetId;
import batch16.android.devf.com.peticiones.ModelSend.MovilBDGet;
import batch16.android.devf.com.peticiones.ModelSend.MovilOrdenInsert.Canales;
import batch16.android.devf.com.peticiones.ModelSend.MovilOrdenInsert.MovilOrdenInsert;
import batch16.android.devf.com.peticiones.ModelSend.MovilOrdenInsert.Pasivos;
import batch16.android.devf.com.peticiones.api.ServiceGenerator;
import batch16.android.devf.com.peticiones.api.ServicesInterface;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    ServicesInterface servicesInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        servicesInterface = ServiceGenerator.createService();

        //login();
        //getDB();
        insertarOrden();

    }

    private void insertarOrden() {

        List<Canales> canalesList = new ArrayList<>();
        List<Pasivos> pasivosList = new ArrayList<>();

        Canales canales = new Canales();
        canales.setGuidCanal("0d15d56c-0bee-4d00-a2c1-149a16e787ef"); //DATO PROVENIENTE DE getDB
        canales.setGuidCodificador("18550922-8228-4d1d-b478-26c6af03bc5b");//DATO PROVENIENTE DE getDB
        canales.setPotenciaInicial(17.4);
        canales.setPotenciaFinal(20.0);
        canales.setTotalPerdidas(3);


        Pasivos pasivos = new Pasivos();
        pasivos.setGuidPasivo("ee7ce952-f51c-48b6-8747-d0862fc6664d"); //DATO PROVENIENTE DE getDB


        pasivosList.add(pasivos);
        canalesList.add(canales);


        MovilOrdenInsert movilOrdenInsert = new MovilOrdenInsert();
        movilOrdenInsert.setClvTipoOrden(1);// 1 = MANTENIMIENTO, 2= INSTALACION
        movilOrdenInsert.setGuidUsuario("698fafb9-ad30-4bdc-b7cf-4b1ef25ca9d6"); //DATO PROVENIENTE DE login
        movilOrdenInsert.setNumero(13);
        movilOrdenInsert.setImagen("3sfgfrctvycrtcrctvcrrc7g6f5df6g7h65ftg6f5g676f5h7g6f57h6crtvycr7g6f57h");//IMAGEN EN BASE 64
        movilOrdenInsert.setMetrosRG6(15.5);
        movilOrdenInsert.setMetrosRG11(20.5);
        movilOrdenInsert.setCanales(canalesList);
        movilOrdenInsert.setPasivos(pasivosList);

        Log.e("MyLog", movilOrdenInsert.toString());

        servicesInterface.insertOrder(movilOrdenInsert).enqueue(new Callback<MovilOrdenInsertResponse>() {
            @Override
            public void onResponse(Call<MovilOrdenInsertResponse> call, Response<MovilOrdenInsertResponse> response) {
                Log.e("Response", response.body().getSuccess() + "");

            }

            @Override
            public void onFailure(Call<MovilOrdenInsertResponse> call, Throwable t) {
                Log.e("Response", t.getMessage());

            }
        });


    }

    private void getDB() {

        MovilBDGet movilBDGet = new MovilBDGet();
        movilBDGet.setGuidUsuario("698fafb9-ad30-4bdc-b7cf-4b1ef25ca9d6");

        servicesInterface.getBD(movilBDGet).enqueue(new Callback<MovilBDGetResponse>() {
            @Override
            public void onResponse(Call<MovilBDGetResponse> call, Response<MovilBDGetResponse> response) {
                Log.e("Response", response.body().getConfiguraciones().getNivelMaximoBajada() + "");
            }

            @Override
            public void onFailure(Call<MovilBDGetResponse> call, Throwable t) {
                Log.e("Response", t.getMessage());
            }
        });

    }

    private void login() {
        CommonUsuarioGetId commonUsuarioGetId = new CommonUsuarioGetId();
        commonUsuarioGetId.setUsr("hls1234");
        commonUsuarioGetId.setPwd("935adc2bfa4c11b2fad3a0cba2ab85a6");
        commonUsuarioGetId.setDispositivo("Información del celular");

        servicesInterface.login(commonUsuarioGetId).enqueue(new Callback<CommonUsuarioGetIdResponse>() {
            @Override
            public void onResponse(Call<CommonUsuarioGetIdResponse> call, Response<CommonUsuarioGetIdResponse> response) {
                Log.e("Response", response.body().getGuidUsuario());
            }

            @Override
            public void onFailure(Call<CommonUsuarioGetIdResponse> call, Throwable t) {
                Log.e("Response", t.getMessage());

            }
        });

    }


}
