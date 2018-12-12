package com.example.punyabrt.threetea;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.Locale;


public class TeaIn extends SQLiteOpenHelper  {
    private static final String DB_NAME = "drink";
    private static final int DB_VERSION = 1;
    public static final String TABLE_NAME = "buble tea";

    public static final String Menu = "name";
    public static final String Price = "price";
    public static final String Location = "location";

    public TeaIn (Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }


    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE " + TABLE_NAME+ " (_id INTEGER PRIMARY KEY AUTOINCREMENT, " + Menu + " TEXT, " + Price + " INTEGER, " + Location + " TEXT);");

        db.execSQL("INSERT INTO " + TABLE_NAME + " (" + Menu + ", " + Price + ", " + Location + ") VALUES ('Coco', 40, 'Nakornpathom, Sanamchan, 73000, *opposite Silpakorn University');");
        db.execSQL("INSERT INTO " + TABLE_NAME + " (" + Menu + ", " + Price + ", " + Location + ") VALUES ('Milk Tea', 55, 'Nakornpathom, Sanamchan, 73000, *opposite Silpakorn University');");
        db.execSQL("INSERT INTO " + TABLE_NAME + " (" + Menu + ", " + Price + ", " + Location+ ") VALUES ('Green Tea', 55, 'Nakornpathom, Sanamchan, 73000, *opposite Silpakorn University');");
        db.execSQL("INSERT INTO " + TABLE_NAME + " (" + Menu + ", " + Price + ", " + Location + ") VALUES ('Milk', 40, 'Nakornpathom, Sanamchan, 73000, *opposite Silpakorn University');");
        db.execSQL("INSERT INTO " + TABLE_NAME + " (" + Menu + ", " + Price + ", " + Location + ") VALUES ('Coffee', 85, 'Nakornpathom, Sanamchan, 73000, *opposite Silpakorn University');");
    }

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }
}
