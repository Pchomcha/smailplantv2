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

        //Setup Data   สำหรับข้อมูลที่ไม่สมบูรณ์
        forSetupData ();

    } //main Method

    private void forSetupData() {

        //CHeck emty Data
        SQLiteDatabase sqLiteDatabase = openOrCreateDatabase(MyOpenHelper.database_name,
                MODE_PRIVATE, null);
        Cursor cursor = sqLiteDatabase.rawQuery("SELECT * FROM "+ ManageTABLE.plant_table, null);
        if (cursor.getCount() == 0 ) {

            //ไม่มีข้อมูล
            addFirstData();

        } //if


    }  //forSTEupdata

    private void addFirstData() {

        //Tester Add Data
        manageTABLE.addPlant("nameth", "nameeng", "hprodoc", "hage", "hseason", "hplant",
                "data", "dround", "plant", "water", "compost,", "potect", "harvest");

    } //addFirsData
} //Main class
