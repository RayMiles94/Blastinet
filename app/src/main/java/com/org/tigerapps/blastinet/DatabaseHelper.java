package com.org.tigerapps.blastinet;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
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
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String q = "(create table " + TABLE_NAME + "(ID INTEGER PRIMARY KEY ," + COL2 +"VARCHAR," +COL3 +"VARCHAR," +COL4 +"VARCHAR);";
        db.execSQL(q);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }
    public boolean insertData(String name,String email,String events){


        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();


        contentValues.put(COL2,name);
        contentValues.put(COL3,email);
        contentValues.put(COL4,events);

        long res = db.insert(TABLE_NAME,null,contentValues);
            if (res == -1)
                return false;
            else return true;
    }
    public Cursor getAlldata(){
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res =db.rawQuery("SELECT * FROM " +TABLE_NAME,null);
        return res;


    }
}
