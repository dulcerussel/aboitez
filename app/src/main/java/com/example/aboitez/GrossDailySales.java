package com.example.aboitez;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class GrossDailySales extends AppCompatActivity implements ExampleDialog.ExampleDialogListener {
    private TextView monday1, tuesday1, wednesday1, thursday1, friday1, saturday1, sunday1;
    private Button button, button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gross_daily_sales);
        monday1 = (TextView) findViewById(R.id.Monday);
        tuesday1 = (TextView) findViewById(R.id.Tuesday);
        wednesday1 = (TextView) findViewById(R.id.Wednesday);
        thursday1 = (TextView) findViewById(R.id.Thursday);
        friday1 = (TextView) findViewById(R.id.Friday);
        saturday1 = (TextView) findViewById(R.id.Saturday);
        sunday1 = (TextView) findViewById(R.id.Sunday);
        button2 = (Button) findViewById(R.id.btnNext);


        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenOperatingCost();
            }
        });


        button = (Button) findViewById(R.id.imgbutton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialog();
            }
        });
    }

    private void OpenOperatingCost() {
        Intent intent = new Intent(this, OperatingCost.class);

//        MyBusiness business = new MyBusiness();
//
//        business.setMonday(Float.parseFloat(monday1.getText().toString()));
//        business.setTuesday(Float.parseFloat(tuesday1.getText().toString()));
//        business.setWednesday(Float.parseFloat(wednesday1.getText().toString()));
//        business.setThursday(Float.parseFloat(thursday1.getText().toString()));
//        business.setFriday(Float.parseFloat(friday1.getText().toString()));
//        business.setSaturday(Float.parseFloat(saturday1.getText().toString()));
//        business.setSunday(Float.parseFloat(sunday1.getText().toString()));

        GlobalVariable.monday =Float.parseFloat(monday1.getText().toString());
        GlobalVariable.tuesday =Float.parseFloat(tuesday1.getText().toString());
        GlobalVariable.wednesday =Float.parseFloat(wednesday1.getText().toString());
        GlobalVariable.thursday =Float.parseFloat(thursday1.getText().toString());
        GlobalVariable.friday =Float.parseFloat(friday1.getText().toString());
        GlobalVariable.saturday =Float.parseFloat(saturday1.getText().toString());
        GlobalVariable.sunday =Float.parseFloat(sunday1.getText().toString());

        startActivity(intent);
    }


    private void openDialog() {
        ExampleDialog exampleDialog = new ExampleDialog();
        exampleDialog.show(getSupportFragmentManager(),"example dialog");
    }

    @Override
    public void applyTexts(String MonSales, String TueSales, String WedSales, String ThuSales, String FriSales, String SatSales, String SunSales) {
        monday1.setText(MonSales);
        tuesday1.setText(TueSales);
        wednesday1.setText(WedSales);
        thursday1.setText(ThuSales);
        friday1.setText(FriSales);
        saturday1.setText(SatSales);
        sunday1.setText(SunSales);

    }
}