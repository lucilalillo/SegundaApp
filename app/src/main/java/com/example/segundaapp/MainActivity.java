package com.example.segundaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button btsig;
    private EditText msj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicializarVista();
    }

    private void inicializarVista(){
        btsig = (Button) findViewById(R.id.BTSiguiente1);
        msj = (EditText) findViewById(R.id.ETEntrada);
        btsig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Aquí efectuamos la acción al presionar el botón
                Intent intent = new Intent(MainActivity.this, segundaActivity.class);

                intent.putExtra("mensaje", msj.getText()+"");
                startActivity(intent);
            }
        });
    }


}