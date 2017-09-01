package dagorik.mariachi.com.ohanahome.Adapters.ViewHolders;

import android.graphics.Color;
import android.inputmethodservice.Keyboard;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.intrusoft.scatter.ChartData;
import com.intrusoft.scatter.PieChart;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import dagorik.mariachi.com.ohanahome.Interfaces.RowView;
import dagorik.mariachi.com.ohanahome.R;
import io.reactivex.Observable;

/**
 * Created by Dagorik on 29/08/17.
 */

public class ViewHolderGastos extends RecyclerView.ViewHolder implements RowView {

    TextView tvName;
    List<Integer> porsent = new ArrayList<>();
    List<String> name = new ArrayList<>();
    private List<ChartData> data = new ArrayList<>();
    Random rnd = new Random();
    private PieChart pieChart;
    private ViewPager mViewPager;
    private LinearLayout linearLayoutNames;
    private LinearLayout linearLayoutNames2;
    private ViewPager upViewPagerMonth;
    private LinearLayout linearLayoutNames3;
    private LinearLayout linearLayoutNames4;
    boolean bol = true;
    private RecyclerView recyclerView;


    public ViewHolderGastos(View itemView) {
        super(itemView);

        pieChart = (PieChart) itemView.findViewById(R.id.pie_chart);
        //mViewPager = (ViewPager) itemView.findViewById(R.id.vp_month);
        linearLayoutNames = itemView.findViewById(R.id.ll_color_names);
        linearLayoutNames2 = itemView.findViewById(R.id.ll_color_names2);
        linearLayoutNames3 = itemView.findViewById(R.id.ll_color_names3);
        recyclerView = (RecyclerView) itemView.findViewById(R.id.recycler_view_gastos);
        tvName = itemView.findViewById(R.id.tv_name);
    }


    @Override
    public void setTitleRv(String title) {
        tvName.setText(title);
    }

    @Override
    public void setStarCountRv(int starCount) {
    }

    @Override
    public void drawChar(List<Integer> porsent) {
        Log.e("MyLogDraw",porsent.toString());
        Observable.fromIterable(porsent).subscribe(integer ->
                data.add(new ChartData(integer + "%", integer, Color.WHITE,
                        Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256)))));

        pieChart.setChartData(data);
    }
}
