package com.if5a.utsnathacia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.CheckBox;
import android.widget.Toast;




public class MainActivity extends AppCompatActivity {
    private Button btndaftar;
    private EditText etnama,etnomor;
    private Spinner spjalur;
    private CheckBox cb_konfirmasi;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Uts Nathacia Lais");
        
        

        etnama = findViewById(R.id.et_nama);
        etnomor = findViewById(R.id.et_nomor);
        spjalur = findViewById(R.id.sp_jalur);
        cb_konfirmasi= findViewById(R.id.cb_konfirmasi);
        btndaftar = findViewById(R.id.btn_daftar);
        btndaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nama,nomor,jalur = null;

                nama = etnama.getText().toString();
                nomor = etnomor.getText().toString();
                jalur =spjalur.getSelectedItem().toString();
                if (nama.trim().equals("")){
                    etnama.setError("Nama tidak boleh kosong");
                }
                else if (nomor.trim().equals("")){
                    etnomor.setError("Nomor tidak boleh kosong");

                }
                else if (jalur.trim().equals("Jalur Pendaftaran")){
                    Toast.makeText(MainActivity.this, "Pilih Jalur Pendaftaran", Toast.LENGTH_SHORT).show();
                }
                else if (!(cb_konfirmasi.isChecked())){
                    Toast.makeText(MainActivity.this, "CheckBox belum dicentang", Toast.LENGTH_SHORT).show();
                }
                else {
                    Intent daftar =new Intent(MainActivity.this, SecondActivity.class);
                    daftar.putExtra("xnama",nama);
                    daftar.putExtra("xnomor",nomor);
                    daftar.putExtra("xjalur",jalur);
                    startActivity(daftar);
                }


            }
        });


    }
}