package dagorik.mariachi.com.ohanahome.Interfaces;

import java.util.List;

/**
 * Created by Dagorik on 29/08/17.
 */

public interface RowView {

    void setTitleRv(String title);
    void setStarCountRv(int starCount);
    void drawChar(List<Integer> porsent);
}
