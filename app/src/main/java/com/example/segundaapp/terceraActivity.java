package com.example.segundaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class terceraActivity extends AppCompatActivity {
    private TextView mensajef;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tercera);
        inicializarVista();
    }

    private void inicializarVista(){
        mensajef = findViewById(R.id.TBFinal);
        String men = getIntent().getStringExtra("mensaje");
        mensajef.setText(men);
    }
}