package dagorik.mariachi.com.bottomsheet;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.design.widget.BottomSheetDialogFragment;


/**
 * Created by Dagorik on 14/07/17.
 */

public class MiBottomSheetDialogFragment extends BottomSheetDialogFragment {

    static MiBottomSheetDialogFragment newInstance() {
        return new MiBottomSheetDialogFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.bs_dialog_fragment, container, false);
        return v;
    }
}
