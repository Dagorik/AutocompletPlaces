package dagorik.mariachi.com.ohanahome.Presenter;

import android.content.Context;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import dagorik.mariachi.com.ohanahome.Interfaces.RowViewChart;
import dagorik.mariachi.com.ohanahome.Interfaces.RowViewHistory;
import dagorik.mariachi.com.ohanahome.Models.Compras.Buy;
import dagorik.mariachi.com.ohanahome.Models.Compras.Compra;
import dagorik.mariachi.com.ohanahome.Models.Porcentaje;
import io.reactivex.Observable;

/**
 * Created by Dagorik on 05/09/17.
 */

public class PresenterHistoryRV {

    List<Buy> buyList = new ArrayList<>();

    public PresenterHistoryRV(List<Buy> buyList) {
        this.buyList = buyList;

    }

    public void onBindRepositoryRowViewAtPosition(int position, RowViewHistory rowViewHistory) {


        rowViewHistory.setName(buyList.get(0).getCompra().get(position).getName());
        rowViewHistory.setCheck(buyList.get(0).getCompra().get(position).getCheck());
        rowViewHistory.setTotal(buyList.get(0).getCompra().get(position).getTotal());
        rowViewHistory.setDescription(buyList.get(0).getCompra().get(position).getDescription());
        rowViewHistory.setPersons(buyList.get(0).getCompra().get(position).getPerson());


    }

    public int getRepositoriesRowsCount() {
        return buyList.get(0).getCompra().size();
    }

}
