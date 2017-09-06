package dagorik.mariachi.com.ohanahome.Presenter;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;


import dagorik.mariachi.com.ohanahome.Interfaces.RowViewChart;
import dagorik.mariachi.com.ohanahome.Models.Porcentaje;
import io.reactivex.Observable;

/**
 * Created by Dagorik on 29/08/17.
 */

public class PresenterMainRV {

    List<Porcentaje> porcentajeList = new ArrayList<>();

    public PresenterMainRV(List<Porcentaje> porcentajeList) {
        this.porcentajeList = porcentajeList;
    }

    public void onBindRepositoryRowViewAtPosition(int position, RowViewChart rowViewChart, Context context) {
        List<Integer> porsent = new ArrayList<>();
        List<String> names = new ArrayList<>();

        Porcentaje porcentaje = porcentajeList.get(0);

        Observable.fromIterable(porcentajeList).flatMapIterable(x -> x.getPorsentajes()).subscribe(y -> porsent.add(y.getPorsent()));
        Observable.fromIterable(porcentajeList).flatMapIterable(x -> x.getPorsentajes()).subscribe(y -> names.add(y.getName()));

        rowViewChart.setStarCountRv(porcentaje.getPorsentajes().get(position).getPorsent());
        rowViewChart.setTitleRv(porcentaje.getPorsentajes().get(position).getName());
        rowViewChart.drawChar(porsent);
        rowViewChart.setColorNames(names, context);

    }

    public int getRepositoriesRowsCount() {
        return porcentajeList.get(0).getPorsentajes().size();
    }

}

