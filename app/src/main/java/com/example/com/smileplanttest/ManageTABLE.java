package com.example.com.smileplanttest;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by COM on 22/2/2559.
 */
public class ManageTABLE {

    //Explicit
    private MyOpenHelper myOpenHelper;
    private SQLiteDatabase writeSqLiteDatabase, readSqLiteDatabase;

    public static final String plant_table = "plantTABLE";
    public static final String colum_id = "_id";
    public static final String colum_Nameth = "Nameth";
    public static final String colum_Nameeng = "Nameeng";
    public static final String colum_HProduc = "HProduc";
    public static final String colum_HAge = "HAge";
    public static final String colum_HSeason = "HSeason";
    public static final String colum_HPlant = "HPlant";
    public static final String colum_Data = "Data";
    public static final String colum_ground = "ground";
    public static final String colum_plant = "plant";
    public static final String colum_water = "water";
    public static final String colum_compost = "compost";
    public static final String colum_protect = "protect";
    public static final String colum_Harvest = "Harvest";


    public ManageTABLE(Context context) {

        //create&connected
        myOpenHelper = new MyOpenHelper(context);
        writeSqLiteDatabase = myOpenHelper.getReadableDatabase();
        readSqLiteDatabase = myOpenHelper.getReadableDatabase();

    } //Constuctor

    public long addPlant(String strNameth,
                         String strNameeng,
                         String strHProduc,
                         String strHAge,
                         String strHSeason,
                         String strHPlant,
                         String strData,
                         String strground,
                         String strplant,
                         String strwater,
                         String strcompost,
                         String strprotect,
                         String strHarvest) {

        ContentValues contentValues = new ContentValues();
        contentValues.put(colum_Nameth, strNameth);
        contentValues.put(colum_Nameeng, strNameeng);
        contentValues.put(colum_HProduc, strHProduc);
        contentValues.put(colum_HAge, strHAge);
        contentValues.put(colum_HSeason, strHSeason);
        contentValues.put(colum_HPlant, strHPlant);
        contentValues.put(colum_Data, strData);
        contentValues.put(colum_ground, strground);
        contentValues.put(colum_plant, strplant);
        contentValues.put(colum_water, strwater);
        contentValues.put(colum_compost, strcompost);
        contentValues.put(colum_protect, strprotect);
        contentValues.put(colum_Harvest, strHarvest);

        return writeSqLiteDatabase.insert(plant_table,null,contentValues);
    }


}  //Main Class
