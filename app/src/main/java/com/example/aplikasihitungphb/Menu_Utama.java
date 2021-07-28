package com.example.aplikasihitungphb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class Menu_Utama extends AppCompatActivity {
    Button exit;
    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_utama);

        listView = findViewById(R.id.list);
        Button exit = (Button) findViewById(R.id.Exit);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                System.exit(0);
            }
        });


        String[] values = new String[]{
                "Aplikasi Hitung",
                "Biodata",
                "Tentang"
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, android.R.id.text1,values);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?>parent, View view, int position, long id){
                if (position == 0 ){
                    Intent intent = new Intent(view.getContext(),Aplikasiperhitungan.class);
                    startActivity(intent);
                }
                else if (position == 1 ){
                    Intent intent = new Intent(view.getContext(),Biodata.class);
                    startActivity(intent);
                }else if (position == 2 ){
                    Intent intent = new Intent(view.getContext(),Tentang.class);
                    startActivity(intent);
                }
            }

        });

    }
}