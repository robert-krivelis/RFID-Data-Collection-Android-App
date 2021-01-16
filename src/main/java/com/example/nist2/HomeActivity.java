package com.example.nist2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Button new_test_button = (Button) findViewById(R.id.new_test_button);
        new_test_button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                openStartTestDialog();
            }
        });
    }

    public void openStartTestDialog(){
        AlertDialog.Builder startTestDialog = new AlertDialog.Builder(HomeActivity.this, R.style.AlertDialogStyle);
        LayoutInflater factory = LayoutInflater.from(HomeActivity.this);
        final View view = factory.inflate(R.layout.layout_dialog, null);
        startTestDialog.setView(view);
        startTestDialog.setPositiveButton("I have trouble scanning", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dlg, int sumthin) {

            }
        });
        startTestDialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dlg, int sumthin) {

            }
        });

        startTestDialog.show();
    }
}