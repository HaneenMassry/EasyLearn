package com.example.letstart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LogIn extends AppCompatActivity {
    private EditText UserNAme;
    private EditText editTextTextPassword2;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
//lhkhkhkjkjj
        UserNAme = (EditText) findViewById(R.id.UserNAme);
        editTextTextPassword2 = (EditText) findViewById(R.id.editTextTextPassword2);
        button = (Button) findViewById(R.id.button);


        UserNAme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (UserNAme == view) {
                    Intent intent = new Intent(LogIn.this, MainActivity.class);
                    startActivity(intent);
                }

            }
        });
    }
}