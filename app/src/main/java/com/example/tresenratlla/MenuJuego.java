package com.example.tresenratlla;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MenuJuego extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_juego);

        ImageView botonPerfil = findViewById(R.id.botonperfil);
        botonPerfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuJuego.this, Profile.class);
                startActivity(intent);
            }
        });

        ImageView botonAjustes = findViewById(R.id.botonajustes);
        botonAjustes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuJuego.this, SettingsMenu.class);
                startActivity(intent);
            }
        });

        ImageView botonHistorial = findViewById(R.id.botonhistorial);
        botonHistorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuJuego.this, GameHistory.class);
                startActivity(intent);
            }
        });

        Button botonJugar = findViewById(R.id.botonJugar);
        botonJugar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuJuego.this, ModoJuego.class);
                startActivity(intent);
            }
        });
    }
}