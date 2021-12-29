package com.example.letstart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.VideoView;

public class TeacherVideo extends AppCompatActivity {
    private TextView textView3;
    private TextView textView4;
    private Button button6;
    private VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_video);

        textView3 = (TextView) findViewById(R.id.textView3);
        textView4 = (TextView) findViewById(R.id.textView4);
        button6 = (Button) findViewById(R.id.button6);
        videoView = (VideoView) findViewById(R.id.videoView);

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(button6==view)
                {
                    Intent intent = new Intent(TeacherVideo.this, MainLive.class);
                    startActivity(intent);
                }
            }
        });




    }
}