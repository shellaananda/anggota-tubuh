package com.example.anggotatubuh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class Gigi extends AppCompatActivity {
    MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gigi);
    }
    public void btn_back (View view){
        Intent intent = new Intent(Gigi.this,Mulut.class);
        startActivity(intent);
    }
    public void btn_stage (View view){
        Intent intent = new Intent(Gigi.this,AnggotaTubuh.class);
        startActivity(intent);
    }
    public void btn_next (View view){
        Intent intent = new Intent(Gigi.this,Lidah.class);
        startActivity(intent);
    }
    public void btn_audio (View view){
        if (player == null) {
            player = MediaPlayer.create(this, R. raw.sound_gigi);
        }
        player.start();
    }
}