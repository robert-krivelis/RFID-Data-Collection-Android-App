package com.example.nist2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
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
                openDialog();
            }
        });
    }

    public void openDialog(){
        NewTestDialog newTestDialog = new NewTestDialog();
        newTestDialog.show(getSupportFragmentManager(), "example dialog");
    }
}