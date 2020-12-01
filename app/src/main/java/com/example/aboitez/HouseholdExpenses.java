package com.example.aboitez;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HouseholdExpenses extends AppCompatActivity {
    private Button button2, button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_household_expenses);
        button3 = (Button) findViewById(R.id.btnCompute);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openResult2();
            }
        });
        button2 = (Button) findViewById(R.id.btnAdd2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialog();
            }
        });
    }

    private void openResult2() {
        Intent intent = new Intent(this, result2.class);
        startActivity(intent);
    }

    private void openDialog() {
        HousholdExpensesDialog housholdExpensesDialog = new HousholdExpensesDialog();
        housholdExpensesDialog.show(getSupportFragmentManager(), "example dialog");
    }
}