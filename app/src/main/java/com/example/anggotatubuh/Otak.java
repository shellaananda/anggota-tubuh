package com.example.anggotatubuh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class Otak extends AppCompatActivity {
    MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otak);
    }
    public void btn_back (View view){
        Intent intent = new Intent(Otak.this,Kaki.class);
        startActivity(intent);
    }
    public void btn_stage (View view){
        Intent intent = new Intent(Otak.this,AnggotaTubuh.class);
        startActivity(intent);
    }
    public void btn_next (View view){
        Intent intent = new Intent(Otak.this,Hati.class);
        startActivity(intent);
    }
    public void btn_audio (View view){
        if (player == null) {
            player = MediaPlayer.create(this, R. raw.sound_otak);
        }
        player.start();
    }
}