package batch16.android.devf.com.caluclos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import batch16.android.devf.com.caluclos.DataBase.Data;
import batch16.android.devf.com.caluclos.DataBase.ServiceRealm;
import batch16.android.devf.com.caluclos.ModelCalculos.Tap;
import batch16.android.devf.com.caluclos.ModelCalculos.Tec;
import io.realm.Realm;
import io.realm.RealmConfiguration;

public class MainActivity extends AppCompatActivity {

    ServiceRealm serviceRealm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Realm.init(this);

        RealmConfiguration realmConfiguration = new RealmConfiguration.Builder()
                .name("Test") //Nombre de la base de datos
                .schemaVersion(1) //Numero de version de la base de datos
                //.deleteRealmIfMigrationNeeded()
                .build(); //Construye con las configuraciones establecidas
        Realm.setDefaultConfiguration(realmConfiguration);
        serviceRealm = new ServiceRealm(Realm.getDefaultInstance());
        Data data = new Data();
        String[] myStringArray = data.getAllData();
        cargarDatos(myStringArray);


        calcularPerdidas("136", "15", "104", "15", "T12", "35", "RG11", 80);

    }

    public void calcularPerdidas(String canalCaja, String potenciaCaja, String canalDW, String potenciaDW, String canalUP, String potenciaUP, String cable, int metros) {
        Tap cajaDigital = new Tap(canalCaja, potenciaCaja);
        Tap dw = new Tap(canalDW, potenciaDW);
        Tap up = new Tap(canalUP, potenciaUP);
        Tec tec = new Tec(cajaDigital, dw, up, Realm.getDefaultInstance());

        double[] resultados = tec.calcularAtenucacion(cable, metros);

        Log.e("Caja digital", resultados[0] + "");
        Log.e("DW", resultados[1] + "");
        Log.e("UP", resultados[2] + "");

        double[] potencias = tec.obtenerPotencia(resultados[0], resultados[1], resultados[2]);

        Log.e("Caja digital", potencias[0] + "");
        Log.e("DW", potencias[1] + "");
        Log.e("UP", potencias[2] + "");

    }


    public void cargarDatos(String[] myStringArray) {

        int contador = 0;
        for (int i = 0; i < myStringArray.length; i++) {
            contador = contador + 1;
            if (contador == 4) {
                String uno = myStringArray[i - 3];
                String dos = myStringArray[i - 2];
                String tres = myStringArray[i - 1];
                String cuatro = myStringArray[i];
                serviceRealm.cargarData(String.valueOf(i), uno, dos, tres, cuatro);
                contador = 0;
            }
        }

    }


}
