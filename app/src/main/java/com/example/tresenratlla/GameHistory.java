package com.example.tresenratlla;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class GameHistory extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_history);

        ImageView showFragmentPlays = (ImageView) findViewById(R.id.fragment_plays);
        showFragmentPlays.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopFragment dialog = new PopFragment(R.layout.fragment_recent_games);
                dialog.show(getSupportFragmentManager(), "my_dialog_tag");
            }
        });

        ImageView botonVolver = findViewById(R.id.volver);
        botonVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GameHistory.this, MenuJuego.class);
                startActivity(intent);
            }
        });
    }
}