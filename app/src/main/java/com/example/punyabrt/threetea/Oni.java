package com.example.punyabrt.threetea;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.Locale;


public class Oni extends SQLiteOpenHelper  {
    private static final String DB_NAME = "drink";
    private static final int DB_VERSION = 1;
    public static final String TABLE_NAME = "buble tea";

    public static final String Menu = "name";
    public static final String Price = "price";
    public static final String Location = "location";

    public Oni (Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }


    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE " + TABLE_NAME+ " (_id INTEGER PRIMARY KEY AUTOINCREMENT, " + Menu + " TEXT, " + Price + " INTEGER, " + Location + " TEXT);");

        db.execSQL("INSERT INTO " + TABLE_NAME + " (" + Menu + ", " + Price + ", " + Location + ") VALUES ('Strawberry Milk Tea', 40, 'Nakornpathom, Sanamchan, 73000, *opposite 7-11 Chantarakhamphithak Road');");
        db.execSQL("INSERT INTO " + TABLE_NAME + " (" + Menu + ", " + Price + ", " + Location + ") VALUES ('Matcha Milk Tea', 40, 'Nakornpathom, Sanamchan, 73000, *opposite 7-11 Chantarakhamphithak Road');");
        db.execSQL("INSERT INTO " + TABLE_NAME + " (" + Menu + ", " + Price + ", " + Location+ ") VALUES ('Mint Milk Tea', 40, 'Nakornpathom, Sanamchan, 73000, *opposite 7-11 Chantarakhamphithak Road');");
        db.execSQL("INSERT INTO " + TABLE_NAME + " (" + Menu + ", " + Price + ", " + Location + ") VALUES ('Taro Milk Tea', 40, 'Nakornpathom, Sanamchan, 73000, *opposite 7-11 Chantarakhamphithak Road');");
        db.execSQL("INSERT INTO " + TABLE_NAME + " (" + Menu + ", " + Price + ", " + Location + ") VALUES ('Choccolate Milk Tea', 40, 'Nakornpathom, Sanamchan, 73000, *opposite 7-11 Chantarakhamphithak Road');");
    }

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }
}

