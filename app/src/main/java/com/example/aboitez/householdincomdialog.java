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

public class householdincomdialog extends AppCompatDialogFragment {
    private EditText sourcein, details, type, amount;
    private Spinner freq;
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View view = inflater.inflate(R.layout.householdincomelayout, null);
        builder.setView(view)
                .setTitle("Household Income")
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
        sourcein = view.findViewById(R.id.edit_sourceIn);
        details = view.findViewById(R.id.edit_details);
        type = view.findViewById(R.id.edit_type);
        freq = view.findViewById(R.id.cbofreq);
        amount = view.findViewById(R.id.edit_amount);
        return builder.create();
    }
}
