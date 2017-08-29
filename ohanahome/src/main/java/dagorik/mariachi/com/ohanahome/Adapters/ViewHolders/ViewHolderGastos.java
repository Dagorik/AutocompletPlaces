package dagorik.mariachi.com.ohanahome.Adapters.ViewHolders;

import android.inputmethodservice.Keyboard;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import dagorik.mariachi.com.ohanahome.Interfaces.RowView;
import dagorik.mariachi.com.ohanahome.R;

/**
 * Created by Dagorik on 29/08/17.
 */

public class ViewHolderGastos extends RecyclerView.ViewHolder implements RowView {

    TextView tvName;

    public ViewHolderGastos(View itemView) {
        super(itemView);

        tvName = itemView.findViewById(R.id.tv_name);
    }


    @Override
    public void setTitleRv(String title) {
        tvName.setText(title);
    }

    @Override
    public void setStarCountRv(int starCount) {
        Log.e("MyLogCount", starCount + "");
    }
}
