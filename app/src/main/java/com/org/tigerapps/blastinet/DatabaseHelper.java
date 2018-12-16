package com.org.tigerapps.blastinet;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.Nullable;

public class DatabaseHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME="Blasti.db";
    public static final String TABLE_NAME="blasti_client";

    public static final String COL1="id";
    public static final String COL2="name";
    public static final String COL3="email";
    public static final String COL4="events";


    public DatabaseHelper(Context context) {
        super(context,DATABASE_NAME,null,1);
        SQLiteDatabase db = this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String q = "(create table " + TABLE_NAME + "(ID INTEGER PRIMARY KEY AUTO INCREMENT ,id,name,email,events):";
        db.execSQL(q);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }
}
