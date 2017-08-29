package dagorik.mariachi.com.ohanahome.Adapters;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import dagorik.mariachi.com.ohanahome.Adapters.ViewHolders.ViewHolderGastos;
import dagorik.mariachi.com.ohanahome.Interfaces.IPresenter;
import dagorik.mariachi.com.ohanahome.Interfaces.RVPresenter;
import dagorik.mariachi.com.ohanahome.Models.Porcentaje;
import dagorik.mariachi.com.ohanahome.Presenter.PresenterImp;
import dagorik.mariachi.com.ohanahome.Presenter.PresenterRV;
import dagorik.mariachi.com.ohanahome.R;
import dagorik.mariachi.com.ohanahome.Views.CharFragment;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;

/**
 * Created by Dagorik on 28/08/17.
 */

public class GastosAdapter extends RecyclerView.Adapter<ViewHolderGastos> {

    PresenterRV presenter;

    public GastosAdapter(PresenterRV presenter) {
        this.presenter = presenter;

    }

    @Override
    public ViewHolderGastos onCreateViewHolder(ViewGroup parent, int viewType) {

        return new ViewHolderGastos(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_char, parent, false));
    }

    @Override
    public void onBindViewHolder(ViewHolderGastos holder, int position) {
        presenter.onBindRepositoryRowViewAtPosition(position, holder);

    }

    @Override
    public int getItemCount() {
        Log.e("MyLogCount",presenter.getRepositoriesRowsCount() + "");
        return presenter.getRepositoriesRowsCount();

    }
}
