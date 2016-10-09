package lg.android.fragmentpro;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by ye on 10/9/16.
 */

public class ShowFragment extends Fragment {

    private TextView tv_show;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_show,null);
        tv_show= (TextView) view.findViewById(R.id.tv_show);

        return view;
    }


    public void changeText(String content){
        tv_show.setText(content);
    }
}
