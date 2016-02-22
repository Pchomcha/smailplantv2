package com.example.com.smileplanttest;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    //Explicit
    private ManageTABLE manageTABLE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Request Database
        manageTABLE = new ManageTABLE(this);

        //Delete AllSQLite ==>ถ้าข้อมูลครบ49 ตัวก็ไม่ต้องลบ
        deleteAllSQLite();

        //Setup Data   สำหรับข้อมูลที่ไม่สมบูรณ์
        forSetupData();

    } //main Method

    private void deleteAllSQLite() {
        SQLiteDatabase sqLiteDatabase = openOrCreateDatabase(MyOpenHelper.database_name, MODE_PRIVATE, null);
        sqLiteDatabase.delete(ManageTABLE.plant_table, null, null);

    } //deldteAllSQLite

    private void forSetupData() {

        //CHeck emty Data
        SQLiteDatabase sqLiteDatabase = openOrCreateDatabase(MyOpenHelper.database_name,
                MODE_PRIVATE, null);
        Cursor cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + ManageTABLE.plant_table, null);
        if (cursor.getCount() == 0) {

            //ไม่มีข้อมูล
            addFirstData();

        } //if


    }  //forSTEupdata

    private void addFirstData() {


        //Tester Add Data
//        manageTABLE.addPlant("nameth", "nameeng", "hprodoc", "hage", "hseason", "hplant",
//                "data", "dround", "plant", "water", "compost,", "potect", "harvest");

        String[] namethStrings = getResources().getStringArray(R.array.nameth);
        String[] nameengStrings = getResources().getStringArray(R.array.nameeng);
        String[] hproducStrings = getResources().getStringArray(R.array.hproduc);
        String[] hageStrings = getResources().getStringArray(R.array.hage);
        String[] hseasonStrings = getResources().getStringArray(R.array.hseason);
        String[] hplantStrings = getResources().getStringArray(R.array.hplant);
        String[] dataStrings = getResources().getStringArray(R.array.data);
        String[] groundStrings = getResources().getStringArray(R.array.ground);
        String[] plantStrings = getResources().getStringArray(R.array.plant);
        String[] waterStrings = getResources().getStringArray(R.array.water);
        String[] compostStrings = getResources().getStringArray(R.array.compost);
        String[] protectStrings = getResources().getStringArray(R.array.protect);
        String[] harvestStrings = getResources().getStringArray(R.array.harvest);

        for (int i=0; i<namethStrings.length;i++) {

           manageTABLE.addPlant(namethStrings[i],
                   nameengStrings[i],
                   hproducStrings[i],
                   hageStrings[i],
                   hseasonStrings[i],
                   hplantStrings[i],
                   dataStrings[i],
                   groundStrings[i],
                   plantStrings[i],
                   waterStrings[i],
                   compostStrings[i],
                   protectStrings[i],
                   harvestStrings[i]);

        }//for

    } //addFirsData
} //Main class
