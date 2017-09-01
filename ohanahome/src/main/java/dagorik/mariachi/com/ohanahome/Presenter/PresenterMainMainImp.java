package dagorik.mariachi.com.ohanahome.Presenter;

import android.content.Context;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import dagorik.mariachi.com.ohanahome.Interactor.InteractorImp;
import dagorik.mariachi.com.ohanahome.Interfaces.IActivityMain;
import dagorik.mariachi.com.ohanahome.Interfaces.IFragmentChar;
import dagorik.mariachi.com.ohanahome.Interfaces.IPresenterMain;
import dagorik.mariachi.com.ohanahome.Interfaces.Interactor;
import dagorik.mariachi.com.ohanahome.Models.Porcentaje;
import dagorik.mariachi.com.ohanahome.Models.Porsentajes;
import dagorik.mariachi.com.ohanahome.Views.MainActivityMain;
import io.reactivex.Observable;

/**
 * Created by Dagorik on 25/08/17.
 */

public class PresenterMainMainImp implements IPresenterMain {
    Interactor interactor;
    IActivityMain activity;
    List<Porcentaje> porcentajeList = new ArrayList<>();


    public PresenterMainMainImp(MainActivityMain mainActivity) {
        this.activity = mainActivity;
        interactor = new InteractorImp();
    }

    public PresenterMainMainImp() {
    }


    @Override
    public void drawBar() {
        getPorsent();
    }

    @Override
    public void getPorsent() {

        Porcentaje data = interactor.getDataFromAPI();

        List<Porsentajes> data1 = data.getPorsentajes();
        List<String> stringList = new ArrayList<>();
        List<Integer> integerList = new ArrayList<>();

        porcentajeList.add(data);

        Log.e("MyList", porcentajeList.toString());


        Observable.fromIterable(porcentajeList).flatMapIterable(x -> x.getPorsentajes()).subscribe(y -> stringList.add(y.getName()));
        Observable.fromIterable(porcentajeList).flatMapIterable(x -> x.getPorsentajes()).subscribe(y -> integerList.add(y.getPorsent()));


        activity.setUpViewPager(integerList, stringList);

        //activity.setUpRecyclerView(presenterMainRV);
        //Log.e("MyLoguin", "Apunto de ejecutar el rv");

    }

    @Override
    public void setRecycler() {
        Log.e("MyLOgR",porcentajeList.toString());
        PresenterMainRV presenterMainRV = new PresenterMainRV(porcentajeList);
        activity.setUpRecyclerView(presenterMainRV);

    }

}
