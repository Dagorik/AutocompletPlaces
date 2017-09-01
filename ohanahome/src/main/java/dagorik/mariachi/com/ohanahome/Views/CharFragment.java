package dagorik.mariachi.com.ohanahome.Views;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.NavUtils;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.intrusoft.scatter.ChartData;
import com.intrusoft.scatter.PieChart;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.LongFunction;

import dagorik.mariachi.com.ohanahome.Adapters.GastosAdapter;
import dagorik.mariachi.com.ohanahome.Interfaces.IFragmentChar;
import dagorik.mariachi.com.ohanahome.Interfaces.IPresenterMain;
import dagorik.mariachi.com.ohanahome.Presenter.PresenterMainMainImp;
import dagorik.mariachi.com.ohanahome.Presenter.PresenterMainRV;
import dagorik.mariachi.com.ohanahome.R;
import dagorik.mariachi.com.ohanahome.Adapters.ViewPagerAdapter;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;


/**
 * A simple {@link Fragment} subclass.
 */
public class CharFragment extends Fragment implements IFragmentChar {


    private RecyclerView recyclerView;
    IPresenterMain presenterMain;


    public CharFragment() {
        // Required empty public constructor
    }

    public CharFragment(IPresenterMain presenterMain) {
        this.presenterMain = presenterMain;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.e("ENTREEEE","ON CREATE");
        View view = inflater.inflate(R.layout.fragment_char, container, false);


        recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view_gastos);
        presenterMain.setRecycler();

        return view;
    }


    public void setUpViewPagerMonth(ViewPager viewPagerMonth) {
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getChildFragmentManager());
        viewPagerAdapter.addFragment(new MonthFragment(), "");
        viewPagerMonth.setAdapter(viewPagerAdapter);

    }





    @Override
    public void setColorNames(List<String> name) {

//
//        Observable.fromIterable(name).subscribe(text -> {
//
//            TextView myTextView = new TextView(getActivity());
//            ImageView myImageView = new ImageView(getActivity());
//
//            myTextView.setText("   " + text.toString());
//
//            myImageView.setBackgroundColor(Color.argb(255, rnd.nextInt(255), rnd.nextInt(255), rnd.nextInt(255)));
//
//            LinearLayout.LayoutParams parms = new LinearLayout.LayoutParams(50, 50);
//
//            myImageView.setLayoutParams(parms);
//
//            linearLayoutNames4 = new LinearLayout(getActivity());
//            LinearLayout.LayoutParams parmslin = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
//            linearLayoutNames4.setOrientation(LinearLayout.HORIZONTAL);
//            linearLayoutNames4.setLayoutParams(parmslin);
//
//            if (bol) {
//                linearLayoutNames4.addView(myImageView);
//                linearLayoutNames4.addView(myTextView);
//                linearLayoutNames2.addView(linearLayoutNames4);
//
//                bol = false;
//            } else {
//                linearLayoutNames4.addView(myImageView);
//                linearLayoutNames4.addView(myTextView);
//                linearLayoutNames3.addView(linearLayoutNames4);
//                bol = true;
//            }
//
//        });


    }


    @Override
    public void setUpRecyclerView(PresenterMainRV presenterMainRV) {

        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);

        GastosAdapter gastosAdaptador = new GastosAdapter(presenterMainRV);

        recyclerView.setAdapter(gastosAdaptador);
    }


}

