package com.buttonclickanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button buttonPlay,buttonLeaderboard,buttonSettings;
    Animation scaleUp,scaleDown;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonPlay = findViewById(R.id.button_play);
        buttonLeaderboard = findViewById(R.id.button_leaderboard);
        buttonSettings = findViewById(R.id.button_settings);

        scaleUp = AnimationUtils.loadAnimation(this,R.anim.scale_up);
        scaleDown = AnimationUtils.loadAnimation(this,R.anim.scale_down);

        buttonPlay.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {

                if(motionEvent.getAction()==MotionEvent.ACTION_DOWN){
                    buttonPlay.startAnimation(scaleUp);
                }else if(motionEvent.getAction()==MotionEvent.ACTION_UP){
                    buttonPlay.startAnimation(scaleDown);
                }

                return true;
            }
        });

        buttonLeaderboard.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {

                if(motionEvent.getAction()==MotionEvent.ACTION_DOWN){
                    buttonLeaderboard.startAnimation(scaleUp);
                }else if(motionEvent.getAction()==MotionEvent.ACTION_UP){
                    buttonLeaderboard.startAnimation(scaleDown);
                }

                return true;
            }
        });

        buttonSettings.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {

                if(motionEvent.getAction()==MotionEvent.ACTION_DOWN){
                    buttonSettings.startAnimation(scaleUp);
                }else if(motionEvent.getAction()==MotionEvent.ACTION_UP){
                    buttonSettings.startAnimation(scaleDown);
                }

                return true;
            }
        });

    }
}
