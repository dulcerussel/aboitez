package com.example.aboitez;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class result2 extends AppCompatActivity {
    private Button button4;
    private TextView txtHouseholdincome,txtHouseholdexpense,txtNethouseholdincome,txtGrossPersonalIncome,txtFamilyLocSize,txtNethouseholdexpense;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result2);

        MyBusiness business = (MyBusiness) getApplicationContext();
        MyApplicant applicant = (MyApplicant) getApplicationContext();
        MyOtherOperatingCost otherOperatingCost = (MyOtherOperatingCost) getApplicationContext();
        MyHousehold household = (MyHousehold) getApplicationContext();
        MyOperatingCost operatingCost = (MyOperatingCost) getApplicationContext();
        MyHouseholdExpense householdExpense = (MyHouseholdExpense) getApplicationContext();
        MyHouseholdIncome householdIncome = (MyHouseholdIncome) getApplicationContext();

        // CHANGEEE THE TEXTVIEW ID
        this.txtHouseholdincome = (TextView) findViewById(R.id.textView34);
        this.txtHouseholdexpense = (TextView) findViewById(R.id.textView33);
        this.txtNethouseholdincome = (TextView) findViewById(R.id.textView32);
        this.txtGrossPersonalIncome = (TextView) findViewById(R.id.textView31);
        this.txtFamilyLocSize = (TextView) findViewById(R.id.textView30);
        this.txtNethouseholdexpense = (TextView) findViewById(R.id.textView29);

        //calculate
        household.CalculateNetHouseholdIncome();
        household.CalculateExpectedHouseHoldExpense();


        txtHouseholdincome.setText(String.valueOf(household.getGrosshouseincome()));
        txtHouseholdexpense.setText(String.valueOf(household.getGrosshouseexpense()));
        txtNethouseholdincome.setText(String.valueOf(household.getNethouseincome()));
        txtGrossPersonalIncome.setText(String.valueOf(household.getGrosspersonalincome()));
        txtFamilyLocSize.setText(String.valueOf(household.getFamilylocsize()));
        txtNethouseholdexpense.setText(String.valueOf(household.getExpectedhouseexpense()));

        button4 = (Button) findViewById(R.id.btnTotalCom);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenResult3();
            }
        });

    }

    private void OpenResult3() {
        Intent intent = new Intent(this, totalCompute.class);
        startActivity(intent);
    }
}