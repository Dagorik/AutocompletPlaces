package dagorik.mariachi.com.ohanahome.Views;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;

import java.util.List;

import dagorik.mariachi.com.ohanahome.Adapters.GastosAdapter;
import dagorik.mariachi.com.ohanahome.Interfaces.IActivityMain;
import dagorik.mariachi.com.ohanahome.Interfaces.IFragmentChar;
import dagorik.mariachi.com.ohanahome.Interfaces.IPresenterMain;
import dagorik.mariachi.com.ohanahome.Interfaces.IPresenterMainRV;
import dagorik.mariachi.com.ohanahome.Presenter.PresenterMainMainImp;
import dagorik.mariachi.com.ohanahome.Presenter.PresenterMainRV;
import dagorik.mariachi.com.ohanahome.R;
import dagorik.mariachi.com.ohanahome.Adapters.ViewPagerAdapter;

public class MainActivityMain extends AppCompatActivity implements IActivityMain {

    IPresenterMain presenter;
    TabLayout tabLayout;
    Toolbar toolbar;
    ViewPager viewPager;
    private IFragmentChar fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenter = new PresenterMainMainImp(this);


        fragment = new CharFragment(presenter);


        presenter.drawBar();


        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("OhanaHome");
        setSupportActionBar(toolbar);

        tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(viewPager);

    }

    @Override
    public void setUpViewPager(List<Integer> porsent, List<String> name) {
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment((Fragment) fragment, "ESTADÍSTICAS");
        adapter.addFragment(new HistoryFragment(), "HISTORIAL");
        viewPager.setAdapter(adapter);
    }

    @Override
    public void setUpViewPagerMonth(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
    }

    @Override
    public void setUpRecyclerView(PresenterMainRV presenterMainRV) {
        fragment.setUpRecyclerView(presenterMainRV);

    }
}
