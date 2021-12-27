package com.example.anggotatubuh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AnggotaTubuh extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anggotatubuh);
    }
    public void anggotatubuh(View view) {
        Intent intent = new Intent(AnggotaTubuh.this,MainActivity.class);
        startActivity(intent);
    }
    public void btn_mataktg(View view) {
        Intent intent = new Intent(AnggotaTubuh.this,Mata.class);
        startActivity(intent);
    }
    public void btn_telingaktg(View view) {
        Intent intent = new Intent(AnggotaTubuh.this, Telinga.class);
        startActivity(intent);
    }
    public void btn_hidungktg(View view) {
        Intent intent = new Intent(AnggotaTubuh.this, Hidung.class);
        startActivity(intent);

    }
    public void btn_mulutktg(View view) {
        Intent intent = new Intent(AnggotaTubuh.this, Mulut.class);
        startActivity(intent);
    }
    public void btn_gigiktg(View view) {
        Intent intent = new Intent(AnggotaTubuh.this, Gigi.class);
    }
    public void btn_lidahktg(View view) {
        Intent intent = new Intent(AnggotaTubuh.this, Lidah.class);
        startActivity(intent);
    }
    public void btn_tgnktg(View view) {
        Intent intent = new Intent(AnggotaTubuh.this, Tangan.class);
        startActivity(intent);
    }
    public void btn_kakiktg(View view) {
        Intent intent = new Intent(AnggotaTubuh.this, Kaki.class);
        startActivity(intent);
    }
    public void btn_otakktg(View view) {
        Intent intent = new Intent(AnggotaTubuh.this, Otak.class);
        startActivity(intent);
    }
    public void btn_hatiktg(View view) {
        Intent intent = new Intent(AnggotaTubuh.this, Hati.class);
        startActivity(intent);
    }
    public void btn_paruktg(View view) {
        Intent intent = new Intent(AnggotaTubuh.this, Paru.class);
        startActivity(intent);
    }
    public void btn_lambungktg(View view) {
        Intent intent = new Intent(AnggotaTubuh.this, Lambung.class);
        startActivity(intent);
    }
}