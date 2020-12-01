package com.example.aboitez;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatDialogFragment;

public class ExampleDialog extends AppCompatDialogFragment {
    private EditText  eMon,eTue ,eWed, eThu, eFri, eSat, eSun;
    private ExampleDialogListener listener;
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater =getActivity().getLayoutInflater();
        View view = inflater.inflate(R.layout.layout_dialog, null);
        builder.setView(view)
                .setTitle("Gross Daily Sales")
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                })
                .setPositiveButton("Add", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        String MonSales = eMon.getText().toString();
                        String TueSales = eTue.getText().toString();
                        String WedSales = eWed.getText().toString();
                        String ThuSales = eThu.getText().toString();
                        String FriSales = eFri.getText().toString();
                        String SatSales = eSat.getText().toString();
                        String SunSales = eSun.getText().toString();
                        listener.applyTexts(MonSales, TueSales, WedSales, ThuSales, FriSales, SatSales, SunSales);
                    }
                });
        eMon = view.findViewById(R.id.edit_monday);
        eTue = view.findViewById(R.id.edit_tuesday);
        eWed = view.findViewById(R.id.edit_wednesday);
        eThu = view.findViewById(R.id.edit_thursday);
        eFri = view.findViewById(R.id.edit_friday);
        eSat = view.findViewById(R.id.edit_saturday);
        eSun = view.findViewById(R.id.edit_sunday);

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
        void applyTexts(String MonSales, String TueSales, String WedSales, String ThuSales, String FriSales, String SatSales, String SunSales);
    }
}
