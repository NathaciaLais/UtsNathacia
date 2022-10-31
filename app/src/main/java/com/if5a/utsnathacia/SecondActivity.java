package com.if5a.utsnathacia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {
    EditText etnama, etnomor;
    Button btndaftar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("Uts Nathacia Lais");

        btndaftar =findViewById(R.id.btn_daftar);
        etnama =findViewById(R.id.et_nama);
        etnomor =findViewById(R.id.et_nomor);

    }
}