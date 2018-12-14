package com.example.punyabrt.threetea;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.punyabrt.threetea.Databasetea.TeaIn;

public class showdata extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showdata);

        TeaIn mHelper = new TeaIn(this);
        SQLiteDatabase mDb = mHelper.getWritableDatabase();
        mHelper.close();
        mDb.close();

        Button view = findViewById(R.id.VIEW_button);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(showdata.this,viewmenu.class);
                startActivity(i);
            }
        });

        Button add = findViewById(R.id.ADD_button);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(showdata.this,addmenu.class);
                startActivity(i);
            }
        });


        Button edit = findViewById(R.id.EDIT_button);
        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(showdata.this,editmenu.class);
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