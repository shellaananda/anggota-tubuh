package com.example.anggotatubuh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;

public class Tangan extends AppCompatActivity {
    MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tangan);
    }
    public void btn_back (View view){
        Intent intent = new Intent(Tangan.this,Lidah.class);
        startActivity(intent);
    }
    public void btn_stage (View view){
        Intent intent = new Intent(Tangan.this,AnggotaTubuh.class);
        startActivity(intent);
    }
    public void btn_next (View view){
        Intent intent = new Intent(Tangan.this,Kaki.class);
        startActivity(intent);
    }
    public void btn_audio (View view){
        if (player == null) {
            player = MediaPlayer.create(this, R. raw.sound_tangan);
        }
        player.start();
    }
}