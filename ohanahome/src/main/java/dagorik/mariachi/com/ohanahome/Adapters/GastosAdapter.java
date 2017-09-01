package dagorik.mariachi.com.ohanahome.Adapters;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import dagorik.mariachi.com.ohanahome.Adapters.ViewHolders.ViewHolderGastos;
import dagorik.mariachi.com.ohanahome.Presenter.PresenterMainRV;
import dagorik.mariachi.com.ohanahome.R;

/**
 * Created by Dagorik on 28/08/17.
 */

public class GastosAdapter extends RecyclerView.Adapter<ViewHolderGastos> {

    PresenterMainRV presenter;


    public GastosAdapter(PresenterMainRV presenter) {
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
        return presenter.getRepositoriesRowsCount();

    }
}
