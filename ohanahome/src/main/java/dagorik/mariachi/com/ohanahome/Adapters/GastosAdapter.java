package dagorik.mariachi.com.ohanahome.Adapters;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Dagorik on 28/08/17.
 */

public class GastosAdapter extends RecyclerView.Adapter<GastosAdapter.ViewHolderGastos> {


    @Override
    public ViewHolderGastos onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(ViewHolderGastos holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class ViewHolderGastos extends RecyclerView.ViewHolder {

        public ViewHolderGastos(View itemView) {
            super(itemView);
        }
    }
}
