package com.e_learning.activity.password;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toolbar;

import com.e_learning.R;

public class ForgotPasswordActivity extends AppCompatActivity {
     private android.support.v7.widget.Toolbar toolbar;
     private ImageView ivBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);
        toolbar= findViewById(R.id.include_tb);
        ivBack=toolbar.findViewById(R.id.ivBack);
        ivBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ForgotPasswordActivity.super.onBackPressed();
            }
        });

    }

    public void btnresetPaasword(View view) {
        startActivity(new Intent(this,ResetPasswordActivity.class));
    }
}
