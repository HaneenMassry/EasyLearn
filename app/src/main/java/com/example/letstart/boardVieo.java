package com.example.letstart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.TextView;
import android.widget.VideoView;

public class boardVieo extends AppCompatActivity {
    private TextView textView5;
    private TextView textView6;
    private Button button7;
    private VideoView videoView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_board_vieo);

        textView5 = (TextView) findViewById(R.id.textView5);
        textView6 = (TextView) findViewById(R.id.textView6);
        button7= (Button) findViewById(R.id.button6);
        videoView2 = (VideoView) findViewById(R.id.videoView2);

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(button7==view)
                {
                    Intent intent = new Intent(boardVieo.this, MainLive.class);
                    startActivity(intent);
                }
            }
        });


    }
}