package com.org.tigerapps.blastinet;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.Nullable;

public class DatabaseHelper extends SQLiteOpenHelper {
    //database name
    public static final String DATABASE_NAME="Blasti.db";



    //table names
    public static final String TABLE_CLIENT="client";
    public static final String TABLE_COMMENTS="comments";






    //table client columns
    public static final String COL1="id";
    public static final String COL2="name";
    public static final String COL3="email";
    public static final String COL4="events";


    //table comments columns
    public static final String comment_ID="comment_ID";
    public static final String comment_post_ID="comment_post_ID";
    public static final String comment_author="comment_author";
    public static final String comment_author_email="comment_author_email";
    public static final String comment_author_url="comment_author_url";
    public static final String comment_author_IP="comment_author_IP";
    public static final String comment_date="comment_date";
    public static final String comment_date_gmt="comment_date_gmt";
    public static final String comment_content="comment_content";
    public static final String comment_karma="comment_karma";
    public static final String comment_approved="comment_approved";
    public static final String comment_agent="comment_agent";
    public static final String comment_type="comment_type";
    public static final String comment_parent="comment_parent";
    public static final String user_id="user_id";


    public DatabaseHelper(Context context) {
        super(context,DATABASE_NAME,null,1);
    }

        private static final String CREATE_TABLE_CLIENT="CREATE TABLE " +TABLE_CLIENT + " ( ID PRIMARY KEY AUTOINCREMENT " +COL2 +" VARCHAR " +COL3 +" VARCHAR " +COL4 +" VARCHAR);";
        SQLiteDatabase db = this.getWritableDatabase();
    @Override
    public void onCreate(SQLiteDatabase db) {
        //String req="CREATE TABLE " +TABLE_CLIENT + "( ID  INETEGER PRIMARY KEY " + COL2 + " VARCHAR ," + COL3 + " VARCHAR ," + COL4 + " VARCHAR );";
        String req="CREATE TABLE qsdf (ID INTEGER PRIMARY KEY ,COL2 VARCHAR ,COL3 VARCHAR ,COL4 VARCHAR;)";
        db.execSQL(req);
        //db.execSQL( "create table " + TABLE_CLIENT + "(ID INTEGER PRIMARY KEY AUTOINCREMENT ," + COL2 +" VARCHAR, " +COL3 +" VARCHAR, " +COL4 +" VARCHAR);");
       /* String q = "CREATE TABLE " + TABLE_COMMENTS + " (" +
        comment_ID + " INT PRIMARY KEY AUTOINCREMENT ,"
        +comment_post_ID + " comment_author VARCHAR , " +
        comment_author_email + " comment_author_email VARCHAR , "
        +comment_author_url + " comment_author_url VARCHAR,"
        +comment_author_IP + " comment_author_IP VARCHAR"
        +comment_date + "comment_date DATE"
        +comment_date_gmt + " date_gmt DATE"
        +comment_content + " comment_content STRING"////
        +comment_karma + " comment_karma INT"
        +comment_approved + " comment_approved STRING"
        +comment_agent + " comment_agent String"
        +comment_approved + " comment_approved STRING"
        +comment_type + " comment_type String"
        +comment_parent + " comment_parent INT"
        +user_id + " user_id int );";
        db.execSQL(q); */
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_CLIENT);
        onCreate(db);
    }
    public boolean insertData(String name,String email,String events){


        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();


        contentValues.put(COL2,name);
        contentValues.put(COL3,email);
        contentValues.put(COL4,events);

        long res = db.insert(TABLE_CLIENT,null,contentValues);
            if (res == -1)
                return false;
            else return true;
    }
    public Cursor getAlldata(){
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res =db.rawQuery("SELECT * FROM " +TABLE_CLIENT,null);
        return res;


    }
}
