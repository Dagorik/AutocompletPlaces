package dagorik.mariachi.com.ohanahome.Views;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import java.util.List;

import dagorik.mariachi.com.ohanahome.Interfaces.IActivityMain;
import dagorik.mariachi.com.ohanahome.Interfaces.IFragmentChar;
import dagorik.mariachi.com.ohanahome.Interfaces.IFragmentHIsotry;
import dagorik.mariachi.com.ohanahome.Interfaces.IPresenterMain;
import dagorik.mariachi.com.ohanahome.Presenter.PresenterHistoryRV;
import dagorik.mariachi.com.ohanahome.Presenter.PresenterMainMainImp;
import dagorik.mariachi.com.ohanahome.Presenter.PresenterMainRV;
import dagorik.mariachi.com.ohanahome.R;
import dagorik.mariachi.com.ohanahome.Adapters.ViewPagerAdapter;

public class MainActivityMain extends AppCompatActivity implements IActivityMain {

    IPresenterMain presenter;
    TabLayout tabLayout;
    Toolbar toolbar;
    ViewPager viewPager;
    private IFragmentChar fragmentChar;
    private IFragmentHIsotry fragmentHistory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenter = new PresenterMainMainImp(this);


        fragmentChar = new CharFragment(presenter);
        fragmentHistory = new HistoryFragment(presenter);


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
        adapter.addFragment((Fragment) fragmentChar, "ESTADÍSTICAS");
        adapter.addFragment((Fragment) fragmentHistory, "HISTORIAL");
        viewPager.setAdapter(adapter);
    }

    @Override
    public void setUpViewPagerMonth(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
    }

    @Override
    public void setUpRecyclerView(PresenterMainRV presenterMainRV) {
        fragmentChar.setUpRecyclerView(presenterMainRV);


    }

    @Override
    public void setUpRecyclerViewHis(PresenterHistoryRV presenterHistoryRV) {
        fragmentHistory.setUpRecyclerView(presenterHistoryRV);
    }
}
