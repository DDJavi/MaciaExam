package com.example.maciaexam;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;


public class FragmentView extends Fragment {
    Comunicacion comunicado = null;
    View main;
    TextView text = null;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        main = inflater.inflate(R.layout.fragment_view, container, false);
        text = (TextView) main.findViewById(R.id.textV);
        return main;
    }
    public void editarTexto(String texto, int size){
        text.setText(texto);
        text.setTextSize(size);
    }

    public void editarColor(int color){
        text.setTextColor(color);
    }
}

