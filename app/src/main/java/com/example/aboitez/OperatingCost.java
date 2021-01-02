package com.example.aboitez;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class OperatingCost extends AppCompatActivity {
    private Button button, button2;
    private ListView lv;

    ArrayList<String> list = new ArrayList<String>();
    ArrayAdapter<String> adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operating_cost);

        this.lv = findViewById(R.id.listview);



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