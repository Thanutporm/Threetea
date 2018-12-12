package com.example.punyabrt.threetea;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Button;
import android.view.View;

import java.util.Locale;


public class Chubby extends SQLiteOpenHelper  {
    private static final String DB_NAME = "drink";
    private static final int DB_VERSION = 1;
    public static final String TABLE_NAME = "buble tea";

    public static final String Menu = "name";
    public static final String Price = "price";
    public static final String Location = "location";

    public Chubby (Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }


    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE " + TABLE_NAME+ " (_id INTEGER PRIMARY KEY AUTOINCREMENT, " + Menu + " TEXT, " + Price + " INTEGER, " + Location + " TEXT);");

        db.execSQL("INSERT INTO " + TABLE_NAME + " (" + Menu + ", " + Price + ", " + Location + ") VALUES ('Coco', 35, 'Nakornpathom, Sanamchan, 73000, *Candymarket');");
        db.execSQL("INSERT INTO " + TABLE_NAME + " (" + Menu + ", " + Price + ", " + Location + ") VALUES ('Milk Tea', 35, 'Nakornpathom, Sanamchan, 73000, *Candymarket');");
        db.execSQL("INSERT INTO " + TABLE_NAME + " (" + Menu + ", " + Price + ", " + Location+ ") VALUES ('Rose Tea', 35, 'Nakornpathom, Sanamchan, 73000, *Candymarket');");
        db.execSQL("INSERT INTO " + TABLE_NAME + " (" + Menu + ", " + Price + ", " + Location + ") VALUES ('Milk Berry', 35, 'Nakornpathom, Sanamchan, 73000, *Candymarket');");
        db.execSQL("INSERT INTO " + TABLE_NAME + " (" + Menu + ", " + Price + ", " + Location + ") VALUES ('Milk Tea Slurpee', 45, 'Nakornpathom, Sanamchan, 73000, *Candymarket');");
    }

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }
}



