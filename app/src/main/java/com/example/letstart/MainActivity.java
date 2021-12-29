package com.example.letstart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button Live;
    private Button MaterialComplex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Live = (Button) findViewById(R.id.Live);
        MaterialComplex = (Button) findViewById(R.id.MaterialComplex);

        Live.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Live == view) {
                    Intent intent = new Intent(MainActivity.this, MainLive.class);
                    startActivity(intent);
                }

            }
        });

       /* MaterialComplex.setOnClickListener(new View.OnClickListener() {     // مجمع المواد
            @Override
            public void onClick(View view) {
                if(MaterialComplex==view){
                    Intent intent = new Intent(MainActivity.this, MAteril.class);
                    startActivity(intent);
                }
            }
        });








    }
    /*
        */
    }
}