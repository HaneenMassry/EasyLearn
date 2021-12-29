package com.example.letstart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.TextView;

public class TextLive extends AppCompatActivity {
    private TextView textView2;
    private Button button5;
    private AutoCompleteTextView TextLive2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_live);

        textView2 = (TextView) findViewById(R.id.textView2);
        button5= (Button) findViewById(R.id.button5);
        TextLive2 = (AutoCompleteTextView) findViewById(R.id.TextLive2);

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(button5==view)
                {
                    Intent intent = new Intent(TextLive.this, MainLive.class);
                    startActivity(intent);
                }
            }
        });



    }
}