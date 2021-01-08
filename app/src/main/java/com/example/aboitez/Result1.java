package com.example.aboitez;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Result1 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result1);

//        MyBusiness business = new MyBusiness();
//
//        MyOtherOperatingCost otherOperatingCost = new MyOtherOperatingCost();
//
//        MyOperatingCost operatingCost = new MyOperatingCost();


        TextView txtWeeklySales = (TextView) findViewById(R.id.textView34);
        TextView txtDailyAveSales = (TextView) findViewById(R.id.textView33);
        TextView txtWeeklyStandSales = (TextView) findViewById(R.id.textView32);
        TextView txtDailyStandSales = (TextView) findViewById(R.id.textView31);
        TextView txtWeeklyNetProfit = (TextView) findViewById(R.id.textView30);
        TextView txtActualyMarkup = (TextView) findViewById(R.id.textView29);
        TextView txtStandardMarkUp = (TextView) findViewById(R.id.textView28);
        TextView txtLoses = (TextView) findViewById(R.id.textView27);
        TextView txtTotalWeeklyPurchase = (TextView) findViewById(R.id.textView26);
        TextView txtTotalCost = (TextView) findViewById(R.id.textView25);



        txtWeeklySales.setText(String.valueOf(GlobalVariable.weeklysales));
        txtDailyAveSales.setText(String.valueOf(GlobalVariable.dailyavesales));
        txtWeeklyStandSales.setText(String.valueOf(GlobalVariable.weeklystandsales));
        txtDailyStandSales.setText(String.valueOf(GlobalVariable.dailystandavesales));
        txtWeeklyNetProfit.setText(String.valueOf(GlobalVariable.netprofit));
        txtActualyMarkup.setText(String.valueOf(GlobalVariable.actualmarkup));
        txtStandardMarkUp.setText("25%");
        //Calculate
//        otherOperatingCost.CalculateLoss(GlobalVariable.weeklypurchase());

        txtLoses.setText(String.valueOf(GlobalVariable.loss));
        txtTotalWeeklyPurchase.setText(String.valueOf(GlobalVariable.weeklypurchase));
        txtTotalCost.setText(String.valueOf(GlobalVariable.netcost));

        Button button = (Button) findViewById(R.id.btnCon);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHouseholdIncome();
            }
        });
    }

    private void openHouseholdIncome() {
        Intent intent = new Intent(this, householdincome.class);
        startActivity(intent);
    }
}