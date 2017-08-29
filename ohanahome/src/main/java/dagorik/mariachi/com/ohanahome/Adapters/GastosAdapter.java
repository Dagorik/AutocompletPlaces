package dagorik.mariachi.com.ohanahome.Adapters;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import dagorik.mariachi.com.ohanahome.Models.Porcentaje;
import dagorik.mariachi.com.ohanahome.R;
import dagorik.mariachi.com.ohanahome.Views.CharFragment;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;

/**
 * Created by Dagorik on 28/08/17.
 */

public class GastosAdapter extends RecyclerView.Adapter<GastosAdapter.ViewHolderGastos> {

    List<Porcentaje> porcentajeList = new ArrayList<>();
    List<Integer> integerList = new ArrayList<>();
    List<String> stringList = new ArrayList<>();


    public GastosAdapter(List<Porcentaje> porcentajeList) {
        this.porcentajeList = porcentajeList;

    }

    @Override
    public ViewHolderGastos onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_char, parent, false);

        Observable.fromIterable(porcentajeList).flatMapIterable(x -> x.getPorsentajes()).subscribe(y -> stringList.add(y.getName()));
        Observable.fromIterable(porcentajeList).flatMapIterable(x -> x.getPorsentajes()).subscribe(y -> integerList.add(y.getPorsent()));


        return new ViewHolderGastos(view, integerList, stringList);
    }

    @Override
    public void onBindViewHolder(ViewHolderGastos holder, int position) {

    }

    @Override
    public int getItemCount() {
        return porcentajeList.size();
    }

    class ViewHolderGastos extends RecyclerView.ViewHolder {

        public ViewHolderGastos(View itemView, List<Integer> integerList, List<String> stringList) {
            super(itemView);

        }

    }
}
