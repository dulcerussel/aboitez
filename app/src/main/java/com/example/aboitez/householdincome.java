package com.example.aboitez;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class householdincome extends AppCompatActivity {
    private Button button, button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_householdincome);
        button2 = (Button) findViewById(R.id.btnNext1);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHE();
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

    private void openHE() {
        Intent intent = new Intent(this, HouseholdExpenses.class);
        startActivity(intent);
    }

    private void openDialog() {
        householdincomdialog householdincomdialog =  new householdincomdialog();
        householdincomdialog.show(getSupportFragmentManager(),"example dialog");
    }
}