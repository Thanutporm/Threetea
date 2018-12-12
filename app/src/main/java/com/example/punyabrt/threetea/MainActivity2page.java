package com.example.punyabrt.threetea;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.support.annotation.MainThread;
import android.widget.Button;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity2page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2page);

        Button button1= findViewById(R.id.button1_page2);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), TeaIn.class);
                startActivity(intent);
            }
        });

        Button button2 = findViewById(R.id.button2_page2);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Oni.class);
                startActivity(intent);
            }
        });

        Button button3  = findViewById(R.id.button3_page2);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Chubby.class);
                startActivity(intent);
            }
        });
        Button back = findViewById(R.id.buttonback_page2);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity2page.this, Threetea.class);
            }
        });
    }
}
