package dagorik.mariachi.com.ohanahome.Presenter;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;


import dagorik.mariachi.com.ohanahome.Interfaces.RowView;
import dagorik.mariachi.com.ohanahome.Models.Porcentaje;
import dagorik.mariachi.com.ohanahome.Models.Porsentajes;
import io.reactivex.Observable;

/**
 * Created by Dagorik on 29/08/17.
 */

public class PresenterMainRV {

    List<Porcentaje> porcentajeList = new ArrayList<>();

    public PresenterMainRV(List<Porcentaje> porcentajeList) {
        this.porcentajeList = porcentajeList;
    }

    public PresenterMainRV() {
    }

    public void onBindRepositoryRowViewAtPosition(int position, RowView rowView) {
        List<Integer> porsent = new ArrayList<>();
        Porcentaje porcentaje = porcentajeList.get(0);

        Observable.fromIterable(porcentajeList).flatMapIterable(x -> x.getPorsentajes()).subscribe(y -> porsent.add(y.getPorsent()));

        rowView.setStarCountRv(porcentaje.getPorsentajes().get(position).getPorsent());
        rowView.setTitleRv(porcentaje.getPorsentajes().get(position).getName());
        porcentaje.getPorsentajes().get(position).getPorsent();
        rowView.drawChar(porsent);
    }

    public int getRepositoriesRowsCount() {
        return porcentajeList.get(0).getPorsentajes().size();
    }

}

