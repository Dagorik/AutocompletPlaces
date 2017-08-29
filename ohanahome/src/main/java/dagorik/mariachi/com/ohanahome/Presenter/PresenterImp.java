package dagorik.mariachi.com.ohanahome.Presenter;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

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


        Observable.fromIterable(data1).subscribe(name -> stringList.add(name.getName()));
        Observable.fromIterable(data1).subscribe(name -> integerList.add(name.getPorsent()));

        activity.setUpViewPager(integerList, stringList);
    }

    @Override
    public void setData() {


    }

}
