package com.example.aboitez;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class householdincome extends AppCompatActivity {
    private Button button, button2;

    private ListView lv;
    private EditText Et;

    ArrayList<String> list;
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_householdincome);

        this.lv = findViewById(R.id.listview2);
        this.Et = findViewById(R.id.editTextNumber);

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

        list  = new ArrayList<String>();
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,list);

        lv.setAdapter(adapter);
    }

    private void openHE() {
        Intent intent = new Intent(this, HouseholdExpenses.class);
        startActivity(intent);
    }

    private void openDialog() {
//        householdincomdialog householdincomdialog =  new householdincomdialog();
//        householdincomdialog.show(getSupportFragmentManager(),"example dialog");

        String result = Et.getText().toString();
        list.add(result);
        adapter.notifyDataSetChanged();
    }
}