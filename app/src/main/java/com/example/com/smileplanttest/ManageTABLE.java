package com.example.com.smileplanttest;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by COM on 22/2/2559.
 */
public class ManageTABLE {

    //Explicit
    private MyOpenHelper myOpenHelper;
    private SQLiteDatabase writeSqLiteDatabase,readSqLiteDatabase;


    public ManageTABLE(Context context ) {

        //create&connected
        myOpenHelper = new MyOpenHelper(context);
        writeSqLiteDatabase = myOpenHelper.getReadableDatabase();
        readSqLiteDatabase = myOpenHelper.getReadableDatabase();

    } //Constuctor
}  //Main Class
