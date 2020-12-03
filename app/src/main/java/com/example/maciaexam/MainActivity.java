package com.example.maciaexam;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import static com.example.maciaexam.R.id.fragmentcolor;
import static com.example.maciaexam.R.id.fragmenttext;
import static com.example.maciaexam.R.id.fragmentview;

public class MainActivity extends AppCompatActivity implements Comunicacion{

    private FragmentText fT = null;
    private FragmentColor fC = null;
    private FragmentView fV = null;

    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_main);

        fT = (FragmentText) getSupportFragmentManager().findFragmentById(fragmenttext);
        fT.comunicado = this;
        fV = (FragmentView) getSupportFragmentManager().findFragmentById(fragmentview);
        fC = (FragmentColor) getSupportFragmentManager().findFragmentById(fragmentcolor);
        fC.comunicado = this;

    }

    @Override
    public void cambiarTexto(String text, int size){
        fV.editarTexto(text, size);
    }

    @Override
    public void cambiarColor(int color){
        fV.editarColor(color);
    }
}