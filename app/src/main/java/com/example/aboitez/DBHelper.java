package com.example.aboitez;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "AboitizLoan";
    public static final String TBL_APPLICANT = "applicant";
    public static final String TBL_APPLICATION = "application";
    public static final String TBL_HOUSEHOLD = "household";
    public static final String TBL_HOUSEHOLDINCOME = "householdincom";
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
        String table1 = "CREATE TABLE "+TBL_APPLICANT+" (id INTEGER PRIMARY KEY,clientname TEXT,groupname TEXT,branchname TEXT,area TEXT,dateconducted TEXT,loanapplied TEXT,businessname TEXT,businesstype TEXT)";
        String table2 = "CREATE TABLE "+TBL_APPLICATION+" (id INTEGER PRIMARY KEY,applicant_id INTEGER,business_total REAL,household_total REAL,totalnetcombineincome REAL,adc REAL,loanterm TEXT,adcxterms REAL,maxloanamount REAL,FOREIGN KEY (application_id) REFERENCES applicant(id)) ";
        String table3 = "CREATE TABLE "+TBL_HOUSEHOLD+" (id INTEGER PRIMARY KEY,application_id INTEGER,grosshouseincome REAL,grosshouseexpense REAL,nethouseincome REAL,grosspersonalincome REAL,familylocsize REAL,expectedhouseexpense REAL,FOREIGN KEY (application_id) REFERENCES applicant(id))";
        String table4 = "CREATE TABLE "+TBL_HOUSEHOLDINCOME+"(id INTEGER PRIMARY KEY,household_id INTEGER,sourceincome TEXT,details TEXT,type TEXT,freq TEXT,amount REAL,FOREIGN KEY (household_id) REFERENCES household(id))";
        String table5 = "CREATE TABLE "+TBL_HOUSEHOLDEXPENSE+" (id INTEGER PRIMARY KEY,household_id INTEGER,houseutilies TEXT,houserent TEXT,housefood TEXT,housemedicine TEXT,houseeduc TEXT,otherexpense TEXT,FOREIGN KEY (household_id) REFERENCES household(id))";
        String table6 = "CREATE TABLE "+TBL_BUSINESS+" (id INTEGER PRIMARY KEY,application_id INTEGER,monday REAL,tuesday REAL,wednesday REAL,thursday REAL,friday REAL,saturday REAL,sunday REAL,weeklysales REAL,dailyavesales REAL,dailystandavesales REAL,actualmarkup REAL,FOREIGN KEY (application_id) REFERENCES applicant(id))";
        String table7 = "CREATE TABLE "+TBL_OPERATINGCOST+" (id INTEGER PRIMARY KEY,business_id INTEGER,item TEXT,cost REAL,sales REAL,markup REAL,weeklypurchase REAL,FOREIGN KEY (business_id) REFERENCES business(id))";
        String table8 = "CREATE TABLE "+TBL_OTHERCOST+" (id INTEGER PRIMARY KEY,business_id INTEGER,loss REAL,transpo REAL,salaries REAL,others REAL,FOREIGN KEY (business_id) REFERENCES business(id))";

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

    //create insert methods
    public boolean insertApplicant(MyApplicant applicant){
        long result  = 0;
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
    }
}
