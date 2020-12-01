package com.example.aboitez;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;


import androidx.appcompat.app.AppCompatDialogFragment;

public class OperatingDialog extends AppCompatDialogFragment {
    private EditText item, costs, sales, wp;
    @Override
    public Dialog onCreateDialog( Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater =getActivity().getLayoutInflater();
        View view = inflater.inflate(R.layout.operatinglayout, null);
        builder.setView(view)
                .setTitle("Operating Costs")
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                })
                .setPositiveButton("Add", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
        item = view.findViewById(R.id.edit_item);
        costs = view.findViewById(R.id.edit_costs);
        sales = view.findViewById(R.id.edit_sales);
        wp = view.findViewById(R.id.edit_wp);
        return builder.create();
    }
}
