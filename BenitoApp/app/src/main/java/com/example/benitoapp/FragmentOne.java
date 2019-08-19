package com.example.benitoapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class FragmentOne extends Fragment {

    TextView t1,t2;


    public FragmentOne(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){

        View v = inflater.inflate(R.layout.fragmentone,container,false);
        t1=(TextView) v.findViewById(R.id.t1);
        t2=(TextView) v.findViewById(R.id.t2);
        Bundle bundle1=getArguments();
        String name=bundle1.getString("name");
        String company=bundle1.getString("company");

        t1.setText(name);
         t2.setText(company);
        return v;
    }
}
