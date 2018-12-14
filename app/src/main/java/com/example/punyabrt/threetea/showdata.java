package com.example.punyabrt.threetea;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class showdata extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showdata);

        Button add = findViewById(R.id.ADD_button);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(showdata.this,addmenu.class);
                startActivity(i);
            }
        });


        Button back = findViewById(R.id.backTeaIn_button);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(showdata.this, MainActivity2page.class);
                startActivity(i);
            }
        });
    }

}