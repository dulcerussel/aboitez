package com.example.aboitez;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;


import androidx.appcompat.app.AppCompatDialogFragment;

import java.util.zip.Inflater;

public class HousholdExpensesDialog extends AppCompatDialogFragment {
    private EditText HU, HR, FG,Med,EA, label, cost;
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View view = inflater.inflate(R.layout.householdexpenses_layout, null);
        builder.setView(view)
                .setTitle("Household Expenses")
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
        HU = view.findViewById(R.id.edit_HU);
        HR = view.findViewById(R.id.edit_HR);
        FG = view.findViewById(R.id.edit_fg);
        Med = view.findViewById(R.id.edit_med);
        EA = view.findViewById(R.id.edit_EA);
        label = view.findViewById(R.id.edit_label1);
        cost = view.findViewById(R.id.edit_cost2);
        return builder.create();
    }
}
