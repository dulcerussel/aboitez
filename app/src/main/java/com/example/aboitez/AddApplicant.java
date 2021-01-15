package com.example.aboitez;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddApplicant extends AppCompatActivity {
    private Button button;


    private EditText clientname1;
    private EditText groupname1;
    private EditText branch1;
    private EditText area1;
    private EditText date1;
    private EditText loanapplied1;
    private EditText businessname1;
    private EditText businesstype1;


    DBHelper db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_applicant);
        button = (Button) findViewById(R.id.BtnAddAppli);


        db = new DBHelper(this);

        this.clientname1 = (EditText) findViewById(R.id.nameofclient);
        this.groupname1 = (EditText) findViewById(R.id.groupname);
        this.branch1 = (EditText) findViewById(R.id.branch);
        this.area1 = (EditText) findViewById(R.id.area);
        this.date1 = (EditText) findViewById(R.id.editTextDate);
        this.loanapplied1 = (EditText) findViewById(R.id.LoanApplied);
        this.businessname1 = (EditText) findViewById(R.id.NameofBusiness);
        this.businesstype1 = (EditText) findViewById(R.id.BusinessType);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity();
            }
        });


    }

    private void openActivity() {
        Intent intent = new Intent(this, GrossDailySales.class);


        GlobalVariable.clientname = clientname1.getText().toString();
        GlobalVariable.groupname = groupname1.getText().toString();
        GlobalVariable.branchname = branch1.getText().toString();
        GlobalVariable.area = area1.getText().toString();
        GlobalVariable.dateconducted =  date1.getText().toString();
        GlobalVariable.loanapplied = loanapplied1.getText().toString();
        GlobalVariable.businessname = businessname1.getText().toString();
        GlobalVariable.businesstype = businesstype1.getText().toString();

//        MyApplicant applicant = new MyApplicant(GlobalVariable.clientname, GlobalVariable.groupname, GlobalVariable.branchname,
//                GlobalVariable.area,GlobalVariable.dateconducted,GlobalVariable.loanapplied, GlobalVariable.businessname,GlobalVariable.businesstype);
//
//        db.insertApplicant(applicant);

        startActivity(intent);
    }
}