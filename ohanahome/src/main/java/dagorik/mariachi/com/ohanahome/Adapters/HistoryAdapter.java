package dagorik.mariachi.com.ohanahome.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import dagorik.mariachi.com.ohanahome.Adapters.ViewHolders.ViewHolderHistory;
import dagorik.mariachi.com.ohanahome.Presenter.PresenterHistoryRV;
import dagorik.mariachi.com.ohanahome.R;

/**
 * Created by Dagorik on 05/09/17.
 */

public class HistoryAdapter extends RecyclerView.Adapter<ViewHolderHistory> {

    PresenterHistoryRV presenter;
    private Context context;


    public HistoryAdapter(PresenterHistoryRV presenter) {
        this.presenter = presenter;

    }

    @Override
    public ViewHolderHistory onCreateViewHolder(ViewGroup parent, int viewType) {
        context = parent.getContext();
        return new ViewHolderHistory(LayoutInflater.from(context).inflate(R.layout.item_history, parent, false));
    }

    @Override
    public void onBindViewHolder(ViewHolderHistory holder, int position) {
        presenter.onBindRepositoryRowViewAtPosition(position, holder);

    }

    @Override
    public int getItemCount() {
        return presenter.getRepositoriesRowsCount();
    }
}
