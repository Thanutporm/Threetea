package com.example.punyabrt.threetea.Databasetea;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.Nullable;


public class TeaIn extends SQLiteOpenHelper  {

    private static final String DB_NAME = "drink";
    private static final int DB_VERSION = 1;


    public static final String TABLE_NAME = "bubletea";
    public static final String ID = "id";
    public static final String MENU = "name";
    public static final String PRICE = "price";
    public static final String LOCATION = "location";

    private static final String SQL_CREATE_TABLE_TeaIn
            = "CREATE TABLE " + TABLE_NAME + "( "
            + ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + MENU + "TEXT,"
            + PRICE + "TEXT,"
            + LOCATION + "TEXT "
            + ")";


    public TeaIn (@Nullable Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_TABLE_TeaIn);

        ContentValues cv = new ContentValues();
        cv.put(MENU, "Coco");
        cv.put(PRICE, "40");
        cv.put(LOCATION, "Nakornpathom, Sanamchan, 73000, *opposite Silpakorn University");
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(MENU, "Milk");
        cv.put(PRICE, "40");
        cv.put(LOCATION, "Nakornpathom, Sanamchan, 73000, *opposite Silpakorn University");
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(MENU, "Milk Tea");
        cv.put(PRICE, "55");
        cv.put(LOCATION, "Nakornpathom, Sanamchan, 73000, *opposite Silpakorn University");
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(MENU, "Green Tea");
        cv.put(PRICE, "55");
        cv.put(LOCATION, "Nakornpathom, Sanamchan, 73000, *opposite Silpakorn University");
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(MENU, "Coffee");
        cv.put(PRICE, "85");
        cv.put(LOCATION, "Nakornpathom, Sanamchan, 73000, *opposite Silpakorn University");
        db.insert(TABLE_NAME, null, cv);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
