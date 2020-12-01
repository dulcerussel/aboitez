package com.example.aboitez;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class GrossDailySales extends AppCompatActivity implements ExampleDialog.ExampleDialogListener {
    private TextView monday, tuesday, wednesday, thursday, friday, saturday, sunday;
    private Button button, button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gross_daily_sales);
        monday = (TextView) findViewById(R.id.Monday);
        tuesday = (TextView) findViewById(R.id.Tuesday);
        wednesday = (TextView) findViewById(R.id.Wednesday);
        thursday = (TextView) findViewById(R.id.Thursday);
        friday = (TextView) findViewById(R.id.Friday);
        saturday = (TextView) findViewById(R.id.Saturday);
        sunday = (TextView) findViewById(R.id.Sunday);
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
        startActivity(intent);
    }


    private void openDialog() {
        ExampleDialog exampleDialog = new ExampleDialog();
        exampleDialog.show(getSupportFragmentManager(),"example dialog");
    }

    @Override
    public void applyTexts(String MonSales, String TueSales, String WedSales, String ThuSales, String FriSales, String SatSales, String SunSales) {
        monday.setText(MonSales);
        tuesday.setText(TueSales);
        wednesday.setText(WedSales);
        thursday.setText(ThuSales);
        friday.setText(FriSales);
        saturday.setText(SatSales);
        sunday.setText(SunSales);

    }
}