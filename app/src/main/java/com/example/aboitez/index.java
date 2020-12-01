package com.example.aboitez;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class index extends AppCompatActivity {
    private Button button, button6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);
        button6 = (Button) findViewById(R.id.view);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openApplicantRecrod();
            }
        });
        button = (Button) findViewById(R.id.btnAdd);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity();
            }
        });
    }

    private void openApplicantRecrod() {
        Intent intent3 = new Intent(this, ApplicantList.class);
        startActivity(intent3);
    }

    private void openActivity() {
        Intent intent = new Intent(this, AddApplicant.class);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mymenu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected( MenuItem item) {
        int id = item.getItemId();
        switch (id){
            case R.id.profile1:
                openProfile();
                break;
            case R.id.logout1:
                openLogin();
                break;
        }
        return true;
    }

    private void openProfile() {
        Intent intent1 = new Intent(this, Profile.class);
        startActivity(intent1);
    }

    private void openLogin() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}