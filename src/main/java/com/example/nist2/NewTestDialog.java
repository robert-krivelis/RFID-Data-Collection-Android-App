package com.example.nist2;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDialogFragment;

public class NewTestDialog extends AppCompatActivity {

    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder alertadd = new AlertDialog.Builder(NewTestDialog.this);
        LayoutInflater factory = LayoutInflater.from(NewTestDialog.this);
        final View view = factory.inflate(R.layout.layout_dialog, null);
        alertadd.setView(view);
        alertadd.setNeutralButton("Here!", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dlg, int sumthin) {

            }
        });

        alertadd.show();

        return alertadd.create();
    }
}
