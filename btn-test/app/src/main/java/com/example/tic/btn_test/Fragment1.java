package com.example.tic.btn_test;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.tic.btn_test.R;

/**
 * Created by tic on 21/12/16.
 */

public class Fragment1 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment1,container,false);
    }



    @Override
    public void onStart(){
        super.onStart();

        Button btn1 = (Button) getActivity().findViewById(R.id.btn1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView textView = (TextView) getActivity().findViewById(R.id.txtFrag2);

                textView.setText("Clicou né");
            }
        });

    }


}
