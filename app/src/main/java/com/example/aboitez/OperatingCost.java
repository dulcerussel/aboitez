package com.example.aboitez;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class OperatingCost extends AppCompatActivity {
    private Button button, button2;
    private ListView lv;

    ArrayList<MyOperatingCost> list;
    MyOperatingCostAdapter adapter;
    AdapterView.AdapterContextMenuInfo info;
    DBHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operating_cost);

        this.lv = findViewById(R.id.listview);

        db = new DBHelper(this);

        if(db.getAllOperatingCost()!=null){
            list=db.getAllOperatingCost();
        }

        adapter = new MyOperatingCostAdapter(this,list);
        lv.setAdapter(adapter);
        this.registerForContextMenu(lv);
        adapter.notifyDataSetChanged();

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
        long result = 0;
      String message=null;
      OperatingDialog operatingDialog = new OperatingDialog();
       operatingDialog.show(getSupportFragmentManager(),"example dialog");
       MyOperatingCost operatingCost = new MyOperatingCost(GlobalVariable.item, GlobalVariable.cost, GlobalVariable.sales, GlobalVariable.markup,GlobalVariable.weeklypurchase);
      result=db.insertMyOperatingCost(operatingCost);
      message=(result>0)?"Operating Added":"";
      Toast.makeText(this,message,Toast.LENGTH_SHORT).show();
      list.add(operatingCost);
        adapter.notifyDataSetChanged();
   }
}