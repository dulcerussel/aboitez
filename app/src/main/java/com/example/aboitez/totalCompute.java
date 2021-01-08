package com.example.aboitez;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class totalCompute extends AppCompatActivity {
    private Button button5;
    private TextView txttotalhousehold, txttotalbusiness,txttotalnetcombineincome,txtadc,loanterms,txtadcxterms,txtmaxloanamount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_total_compute);

        MyBusiness business = (MyBusiness) getApplicationContext();
        MyApplicant applicant = (MyApplicant) getApplicationContext();
        MyApplication application = (MyApplication) getApplicationContext();
        MyOtherOperatingCost otherOperatingCost = (MyOtherOperatingCost) getApplicationContext();
        MyHousehold household = (MyHousehold) getApplicationContext();
        MyOperatingCost operatingCost = (MyOperatingCost) getApplicationContext();
        MyHouseholdExpense householdExpense = (MyHouseholdExpense) getApplicationContext();
        MyHouseholdIncome householdIncome = (MyHouseholdIncome) getApplicationContext();


        this.txttotalhousehold = (TextView) findViewById(R.id.textView47);
        this.txttotalbusiness = (TextView) findViewById(R.id.textView46);
        this.txttotalnetcombineincome = (TextView) findViewById(R.id.textView45);
        this.txtadc = (TextView) findViewById(R.id.textView44);
        this.loanterms = (TextView) findViewById(R.id.textView43);
        this.txtadcxterms = (TextView) findViewById(R.id.textView42);
        this.txtmaxloanamount = (TextView) findViewById(R.id.textView41);

        //calculate
        float x = business.getNetprofit();
        float y = household.getNethouseincome();



        application.CalculateNetBusinessIncome(x);
        application.CalculateNetCombineIncome(x,y);

        float w = application.getTotalnetcombineincome();

        application.CalculateAdjustedDebtCapacity(w);
        application.CalculateADCxTerms();
        application.MaxLoanAmountAvailment();

        txttotalhousehold.setText(String.valueOf(application.getHousehold_total()));
        txttotalbusiness.setText(String.valueOf(application.getBusiness_total()));
        txttotalnetcombineincome.setText(String.valueOf(application.getTotalnetcombineincome()));
        txtadc.setText(String.valueOf(application.getAdc()));
        loanterms.setText(String.valueOf(application.getLoanterm()));
        txtadcxterms.setText(String.valueOf(application.getAdcxterms()));
        txtmaxloanamount.setText(String.valueOf(application.getMaxloanamount()));

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