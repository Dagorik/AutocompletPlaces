package dagorik.mariachi.com.ohanahome.Adapters.ViewHolders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import dagorik.mariachi.com.ohanahome.Interfaces.RowViewHistory;
import dagorik.mariachi.com.ohanahome.R;

/**
 * Created by Dagorik on 05/09/17.
 */

public class ViewHolderHistory extends RecyclerView.ViewHolder implements RowViewHistory {

    TextView tvNameMonthBuy, nameStoreBuy, tvPersonNumber, tvNumberCheck, tvPriceTotal;

    public ViewHolderHistory(View itemView) {
        super(itemView);

        tvNameMonthBuy = (TextView) itemView.findViewById(R.id.tv_name_month_buy);
        nameStoreBuy = (TextView) itemView.findViewById(R.id.name_store_buy);
        tvPersonNumber = (TextView) itemView.findViewById(R.id.tv_person_number);
        tvNumberCheck = (TextView) itemView.findViewById(R.id.tv_number_check);
        tvPriceTotal = (TextView) itemView.findViewById(R.id.tv_price_total);

    }


    @Override
    public void setName(String name) {
        tvNameMonthBuy.setText(name);
    }

    @Override
    public void setDescription(String description) {
        nameStoreBuy.setText(description);
    }

    @Override
    public void setPersons(String persons) {
        tvPersonNumber.setText(persons);
    }

    @Override
    public void setCheck(String check) {
        tvNumberCheck.setText(check);
    }

    @Override
    public void setTotal(String total) {
        tvPriceTotal.setText("$" + total);
    }
}
