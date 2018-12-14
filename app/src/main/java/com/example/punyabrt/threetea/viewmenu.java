package com.example.punyabrt.threetea;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.ArrayList;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.punyabrt.threetea.Databasetea.TeaIn;

public class viewmenu extends AppCompatActivity {

    TeaIn mHelper;
    SQLiteDatabase mDb;
    Cursor mCursor;
    ListView listVIEWMENU;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewmenu);

        mHelper = new TeaIn(this);
        mDb = mHelper.getReadableDatabase();

        mCursor = mDb.rawQuery("SELECT * FROM " + TeaIn.TABLE_NAME, null);

        ArrayList<String> arr_list = new ArrayList<String>();
        mCursor.moveToFirst();
        while(!mCursor.isAfterLast() ){
            arr_list.add("Name : " + mCursor.getString(mCursor.getColumnIndex(TeaIn.Menu))
                    + "\t\t" + mCursor.getString(mCursor.getColumnIndex(TeaIn.Price))
                    + "\nLocation : " + mCursor.getString(mCursor.getColumnIndex(TeaIn.Location)));
            mCursor.moveToNext();
        }

        ArrayAdapter<String> adapterDir = new ArrayAdapter<String>(getApplicationContext(), R.layout.activity_viewmenu , arr_list);

        listVIEWMENU = (ListView)findViewById(R.id.listVIEWMENU);
        listVIEWMENU.setAdapter(adapterDir);
        listVIEWMENU.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                mCursor.moveToPosition(arg2);

                String name = mCursor.getString(mCursor.getColumnIndex(TeaIn.Menu));
                String price = mCursor.getString(mCursor.getColumnIndex(TeaIn.Price));
                String location = mCursor.getString(mCursor.getColumnIndex(TeaIn.Location));

                AlertDialog.Builder builder = new AlertDialog.Builder(viewmenu.this);
                builder.setTitle("Menu");
                builder.setMessage("Name : " + name + "\n\nPrice : " + price + "\n\nLocation : " + location);
                builder.setNeutralButton("OK", null);
                builder.show();
            }
        });

    }
    public void onStop() {
        super.onStop();
        mHelper.close();
        mDb.close();
    }
}
