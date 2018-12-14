package com.example.punyabrt.threetea;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.Button;
import android.view.View;


public class MainActivity2page extends AppCompatActivity {

    private static final String TAG = MainActivity2page.class.getName();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2page);


        Button button1= findViewById(R.id.button1_page2);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(MainActivity2page.this, showdata.class);
                startActivity(i1);
            }
        });



        Button back = findViewById(R.id.buttonback_page2);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity2page.this, Threetea_home.class);
                startActivity(i);
            }
        });
    }
}
