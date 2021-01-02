package com.example.aboitez;

import android.content.Context;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;

public class MyListAdapter extends ArrayAdapter<String> {


    public MyListAdapter(@NonNull Context context, int resource) {
        super(context, resource);
    }
}
