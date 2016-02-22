package com.example.com.smileplanttest;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by COM on 21/2/2559.
 */
public class MyOpenHelper extends SQLiteOpenHelper{


    //Explicit
    public static final String database_name = "plant.db";
    private static final int database_version = 1;
    private static String create_plantTABLE = "create table plantTABLE (" +
            "_id integer primary key, " +
            "Nameth text" +
            "Nameeng text" +
            "Productivity text" +
            "Age text" +
            "Season text" +
            "Data text" +
            "Plant text" +
            "Maintenance text" +
            "Harvest text" +
            "Column10 text" +
            "Column11 text" +
            "Column12 text" +
            "protected text );";

    public MyOpenHelper( Context context) {
        super(context, database_name , null ,database_version );
        //Constructor

    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
} //Main Class
