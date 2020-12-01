package com.example.aboitez;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OperatingCost extends AppCompatActivity {
    private Button button, button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operating_cost);
        button2 = (Button) findViewById(R.id.btnNext);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenOtherOperatingCosts();
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

    private void OpenOtherOperatingCosts() {
        Intent intent = new Intent(this, OtherOperatingCosts.class);
        startActivity(intent);
    }

    private void openDialog() {
        OperatingDialog operatingDialog = new OperatingDialog();
        operatingDialog.show(getSupportFragmentManager(),"example dialog");
    }
}