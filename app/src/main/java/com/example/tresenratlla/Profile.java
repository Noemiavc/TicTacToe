package com.example.tresenratlla;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);


        ImageView showFragmentPass = (ImageView) findViewById(R.id.fragment_passw);
        showFragmentPass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopFragment dialog = new PopFragment(R.layout.fragment_password);
                dialog.show(getSupportFragmentManager(), "my_dialog_tag");
            }
        });

        ImageView showFragmentRank = (ImageView) findViewById(R.id.fragment_rank);
        showFragmentRank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopFragment dialog = new PopFragment(R.layout.fragment_ranking);
                dialog.show(getSupportFragmentManager(), "my_dialog_tag");
            }
        });

        ImageView botonVolver = findViewById(R.id.volver);
        botonVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Profile.this, MenuJuego.class);
                startActivity(intent);
            }
        });

        ImageView botonSalir = findViewById(R.id.salir);
        botonSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Profile.this, Login.class);
                startActivity(intent);
            }
        });
    }
}
