package com.example.aboitez;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;


import androidx.appcompat.app.AppCompatDialogFragment;

import java.util.zip.Inflater;

public class OtherOperatingLayout extends AppCompatDialogFragment {
    private EditText fuelTrans, SalWage, label, cost;
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View view = inflater.inflate(R.layout.other_operating_layout, null);
        builder.setView(view)
                .setTitle("Other Operating Costs")
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
        fuelTrans = view.findViewById(R.id.edit_fuelTrans);
        SalWage = view.findViewById(R.id.edit_salWage);
        label = view.findViewById(R.id.edit_Label);
        cost = view.findViewById(R.id.edit_costs);
        return builder.create();
    }
}
