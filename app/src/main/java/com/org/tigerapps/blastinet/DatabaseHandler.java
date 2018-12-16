package com.org.tigerapps.blastinet;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHandler extends SQLiteOpenHelper {
    public static final String BLASTI_CLIENT_KEY="id";
    public static final String BLASTI_NAME="name";
    public static final String BLASTI_EMAIL="email";
    public static final String BLASTI_EVENTS="events";

    public static final String BLASTI_TABLE_NAME = "Client";

    public static final String BLASTI_TABLE_CREATE=
            "CREATE TABLE" + BLASTI_TABLE_NAME + "(" + BLASTI_CLIENT_KEY + "INTEGER PRIMARY KEY AUTOINCREMENT " +
            BLASTI_NAME + "TEXT" +
            BLASTI_EMAIL + "TEXT" +
            BLASTI_EVENTS + "TEXT NOT NULL);";

    public DatabaseHandler(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {

        super(context, name, factory, version);

    }
    @Override

    public void onCreate(SQLiteDatabase db) {

        db.execSQL(BLASTI_TABLE_CREATE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }


}
