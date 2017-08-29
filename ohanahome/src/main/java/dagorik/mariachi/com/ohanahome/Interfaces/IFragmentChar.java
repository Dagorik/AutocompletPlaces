package dagorik.mariachi.com.ohanahome.Interfaces;

import com.intrusoft.scatter.ChartData;

import java.util.List;

/**
 * Created by Dagorik on 25/08/17.
 */

public interface IFragmentChar {

    void drawnChart(List<ChartData> data);

    void setColorNames(List<String> name);
}
