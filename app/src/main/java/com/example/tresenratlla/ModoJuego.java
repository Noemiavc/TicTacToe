package com.example.tresenratlla;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ModoJuego extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modo_juego);

        Button botonOnline = findViewById(R.id.botonOnline);
        botonOnline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ModoJuego.this, ModoJugador.class);
                startActivity(intent);
            }
        });

        Button botonLocal = findViewById(R.id.botonLocal);
        botonLocal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ModoJuego.this, Partidas.class);
                startActivity(intent);
            }
        });
    }
}