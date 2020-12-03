package com.example.maciaexam;

import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.SeekBar;


public class FragmentColor extends Fragment {
    Comunicacion comunicado = null;

    private SeekBar rC=null;
    private SeekBar gC=null;
    private SeekBar bC=null;
    private Button button=null;
    View main;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        main = inflater.inflate(R.layout.fragment_color, container, false);
        rC = main.findViewById(R.id.seekBarRed);
        gC = main.findViewById(R.id.seekBarGreen);
        bC = main.findViewById(R.id.seekBarBlue);
        button = main.findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    comunicado.cambiarColor(Color.argb(255,
                            rC.getProgress(),
                            gC.getProgress(),
                            bC.getProgress()));

            }
        });
        return main;
    }

}