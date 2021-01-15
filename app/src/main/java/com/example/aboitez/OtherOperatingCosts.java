package com.example.aboitez;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class OtherOperatingCosts extends AppCompatActivity {
    private Button button, button2;


    private EditText loses;
    private EditText fuel;
    private EditText salaries;

    private EditText others1;
    private EditText others2;
    private EditText others3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other_operating_costs);

        this.loses = findViewById(R.id.loses1);
        this.fuel = findViewById(R.id.loses2);
        this.salaries = findViewById(R.id.salary1);
        this.others1 = findViewById(R.id.other1);
        this.others2 = findViewById(R.id.other2);
        this.others3 = findViewById(R.id.other3);


        button2 = (Button) findViewById(R.id.btnCompute);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenResult1();
            }
        });

    }

    private void OpenResult1() {

//        MyOtherOperatingCost otherOperatingCost = new MyOtherOperatingCost();
//
//        otherOperatingCost.setLoss(Float.parseFloat(this.loses.getText().toString()));
//        otherOperatingCost.setTranspo(Float.parseFloat(this.fuel.getText().toString()));
//        otherOperatingCost.setSalaries(Float.parseFloat(this.salaries.getText().toString()));
//        otherOperatingCost.setOthers(Float.parseFloat(this.others1.getText().toString()));


//        GlobalVariable.loss = Float.parseFloat(this.loses.getText().toString());
//        GlobalVariable.transpo = Float.parseFloat(this.fuel.getText().toString());
//        GlobalVariable.salaries = Float.parseFloat(this.salaries.getText().toString());
//        GlobalVariable.others = Float.parseFloat(this.others1.getText().toString());
//
//        GlobalVariable.netcost = GlobalVariable.weeklypurchase +GlobalVariable.loss + GlobalVariable.transpo + GlobalVariable.salaries + GlobalVariable.others;
//
//        GlobalVariable.netprofit = (float) (GlobalVariable.netcost * 0.25);
//        GlobalVariable.weeklystandsales = (float) (GlobalVariable.netcost * 1.25);
//        GlobalVariable.dailystandavesales= GlobalVariable.weeklystandsales/7;

        Intent intent = new Intent(this, Result1.class);
        startActivity(intent);
    }


}