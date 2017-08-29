package dagorik.mariachi.com.ohanahome.Views;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import java.util.List;

import dagorik.mariachi.com.ohanahome.Interfaces.IActivity;
import dagorik.mariachi.com.ohanahome.Interfaces.IPresenter;
import dagorik.mariachi.com.ohanahome.Presenter.PresenterImp;
import dagorik.mariachi.com.ohanahome.R;
import dagorik.mariachi.com.ohanahome.Adapters.ViewPagerAdapter;

public class MainActivity extends AppCompatActivity implements IActivity {

    IPresenter presenter;
    TabLayout tabLayout;
    Toolbar toolbar;
    ViewPager viewPager;
    ViewPager viewPagerMonth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenter = new PresenterImp(this);

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
        adapter.addFragment(new CharFragment(porsent, name), "ESTADÍSTICAS");
        adapter.addFragment(new HistoryFragment(), "HISTORIAL");
        viewPager.setAdapter(adapter);
    }

    @Override
    public void setUpViewPagerMonth(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
    }


}
