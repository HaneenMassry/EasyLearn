package com.example.letstart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.TextView;
import android.widget.VideoView;

public class MainLive extends AppCompatActivity {
    private TextView textView;
    private Button button2;
    private Button button3;
    private Button button4;
    private VideoView videoBoard;
    private VideoView videoTeacher;
    private AutoCompleteTextView textLive;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_live);

        textView = (TextView) findViewById(R.id.textView);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        videoBoard = (VideoView) findViewById(R.id.videoBoard);
        videoTeacher = (VideoView) findViewById(R.id.videoTeacher);
        textLive = (AutoCompleteTextView) findViewById(R.id.textLive);


        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (button2 == view) {
                    Intent intent = new Intent(MainLive.this, TextLive.class);
                    startActivity(intent);
                }
            }


        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(button4==view){
                    Intent intent = new Intent(MainLive.this, TeacherVideo.class);
                    startActivity(intent);
                }
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(button3==view){
                    Intent intent = new Intent(MainLive.this, boardVieo.class);
                    startActivity(intent);
                }
            }
        });

    }
}