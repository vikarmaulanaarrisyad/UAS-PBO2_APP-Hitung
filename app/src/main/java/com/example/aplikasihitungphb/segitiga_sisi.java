package com.example.aplikasihitungphb;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class segitiga_sisi extends Activity implements View.OnClickListener {

    EditText ePanjang;
    TextView eHasil;
    Button bKeliling;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga_sisi);

        ePanjang = (EditText) findViewById(R.id.ePanjang);
        eHasil = (TextView) findViewById(R.id.eHasil);
        bKeliling = (Button) findViewById(R.id.bKeliling);
        bKeliling.setOnClickListener(this);
    }
    public void onClick(View v) {
        double Panjang = Double.parseDouble(String.valueOf(ePanjang.getText()));
        double Hasil = 3 * Panjang ;

        eHasil.setText(String.valueOf(Hasil));

    }
}