package com.example.aplikasihitungphb;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import static com.example.aplikasihitungphb.R.id.grid_view;


public class Aplikasiperhitungan extends AppCompatActivity {

    GridView gridView;
    String[] Headline = {"Keliling Persegi Panjang", "Luas Persegi Panjang","Luas Segitiga", "Keliling Segitiga"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aplikasiperhitungan);

        gridView = findViewById(grid_view);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this, android.R.layout.simple_list_item_1, Headline);
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
//                Toast.makeText(getApplicationContext(),
//                        ((TextView) v).getText() + " is Clicked", Toast.LENGTH_SHORT).show();

                if (position == 0 ){
                    Intent intent = new Intent(v.getContext(),keliling_persegi.class);
                    startActivity(intent);
                }
                else if (position == 1 ){
                    Intent intent = new Intent(v.getContext(),luas_persegipanjang.class);
                    startActivity(intent);
                }
                else if (position == 2 ){
                    Intent intent = new Intent(v.getContext(),luas_segitiga.class);
                    startActivity(intent);
                }
                else if (position == 3 ){
                    Intent intent = new Intent(v.getContext(),segitiga_sisi.class);
                    startActivity(intent);
                }
            }
        });

    }
}