package com.example.aplikasihitungphb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class luas_segitiga  extends Activity implements View.OnClickListener {

    EditText eAlas;
    EditText eTinggi;
    TextView eHasil;
    Button btnHitung;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luas_segitiga);


//        Mengambil inputan dari user
        eAlas = (EditText) findViewById(R.id.ePanjang);
        eTinggi = (EditText) findViewById(R.id.eLebar);
        eHasil = (TextView) findViewById(R.id.luas);
        btnHitung = (Button) findViewById(R.id.btnHitung);
        btnHitung.setOnClickListener(this);
    }
    public void onClick(View v) {
        double alas = Double.parseDouble(String.valueOf(eAlas.getText()));
        double tinggi = Double.parseDouble(String.valueOf(eTinggi.getText()));
        double luas = (alas / 2 ) * tinggi ;

        eHasil.setText(String.valueOf(luas));

    }
}