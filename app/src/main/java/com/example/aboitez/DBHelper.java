package com.example.aboitez;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper {
    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "AboitizLoan.db";

    public DBHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DATABASE_NAME, factory, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String table1 = "CREATE TABLE applicant (id INTEGER PRIMARY KEY,name TEXT)";
        String table2 = "CREATE TABLE application (id INTEGER PRIMARY KEY,name TEXT)";
        String table3 = "CREATE TABLE household (id INTEGER PRIMARY KEY,name TEXT)";
        String table4 = "CREATE TABLE householdincome (id INTEGER PRIMARY KEY,name TEXT)";
        String table5 = "CREATE TABLE householdexpense (id INTEGER PRIMARY KEY,name TEXT)";
        String table6 = "CREATE TABLE business (id INTEGER PRIMARY KEY,name TEXT)";
        String table7 = "CREATE TABLE operatingcost (id INTEGER PRIMARY KEY,name TEXT)";
        String table8 = "CREATE TABLE othercost (id INTEGER PRIMARY KEY,name TEXT)";

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
