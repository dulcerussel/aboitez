package com.example.aboitez;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatDialogFragment;

import java.util.zip.Inflater;

public class HousholdExpensesDialog extends AppCompatDialogFragment {
    private EditText HU, HR, FG,Med,EA, label, cost;
    private ExampleDialogListener listener;
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

                        String HouseHoldUtilies = HU.getText().toString();
                        String HouseHoldRent = HR.getText().toString();
                        String HouseHoldFoodGroceries = FG.getText().toString();
                        String HouseHoldMedicine = Med.getText().toString();
                        String HouseHoldEducationAllowance = EA.getText().toString();
                        String HouseHoldOther = label.getText().toString();
                        String HouseHoldOtherPrice= cost.getText().toString();

                        listener.applyTexts(HouseHoldUtilies, HouseHoldRent, HouseHoldFoodGroceries, HouseHoldMedicine, HouseHoldEducationAllowance, HouseHoldOther, HouseHoldOtherPrice);
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

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        try {
            listener = (ExampleDialogListener) context;
        } catch (ClassCastException e) {
            throw new ClassCastException(context.toString() +
                    "must implement ExampleDialogListener");
        }
    }

    public interface ExampleDialogListener{
        void applyTexts(String HouseHoldUtilies, String HouseHoldRent, String HouseHoldFoodGroceries, String HouseHoldMedicine, String HouseHoldEducationAllowanc, String HouseHoldEducationAllowance, String HouseHoldOther);
    }
}
