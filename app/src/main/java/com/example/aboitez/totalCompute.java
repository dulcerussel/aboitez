package com.example.aboitez;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class totalCompute extends AppCompatActivity {
    private Button button5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_total_compute);

        MyBusiness business = (MyBusiness) getApplicationContext();
        MyApplicant applicant = (MyApplicant) getApplicationContext();
        MyOtherOperatingCost otherOperatingCost = (MyOtherOperatingCost) getApplicationContext();
        MyHousehold household = (MyHousehold) getApplicationContext();
        MyOperatingCost operatingCost = (MyOperatingCost) getApplicationContext();
        MyHouseholdExpense householdExpense = (MyHouseholdExpense) getApplicationContext();
        MyHouseholdIncome householdIncome = (MyHouseholdIncome) getApplicationContext();
        button5 = (Button) findViewById(R.id.btnDone);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openIndex();
            }
        });
    }

    private void openIndex() {
        Intent intent = new Intent(this, index.class);
        startActivity(intent);
    }
}