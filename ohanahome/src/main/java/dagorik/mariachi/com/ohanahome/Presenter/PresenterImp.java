package dagorik.mariachi.com.ohanahome.Presenter;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import dagorik.mariachi.com.ohanahome.Adapters.GastosAdapter;
import dagorik.mariachi.com.ohanahome.Interactor.InteractorImp;
import dagorik.mariachi.com.ohanahome.Interfaces.IActivity;
import dagorik.mariachi.com.ohanahome.Interfaces.IPresenter;
import dagorik.mariachi.com.ohanahome.Interfaces.Interactor;
import dagorik.mariachi.com.ohanahome.Models.Porcentaje;
import dagorik.mariachi.com.ohanahome.Models.Porsentajes;
import dagorik.mariachi.com.ohanahome.Views.MainActivity;
import io.reactivex.Observable;

/**
 * Created by Dagorik on 25/08/17.
 */

public class PresenterImp implements IPresenter {
    Interactor interactor;
    IActivity activity;

    public PresenterImp(MainActivity mainActivity) {
        this.activity = mainActivity;
        interactor = new InteractorImp();
    }

    public PresenterImp() {
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

        List<Porcentaje> porcentajeList = new ArrayList<>();
        porcentajeList.add(data);

        Log.e("MyList", porcentajeList.toString());


        Observable.fromIterable(porcentajeList).flatMapIterable(x -> x.getPorsentajes()).subscribe(y -> stringList.add(y.getName()));
        Observable.fromIterable(porcentajeList).flatMapIterable(x -> x.getPorsentajes()).subscribe(y -> integerList.add(y.getPorsent()));

        PresenterRV presenterRV = new PresenterRV(porcentajeList);

        activity.setUpRecyclerView(presenterRV);


        activity.setUpViewPager(integerList, stringList);
    }

    @Override
    public void setData() {


    }

}
