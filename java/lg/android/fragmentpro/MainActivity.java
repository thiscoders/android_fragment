package lg.android.fragmentpro;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout func= (LinearLayout) findViewById(R.id.ll_func);
        LinearLayout show= (LinearLayout) findViewById(R.id.ll_show);

        FragmentManager manager=getFragmentManager();

        FragmentTransaction transaction=manager.beginTransaction();

        transaction.replace(R.id.ll_func,new FuncFragment(),"func");
        transaction.replace(R.id.ll_show,new ShowFragment(),"show");

        transaction.commit();

    }
}
