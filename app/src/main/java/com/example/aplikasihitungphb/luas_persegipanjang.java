package com.example.aplikasihitungphb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class luas_persegipanjang extends Activity implements View.OnClickListener {
    EditText ePanjang;
    EditText eLebar;
    TextView eHasil;
    Button btnHitung;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luas_persegipanjang);

//        Mengambil inputan dari user
        ePanjang = (EditText) findViewById(R.id.ePanjang);
        eLebar = (EditText) findViewById(R.id.eLebar);
        eHasil = (TextView) findViewById(R.id.luas);
        btnHitung = (Button) findViewById(R.id.btnHitung);
        btnHitung.setOnClickListener(this);
    }
    public void onClick(View v) {
        double Panjang = Double.parseDouble(String.valueOf(ePanjang.getText()));
        double Lebar = Double.parseDouble(String.valueOf(eLebar.getText()));
        double Hasil = Panjang * Lebar;

        eHasil.setText(String.valueOf(Hasil));

    }
}