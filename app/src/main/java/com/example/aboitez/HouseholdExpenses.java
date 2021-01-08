package com.example.aboitez;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class HouseholdExpenses extends AppCompatActivity {
    private Button button2, button3;
    private EditText HU, HR, FG,Med,EA, label, cost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_household_expenses);


        HU = findViewById(R.id.edit_HU);
        HR = findViewById(R.id.edit_HR);
        FG = findViewById(R.id.edit_fg);
        Med = findViewById(R.id.edit_med);
        EA = findViewById(R.id.edit_EA);
        label = findViewById(R.id.edit_label1);
        cost = findViewById(R.id.edit_cost2);
        button3 = (Button) findViewById(R.id.btnCompute);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openResult2();
            }
        });

    }

    private void openResult2() {
        Intent intent = new Intent(this, result2.class);
        String HouseHoldUtilies = HU.getText().toString();
        String HouseHoldRent = HR.getText().toString();
        String HouseHoldFoodGroceries = FG.getText().toString();
        String HouseHoldMedicine = Med.getText().toString();
        String HouseHoldEducationAllowance = EA.getText().toString();
        String HouseHoldOther = label.getText().toString();
        String HouseHoldOtherPrice= cost.getText().toString();


//        MyHouseholdExpense householdExpense = new MyHouseholdExpense();
//
//        householdExpense.setHouseutilies(Float.parseFloat(HouseHoldUtilies));
//        householdExpense.setHouserent(Float.parseFloat(HouseHoldRent));
//        householdExpense.setHousefood(Float.parseFloat(HouseHoldFoodGroceries));
//        householdExpense.setHousemedicine(Float.parseFloat(HouseHoldMedicine));
//        householdExpense.setHouseeduc(Float.parseFloat(HouseHoldEducationAllowance));
//        householdExpense.setOtherexpense(Float.parseFloat(HouseHoldOtherPrice));

        GlobalVariable.houseutilies = Float.parseFloat(HouseHoldUtilies);
        GlobalVariable.houserent = Float.parseFloat(HouseHoldRent);
        GlobalVariable.housefood = Float.parseFloat(HouseHoldFoodGroceries);
        GlobalVariable.housemedicine = Float.parseFloat(HouseHoldMedicine);
        GlobalVariable.houseeduc = Float.parseFloat(HouseHoldEducationAllowance);
        GlobalVariable.otherexpense = Float.parseFloat(HouseHoldOtherPrice);

        //calculate




        startActivity(intent);
    }


}