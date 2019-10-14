package com.example.visualizing_algorithms;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    ConstraintLayout constraintLayout;
    Button stop1;
    int a = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        constraintLayout = (ConstraintLayout)findViewById(R.id.a);
        play();
    }
    public void stop(View v)
    {
        finish();
    }
    public void play()
    {
        int b = 1;
        int a = 0;
        while(b++ <= 1000)
        {
            if( a == 0)
            {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        constraintLayout.setBackgroundColor(Color.YELLOW);

                    }
                },(b * 300));
                a = 1;
            }
            else if(a == 1)
            {

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        constraintLayout.setBackgroundColor(Color.GREEN);
                    }
                },(b * 300 ));
                a = 2;
            }
            else if(a == 2)
            {

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        constraintLayout.setBackgroundColor(Color.BLUE);
                    }
                },(b * 300 ));
                a = 3;
            }
            else if(a == 3)
            {

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        constraintLayout.setBackgroundColor(Color.RED);
                    }
                },(b * 300 ));
                a = 0;
            }

        }
    }


}
