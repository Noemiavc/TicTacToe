package com.example.tresenratlla;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class SettingsMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings_menu);

        ImageView showFragmentLang = (ImageView) findViewById(R.id.fragment_lang);
        showFragmentLang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopFragment dialog = new PopFragment(R.layout.fragment_languages);
                dialog.show(getSupportFragmentManager(), "my_dialog_tag");
            }
        });

        ImageView botonJuego = findViewById(R.id.modoJuego);
        botonJuego.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SettingsMenu.this, ModoJuego.class);
                startActivity(intent);
            }
        });

        ImageView botonVolver = findViewById(R.id.volver);
        botonVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SettingsMenu.this, MenuJuego.class);
                startActivity(intent);
            }
        });

    }
}