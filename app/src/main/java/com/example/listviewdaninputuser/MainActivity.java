package com.example.listviewdaninputuser;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText bil1;
    private EditText bil2;
    private EditText jumlah;
    private Button btnhasil;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUI();
        initEvent();
    }

    private void initUI() {
        bil1 = (EditText) findViewById(R.id.txtBil1);
        bil2 = (EditText) findViewById(R.id.txtBil2);
        jumlah = (EditText) findViewById(R.id.txtHasil);
        btnhasil = (Button) findViewById(R.id.btnHasil);
    }

    private void initEvent() {
        btnhasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hitungJumlah();
                bil1.setText("");
                bil2.setText("");
            }
        });
    }

    private void hitungJumlah() {
        int angka1 = Integer.parseInt(bil1.getText().toString());
        int angka2 = Integer.parseInt(bil2.getText().toString());
        int total = angka1 + angka2;
        jumlah.setText(total+"");

    }
}
