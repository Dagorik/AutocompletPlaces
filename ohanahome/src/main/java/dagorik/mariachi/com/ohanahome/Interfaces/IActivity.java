package dagorik.mariachi.com.ohanahome.Interfaces;

import android.support.v4.view.ViewPager;

import java.util.List;

/**
 * Created by Dagorik on 25/08/17.
 */

public interface IActivity {


    void setUpViewPagerMonth(ViewPager viewPager);

    void setUpViewPager(List<Integer> porsent, List<String> name);
}