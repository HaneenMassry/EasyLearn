package com.example.letstart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class info extends AppCompatActivity {
    private Button OK;
    private TextView Hello;
    private TextView info;
    private ImageView Logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        OK=(Button) findViewById(R.id.OK);
        Hello=(TextView) findViewById(R.id.Hello);
        info=(TextView) findViewById(R.id.info);

        Logo=(ImageView)findViewById(R.id.Logo) ;

        OK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(OK==view)
                {
                    Intent intent = new Intent(info.this, MainActivity.class);
                    startActivity(intent);
                }
            }
        });


    }
}