package com.example.aboitez;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddApplicant extends AppCompatActivity {
    private Button button;
    private Button btnSave;

    public MyApplicant applicant;

    {
        applicant = new MyApplicant();
    }

    private EditText clientname1;
    private EditText groupname1;
    private EditText branch1;
    private EditText area1;
    private EditText date1;
    private EditText loanapplied1;
    private EditText businessname1;
    private EditText businesstype1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_applicant);
        button = (Button) findViewById(R.id.BtnAddAppli);
        btnSave = findViewById(R.id.btnSave1);
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
       applicant.setClientname(clientname1.getText().toString());
        applicant.setGroupname(groupname1.getText().toString());
        applicant.setBranchname(branch1.getText().toString());
        applicant.setArea(area1.getText().toString());
        applicant.setDateconducted(date1.getText().toString());
        applicant.setLoanapplied(loanapplied1.getText().toString());
        applicant.setBusinessname(businessname1.getText().toString());
        applicant.setBusinesstype(businesstype1.getText().toString());


        startActivity(intent);
    }
}