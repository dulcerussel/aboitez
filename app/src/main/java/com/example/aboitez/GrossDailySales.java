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
    String clientname1, groupname1, branch1, area1, date1, loanapplied1, businessname1, businesstype1;
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

    //getting values from Add Applicant Page
        clientname1 = getIntent().getExtras().getString("clientname");
        groupname1 = getIntent().getExtras().getString("groupname");
        branch1 = getIntent().getExtras().getString("branch");
        area1 = getIntent().getExtras().getString("area");
        date1 = getIntent().getExtras().getString("date");
        loanapplied1 = getIntent().getExtras().getString("loanapplied");
        businessname1 = getIntent().getExtras().getString("businessname");
        businesstype1 = getIntent().getExtras().getString("businesstype");



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
        String clientname2 = clientname1;
        String groupname2 = groupname1;
        String branch2 = branch1;
        String area2 = area1;
        String date2 = date1;
        String loanapplied2  = loanapplied1;
        String businessname2 = businessname1;
        String businesstype2 = businesstype1;

        String monday2 = monday1.getText().toString();
        String tuesday2 = tuesday1.getText().toString();
        String wednesday2 = wednesday1.getText().toString();
        String thursday2 = thursday1.getText().toString();
        String friday2 = friday1.getText().toString();
        String saturday2 = saturday1.getText().toString();
        String sunday2 = sunday1.getText().toString();


        intent.putExtra("clientname",clientname2);
        intent.putExtra("groupname",groupname2);
        intent.putExtra("branch",branch2);
        intent.putExtra("area",area2);
        intent.putExtra("date",date2);
        intent.putExtra("loanapplied",loanapplied2);
        intent.putExtra("businessname",businessname2);
        intent.putExtra("businesstype",businesstype2);

        intent.putExtra("monday",monday2);
        intent.putExtra("tuesday",tuesday2);
        intent.putExtra("wednesday",wednesday2);
        intent.putExtra("thursday",thursday2);
        intent.putExtra("friday",friday2);
        intent.putExtra("saturday",saturday2);
        intent.putExtra("sunday",sunday2);

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