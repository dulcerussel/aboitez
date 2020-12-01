package com.example.aboitez;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OtherOperatingCosts extends AppCompatActivity {
    private Button button, button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other_operating_costs);
        button2 = (Button) findViewById(R.id.btnCompute);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenResult1();
            }
        });
        button = (Button) findViewById(R.id.buttonOtherCosts);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialog();
            }
        });
    }

    private void OpenResult1() {
        Intent intent = new Intent(this, Result1.class);
        startActivity(intent);
    }

    private void openDialog() {
        OtherOperatingLayout operatingDialog = new OtherOperatingLayout();
        operatingDialog.show(getSupportFragmentManager(),"example dialog");
    }
}