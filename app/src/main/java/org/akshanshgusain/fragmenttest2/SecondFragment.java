package org.akshanshgusain.fragmenttest2;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import static org.akshanshgusain.fragmenttest2.MainActivity.fragmentManager;


/**
 * A simple {@link Fragment} subclass.
 */
public class SecondFragment extends Fragment {
  Button button;

    public SecondFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_second, container, false);
        button=(Button)view.findViewById(R.id.b3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentManager.beginTransaction().replace(R.id.container,new HomeFragment(),null).commit();
            }
        });
        return view;
    }

}
