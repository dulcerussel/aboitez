package com.example.aboitez;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class result2 extends AppCompatActivity {
    private Button button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result2);
        button4 = (Button) findViewById(R.id.btnTotalCom);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenResult3();
            }
        });

    }

    private void OpenResult3() {
        Intent intent = new Intent(this, totalCompute.class);
        startActivity(intent);
    }
}