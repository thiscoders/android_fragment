package lg.android.fragmentpro;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by ye on 10/9/16.
 */

public class FuncFragment extends Fragment {
    private boolean flag=false;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_func,null);
        Button btn= (Button) view.findViewById(R.id.btn_change);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ShowFragment fragment= (ShowFragment) getActivity().getFragmentManager().findFragmentByTag("show");
                if(!flag){
                    fragment.changeText("change,啦啦啦！");
                    flag=true;
                }else {
                    fragment.changeText("哈哈哈！");
                    flag=false;
                }
            }
        });

        return view;
    }
}
