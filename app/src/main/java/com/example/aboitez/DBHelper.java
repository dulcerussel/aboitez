package com.example.aboitez;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "AboitizLoan";
    public static final String TBL_APPLICANT = "applicant";
    public static final String TBL_APPLICATION = "application";
    public static final String TBL_HOUSEHOLD = "household";
    public static final String TBL_HOUSEHOLDINCOME = "apphouseholdincomelicant";
    public static final String TBL_HOUSEHOLDEXPENSE = "householdexpense";
    public static final String TBL_BUSINESS= "business";
    public static final String TBL_OPERATINGCOST= "operatingcost";
    public static final String TBL_OTHERCOST = "othercost";
    Context context;



    public DBHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String table1 = "CREATE TABLE "+TBL_APPLICANT+" (id INTEGER PRIMARY KEY,name TEXT)";
        String table2 = "CREATE TABLE "+TBL_APPLICATION+" (id INTEGER PRIMARY KEY,name TEXT)";
        String table3 = "CREATE TABLE "+TBL_HOUSEHOLD+" (id INTEGER PRIMARY KEY,name TEXT)";
        String table4 = "CREATE TABLE "+TBL_HOUSEHOLDINCOME+"(id INTEGER PRIMARY KEY,name TEXT)";
        String table5 = "CREATE TABLE "+TBL_HOUSEHOLDEXPENSE+" (id INTEGER PRIMARY KEY,name TEXT)";
        String table6 = "CREATE TABLE "+TBL_BUSINESS+" (id INTEGER PRIMARY KEY,name TEXT)";
        String table7 = "CREATE TABLE "+TBL_OPERATINGCOST+" (id INTEGER PRIMARY KEY,name TEXT)";
        String table8 = "CREATE TABLE "+TBL_OTHERCOST+" (id INTEGER PRIMARY KEY,name TEXT)";

        db.execSQL(table1);
        db.execSQL(table2);
        db.execSQL(table3);
        db.execSQL(table4);
        db.execSQL(table5);
        db.execSQL(table6);
        db.execSQL(table7);
        db.execSQL(table8);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS applicant");
        db.execSQL("DROP TABLE IF EXISTS application");
        db.execSQL("DROP TABLE IF EXISTS household");
        db.execSQL("DROP TABLE IF EXISTS householdincome");
        db.execSQL("DROP TABLE IF EXISTS householdexpense");
        db.execSQL("DROP TABLE IF EXISTS business");
        db.execSQL("DROP TABLE IF EXISTS operatingcost");
        db.execSQL("DROP TABLE IF EXISTS othercost");

        onCreate(db);
    }
}
