package dagorik.mariachi.com.ohanahome.Views;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import dagorik.mariachi.com.ohanahome.Adapters.GastosAdapter;
import dagorik.mariachi.com.ohanahome.Adapters.HistoryAdapter;
import dagorik.mariachi.com.ohanahome.Interfaces.IFragmentChar;
import dagorik.mariachi.com.ohanahome.Interfaces.IFragmentHIsotry;
import dagorik.mariachi.com.ohanahome.Interfaces.IPresenterMain;
import dagorik.mariachi.com.ohanahome.Presenter.PresenterHistoryRV;
import dagorik.mariachi.com.ohanahome.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class HistoryFragment extends Fragment implements IFragmentHIsotry {

    private RecyclerView recyclerView;
    IPresenterMain presenterMain;


    public HistoryFragment() {
        // Required empty public constructor
    }


    public HistoryFragment(IPresenterMain presenterMain) {
        this.presenterMain = presenterMain;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_history, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view_gastos);
        presenterMain.setRecyclerHistory();
        Log.e("Ya me cree","entreeee");
        return view;
    }

    @Override
    public void setUpRecyclerView(PresenterHistoryRV presenterHistoryRV) {

        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);

        HistoryAdapter historyAdapter = new HistoryAdapter(presenterHistoryRV);

        recyclerView.setAdapter(historyAdapter);

    }
}
