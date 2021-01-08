package com.example.aboitez;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ViewRes1 extends AppCompatActivity {
    private Button button;
    private TextView txtWeeklySales,txtDailyAveSales,txtWeeklyStandSales,txtDailyStandSales,txtWeeklyNetProfit,txtActualyMarkup,txtStandardMarkUp,txtLoses,txtTotalWeeklyPurchase,txtTotalCost;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_res1);
        button = (Button) findViewById(R.id.btnNext2);
        MyBusiness business = (MyBusiness) getApplicationContext();
        MyApplicant applicant = (MyApplicant) getApplicationContext();
        MyOtherOperatingCost otherOperatingCost = (MyOtherOperatingCost) getApplicationContext();
        MyHousehold household = (MyHousehold) getApplicationContext();
        MyOperatingCost operatingCost = (MyOperatingCost) getApplicationContext();
        MyHouseholdExpense householdExpense = (MyHouseholdExpense) getApplicationContext();
        MyHouseholdIncome householdIncome = (MyHouseholdIncome) getApplicationContext();


        this.txtWeeklySales = (TextView) findViewById(R.id.textView34);
        this.txtDailyAveSales = (TextView) findViewById(R.id.textView33);
        this.txtWeeklyStandSales = (TextView) findViewById(R.id.textView32);
        this.txtDailyStandSales = (TextView) findViewById(R.id.textView31);
        this.txtWeeklyNetProfit = (TextView) findViewById(R.id.textView30);
        this.txtActualyMarkup = (TextView) findViewById(R.id.textView29);
        this.txtStandardMarkUp = (TextView) findViewById(R.id.textView28);
        this.txtLoses = (TextView) findViewById(R.id.textView27);
        this.txtTotalWeeklyPurchase = (TextView) findViewById(R.id.textView26);
        this.txtTotalCost = (TextView) findViewById(R.id.textView25);


        txtWeeklySales.setText(String.valueOf(business.getWeeklysales()));
        txtDailyAveSales.setText(String.valueOf(business.getDailyavesales()));
        txtWeeklyStandSales.setText(String.valueOf(business.getWeeklystandsales()));
        txtDailyStandSales.setText(String.valueOf(business.getDailystandavesales()));
        txtWeeklyNetProfit.setText(String.valueOf(business.getNetprofit()));
        txtActualyMarkup.setText(String.valueOf(business.getActualmarkup()));
        txtStandardMarkUp.setText("25%");
        otherOperatingCost.CalculateLoss(operatingCost.getWeeklypurchase());
        txtLoses.setText(String.valueOf(otherOperatingCost.getLoss()));
        txtTotalWeeklyPurchase.setText(String.valueOf(operatingCost.getWeeklypurchase()));
        txtTotalCost.setText(String.valueOf(business.getNetcost()));


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRes2();
            }
        });
    }

    private void openRes2() {
        Intent intent = new Intent(this, ViewRes2.class);
        startActivity(intent);
    }
}