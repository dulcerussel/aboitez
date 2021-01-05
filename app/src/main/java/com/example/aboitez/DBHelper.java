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
        String table1 = "CREATE TABLE "+TBL_APPLICANT+" (id INTEGER PRIMARY KEY autoincrement,clientname TEXT,groupname TEXT,branchname TEXT,area TEXT,dateconducted TEXT,loanapplied TEXT,businessname TEXT,businesstype TEXT)";
        String table2 = "CREATE TABLE "+TBL_APPLICATION+" (id INTEGER PRIMARY KEY autoincrement,applicant_id INTEGER,business_total REAL,household_total REAL,totalnetcombineincome REAL,adc REAL,loanterm TEXT,adcxterms REAL,maxloanamount REAL,FOREIGN KEY (application_id) REFERENCES applicant(id)) ";
        String table3 = "CREATE TABLE "+TBL_HOUSEHOLD+" (id INTEGER PRIMARY KEY autoincrement,application_id INTEGER,grosshouseincome REAL,grosshouseexpense REAL,nethouseincome REAL,grosspersonalincome REAL,familylocsize REAL,expectedhouseexpense REAL,FOREIGN KEY (application_id) REFERENCES applicant(id))";
        String table4 = "CREATE TABLE "+TBL_HOUSEHOLDINCOME+"(id INTEGER PRIMARY KEY autoincrement,household_id INTEGER,sourceincome TEXT,details TEXT,type TEXT,freq TEXT,amount REAL,FOREIGN KEY (household_id) REFERENCES household(id))";
        String table5 = "CREATE TABLE "+TBL_HOUSEHOLDEXPENSE+" (id INTEGER PRIMARY KEY autoincrement,household_id INTEGER,houseutilies TEXT,houserent TEXT,housefood TEXT,housemedicine TEXT,houseeduc TEXT,otherexpense TEXT,FOREIGN KEY (household_id) REFERENCES household(id))";
        String table6 = "CREATE TABLE "+TBL_BUSINESS+" (id INTEGER PRIMARY KEY autoincrement,application_id INTEGER,monday REAL,tuesday REAL,wednesday REAL,thursday REAL,friday REAL,saturday REAL,sunday REAL,weeklysales REAL,dailyavesales REAL,dailystandavesales REAL,actualmarkup REAL,FOREIGN KEY (application_id) REFERENCES applicant(id))";
        String table7 = "CREATE TABLE "+TBL_OPERATINGCOST+" (id INTEGER PRIMARY KEY autoincrement,business_id INTEGER,item TEXT,cost REAL,sales REAL,markup REAL,weeklypurchase REAL,FOREIGN KEY (business_id) REFERENCES business(id))";
        String table8 = "CREATE TABLE "+TBL_OTHERCOST+" (id INTEGER PRIMARY KEY autoincrement,business_id INTEGER,loss REAL,transpo REAL,salaries REAL,others REAL,FOREIGN KEY (business_id) REFERENCES business(id))";

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
    public long insertApplicant(MyApplicant applicant){
        long result=0;
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues cv=new ContentValues();
        cv.put("clientname",applicant.getClientname());
        cv.put("groupname",applicant.getGroupname());
        cv.put("branchname",applicant.getBranchname());
        cv.put("area",applicant.getArea());
        cv.put("dateconducted",applicant.getDateconducted());
        cv.put("loanapplied",applicant.getLoanapplied());
        cv.put("businessname",applicant.getBusinessname());
        cv.put("businesstype",applicant.getBusinessname());

        //insert the content value data
        result=db.insert(TBL_APPLICANT,null,cv); //write the data
        db.close();
        return result;
    }



    public long insertApplicantion(MyApplication application){
        long result=0;
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues cv=new ContentValues();
        cv.put("applicant_id",application.getApplicant_id());
        cv.put("business_total",application.getBusiness_total());
        cv.put("household_total",application.getHousehold_total());
        cv.put("totalnetcombineincome",application.getTotalnetcombineincome());
        cv.put("adc",application.getAdc());
        cv.put("loanterm",application.getLoanterm());
        cv.put("adcxterms",application.getAdcxterms());
        cv.put("maxloanamount",application.getMaxloanamount());

        //insert the content value data
        result=db.insert(TBL_APPLICATION,null,cv); //write the data
        db.close();
        return result;
    }

    public long insertHousehold(MyHousehold household){
        long result=0;
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues cv=new ContentValues();
        cv.put("application_id",household.getApplication_id());
        cv.put("grosshouseincome",household.getGrosshouseincome());
        cv.put("grosshouseexpense",household.getGrosshouseexpense());
        cv.put("nethouseincome",household.getNethouseincome());
        cv.put("grosspersonalincome",household.getGrosspersonalincome());
        cv.put("familylocsize",household.getFamilylocsize());
        cv.put("expectedhouseexpense",household.getExpectedhouseexpense());



        //insert the content value data
        result=db.insert(TBL_HOUSEHOLD,null,cv); //write the data
        db.close();
        return result;
    }

    public long insertHouseholdExpenses(MyHouseholdExpense householdExpense){
        long result=0;
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues cv=new ContentValues();
        cv.put("household_id",householdExpense.getHousehold_id());
        cv.put("houseutilies",householdExpense.getHouseutilies());
        cv.put("houserent",householdExpense.getHouserent());
        cv.put("housefood",householdExpense.getHousefood());
        cv.put("housemedicine",householdExpense.getHousemedicine());
        cv.put("houseeduc",householdExpense.getHouseeduc());
        cv.put("otherexpense",householdExpense.getOtherexpense());

        //insert the content value data
        result=db.insert(TBL_HOUSEHOLDEXPENSE,null,cv); //write the data
        db.close();
        return result;
    }

    public long insertHouseholdIncome(MyHouseholdIncome householdIncome){
        long result=0;
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues cv=new ContentValues();
        cv.put("household_id",householdIncome.getHousehold_id());
        cv.put("sourceincome",householdIncome.getSourceincome());
        cv.put("details",householdIncome.getDetails());
        cv.put("type",householdIncome.getType());
        cv.put("freq",householdIncome.getFreq());
        cv.put("amount",householdIncome.getAmount());


        //insert the content value data
        result=db.insert(TBL_HOUSEHOLDINCOME,null,cv); //write the data
        db.close();
        return result;
    }

    public long insertBusiness(MyBusiness business){
        long result=0;
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues cv=new ContentValues();
        cv.put("application_id",business.getApplication_id());
        cv.put("monday",business.getMonday());
        cv.put("tuesday",business.getTuesday());
        cv.put("wednesday",business.getWednesday());
        cv.put("thursday",business.getThursday());
        cv.put("friday",business.getFriday());
        cv.put("saturday",business.getSaturday());
        cv.put("sunday",business.getSunday());
        cv.put("weeklysales",business.getWeeklysales());
        cv.put("dailyavesales",business.getDailyavesales());
        cv.put("dailystandavesales",business.getDailystandavesales());
        cv.put("actualmarkup",business.getActualmarkup());

        //insert the content value data
        result=db.insert(TBL_BUSINESS,null,cv); //write the data
        db.close();
        return result;
    }

    public long insertMyOperatingCost(MyOperatingCost operatingCost){
        long result=0;
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues cv=new ContentValues();
        cv.put("business_id",operatingCost.getBusiness_id());
        cv.put("item",operatingCost.getItem());
        cv.put("cost",operatingCost.getCost());
        cv.put("sales",operatingCost.getSales());
        cv.put("markup",operatingCost.getMarkup());
        cv.put("weeklypurchase",operatingCost.getWeeklypurchase());

        //insert the content value data
        result=db.insert(TBL_OPERATINGCOST,null,cv); //write the data
        db.close();
        return result;
    }

    public long insertMyOtherOperatingCost(MyOtherOperatingCost otherOperatingCost){
        long result=0;
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues cv=new ContentValues();
        cv.put("business_id",otherOperatingCost.getBusiness_id());
        cv.put("loss",otherOperatingCost.getLoss());
        cv.put("transpo",otherOperatingCost.getTranspo());
        cv.put("salaries",otherOperatingCost.getSalaries());
        cv.put("others",otherOperatingCost.getOthers());

        //insert the content value data
        result=db.insert(TBL_OTHERCOST,null,cv); //write the data
        db.close();
        return result;
    }

}
