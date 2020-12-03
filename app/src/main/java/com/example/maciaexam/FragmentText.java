package com.example.maciaexam;

import android.app.Activity;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;


public class FragmentText extends Fragment{

    public Comunicacion comunicado = null;

    private EditText edit;
    private Button button;
    private SeekBar sB;
    View main;

    @Override
    public  View onCreateView(LayoutInflater inflater, ViewGroup container,
                              Bundle savedInstanceState){
        main = inflater.inflate(R.layout.fragment_text,container, false);

        edit =(EditText) main.findViewById(R.id.editText);
        button =(Button) main.findViewById(R.id.changeText);
        sB =(SeekBar) main.findViewById(R.id.seekBarText);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (comunicado != null){
                    comunicado.cambiarTexto(String.valueOf(edit.getText()),sB.getProgress());
                }
            }
        });
        return main;
    }



}