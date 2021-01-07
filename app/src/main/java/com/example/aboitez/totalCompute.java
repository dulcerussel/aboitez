package com.example.aboitez;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class totalCompute extends AppCompatActivity {
    private Button button5;
    private TextView txtBusinesstotal, txtHouseholdtotal, txtTotalnetcombine, txtAdc, txtAdcxterms, txtMaxloan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_total_compute);


        MyApplication application1 = (MyApplication) getApplicationContext();
        MyBusiness business = (MyBusiness) getApplicationContext();
        MyApplicant applicant = (MyApplicant) getApplicationContext();
        MyOtherOperatingCost otherOperatingCost = (MyOtherOperatingCost) getApplicationContext();
        MyHousehold household = (MyHousehold) getApplicationContext();
        MyOperatingCost operatingCost = (MyOperatingCost) getApplicationContext();
        MyHouseholdExpense householdExpense = (MyHouseholdExpense) getApplicationContext();
        MyHouseholdIncome householdIncome = (MyHouseholdIncome) getApplicationContext();

        // CHANGEEE THE TEXTVIEW ID
        this.txtBusinesstotal = (TextView) findViewById(R.id.textView34);
        this.txtHouseholdtotal = (TextView) findViewById(R.id.textView33);
        this.txtTotalnetcombine = (TextView) findViewById(R.id.textView32);
        this.txtAdc = (TextView) findViewById(R.id.textView31);
        this.txtAdcxterms = (TextView) findViewById(R.id.textView30);
        this.txtMaxloan = (TextView) findViewById(R.id.textView29);

        //calculate

        //application1
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