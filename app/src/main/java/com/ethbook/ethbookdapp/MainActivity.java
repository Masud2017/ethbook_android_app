package com.ethbook.ethbookdapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import androidx.core.splashscreen.SplashScreen;
import android.os.Bundle;
import android.os.Handler;


public class MainActivity extends AppCompatActivity {
    private static int SPLASH_TIME = 1500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        SplashScreen.installSplashScreen(MainActivity.this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                Intent loginActivity = new Intent(MainActivity.this, login.class);
                startActivity(loginActivity, ActivityOptions.makeSceneTransitionAnimation(MainActivity.this).toBundle());

            }
        }, SPLASH_TIME);
    }
}