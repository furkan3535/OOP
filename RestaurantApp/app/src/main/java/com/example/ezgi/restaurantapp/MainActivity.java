package com.example.ezgi.restaurantapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private EditText ID, pass;
    private TextView out;
    private boolean check = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        out = findViewById(R.id.output);
        ID = findViewById(R.id.accountID);
        pass = findViewById(R.id.accountPass);
        button = findViewById(R.id.enterButton);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkingAccount();

            }
        });


    }

    public void changeActivity() {
        Intent myIntent = new Intent(this, BossPanel.class);
        startActivity(myIntent);
    }

    public void checkingAccount() {
        if (ID.getText().toString().equals("root")) {
            if (pass.getText().toString().equals("toor")) {
                out.setText("login as boss");
                changeActivity();

            } else {
                out.setText("wrong account");
            }
        } else if (ID.getText().toString().equals("waiter")) {
            if (pass.getText().toString().equals("waiter123")) {
                out.setText("login as waiter");
            } else {
                out.setText("wrong account");
            }
        } else {
            out.setText("wrong account");
        }


    }

}