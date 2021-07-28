package com.example.aplikasihitungphb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends Activity implements OnClickListener {
    EditText user;
    EditText pass;
    Button login;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        user = (EditText) findViewById(R.id.username);
        pass = (EditText) findViewById(R.id.password);
        login = (Button) findViewById(R.id.btn_login);
        login.setOnClickListener(this);
    }

    public void onClick(View v) {
        if (user.getText().toString().equals("admin") && pass.getText().toString().equals("admin")) {
            intent = new Intent(this, Menu_Utama.class);
            startActivity(intent);
        } else {
            Toast.makeText(MainActivity.this, "Login anda gagal, periksa kembali Username dan Password anda", Toast.LENGTH_LONG).show();
        }
    }
}