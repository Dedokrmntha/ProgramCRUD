package com.example.programcrud;

import android.os.Bundle;
import android.*;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Spinner txtNamaBarang;
    EditText txtJumlah, txtHarga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNamaBarang = (Spinner) findViewById(R.id.namaBarang);
        txtJumlah = (EditText) findViewById(R.id.jumlah);
        txtHarga = (EditText) findViewById(R.id.harga);
    }

    public void btnSubmit(View view) {
        String namaBarang = txtNamaBarang.getSelectedItem().toString();
        String jumlah = txtJumlah.getText().toString();
        String harga = txtHarga.getText().toString();

//        Integer jumlah = Integer.parseInt(txtJumlah.getText().toString());
//        Double harga = Double.parseDouble(txtHarga.getText().toString());

        background bg = new background(this);
        bg.execute(namaBarang, jumlah, harga);
    }
}