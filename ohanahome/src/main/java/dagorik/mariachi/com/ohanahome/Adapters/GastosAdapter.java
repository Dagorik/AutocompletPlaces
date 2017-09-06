package dagorik.mariachi.com.ohanahome.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import dagorik.mariachi.com.ohanahome.Adapters.ViewHolders.ViewChartHolderGastos;
import dagorik.mariachi.com.ohanahome.Presenter.PresenterMainRV;
import dagorik.mariachi.com.ohanahome.R;

/**
 * Created by Dagorik on 28/08/17.
 */

public class GastosAdapter extends RecyclerView.Adapter<ViewChartHolderGastos> {

    PresenterMainRV presenter;
    private Context context;


    public GastosAdapter(PresenterMainRV presenter) {
        this.presenter = presenter;

    }

    @Override
    public ViewChartHolderGastos onCreateViewHolder(ViewGroup parent, int viewType) {
        context = parent.getContext();
        return new ViewChartHolderGastos(LayoutInflater.from(context).inflate(R.layout.item_char, parent, false));
    }

    @Override
    public void onBindViewHolder(ViewChartHolderGastos holder, int position) {
        presenter.onBindRepositoryRowViewAtPosition(position, holder, context);

    }

    @Override
    public int getItemCount() {
        return presenter.getRepositoriesRowsCount();

    }
}
