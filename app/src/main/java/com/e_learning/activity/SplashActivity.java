package com.e_learning.activity;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.e_learning.R;

public class SplashActivity extends AppCompatActivity {
   Boolean onPause=false;
    Handler handler;

    @Override
    protected void onPause() {
        super.onPause();
       onPause=true;
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashActivity.this, LoginActivity.class));
                finish();

            }
        },2000);

    }

    @Override
    public void onBackPressed() {
        //super.onBackPressed();

    }
}
