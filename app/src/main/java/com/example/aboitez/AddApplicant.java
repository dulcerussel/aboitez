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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_applicant);
        button = (Button) findViewById(R.id.BtnAddAppli);
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
        String clientname2 = clientname1.getText().toString();
        String groupname2 = groupname1.getText().toString();
        String branch2 = branch1.getText().toString();
        String area2 = area1.getText().toString();
        String date2 = date1.getText().toString();
        String loanapplied2  = loanapplied1.getText().toString();
        String businessname2 = businessname1.getText().toString();
        String businesstype2 = businesstype1.getText().toString();

        intent.putExtra("clientname",clientname2);
        intent.putExtra("groupname",groupname2);
        intent.putExtra("branch",branch2);
        intent.putExtra("area",area2);
        intent.putExtra("date",date2);
        intent.putExtra("loanapplied",loanapplied2);
        intent.putExtra("businessname",businessname2);
        intent.putExtra("businesstype",businesstype2);
        startActivity(intent);
    }
}