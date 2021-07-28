package com.example.aplikasihitungphb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class keliling_persegi extends Activity implements View.OnClickListener {
    //    Memanggil inputan
    EditText ePanjang;
    EditText eLebar;
    TextView eHasil;
    Button bKeliling;
    private Intent intent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keliling_persegi);

//        Mengambil inputan dari user
        ePanjang = (EditText) findViewById(R.id.ePanjang);
        eLebar = (EditText) findViewById(R.id.eLebar);
        eHasil = (TextView) findViewById(R.id.eHasil);
        bKeliling = (Button) findViewById(R.id.bKeliling);
        bKeliling.setOnClickListener(this);

    }

    public void onClick(View v) {
        double Panjang = Double.parseDouble(String.valueOf(ePanjang.getText()));
        double Lebar = Double.parseDouble(String.valueOf(eLebar.getText()));
        double Hasil = 2 * (Panjang + Lebar);

        eHasil.setText(String.valueOf(Hasil));

    }
}