package com.example.segundaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class segundaActivity extends AppCompatActivity {
    private TextView mensaje;
    private Button btsig2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);
        inicializarVista();
    }

    private void inicializarVista(){
        mensaje = findViewById(R.id.ETSalida);
        String men = getIntent().getStringExtra("mensaje");
        mensaje.setText(men);
        btsig2 = (Button) findViewById(R.id.BTSiguiente2);

        btsig2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Aquí efectuamos la acción al presionar el botón
                Intent intent = new Intent(segundaActivity.this, terceraActivity.class);
                intent.putExtra("mensaje", men+"");
                startActivity(intent);
            }
        });

    }


}