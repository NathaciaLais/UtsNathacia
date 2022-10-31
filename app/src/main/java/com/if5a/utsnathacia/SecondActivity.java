package com.if5a.utsnathacia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView tvnama;
    TextView tvnomor;
    TextView tvjarlur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("Uts Nathacia Lais");
        tvnama =findViewById(R.id.tv_nama);
        tvnomor =findViewById(R.id.tv_nomor);
        tvjarlur =findViewById(R.id.tv_jalur);

        Intent terima =getIntent();
        String ynama = terima.getStringExtra("xnama");
        tvnama.setText(ynama);
        String ynomor = terima.getStringExtra("xnomor");
        tvnama.setText(ynomor);
        String yjalur = terima.getStringExtra("xjalur");
        tvnama.setText(yjalur);


    }
}