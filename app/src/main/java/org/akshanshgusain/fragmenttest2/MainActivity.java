package org.akshanshgusain.fragmenttest2;

import android.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    public static android.support.v4.app.FragmentManager fragmentManager;
    public HomeFragment homefragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentManager =getSupportFragmentManager();
        homefragment=new HomeFragment();

        if(findViewById(R.id.container)!=null){



            if(savedInstanceState!=null){
                return;
            }
            FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
            fragmentTransaction.add(R.id.container,homefragment,null);
            fragmentTransaction.commit();
        }
    }
}
