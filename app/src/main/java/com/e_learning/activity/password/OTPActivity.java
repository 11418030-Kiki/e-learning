package com.e_learning.activity.password;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;

import com.e_learning.R;

public class OTPActivity extends AppCompatActivity {
    private EditText et1;
    private EditText et2;
    private EditText et3;
    private EditText et4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp);
        et1=findViewById(R.id.et1);
        et2=findViewById(R.id.et2);
        et3=findViewById(R.id.et3);
        et4=findViewById(R.id.et4);
        et1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                otpText();
            }
        });





    }

    private void otpText() {
        et1.addTextChangedListener(new TextWatcher() {

            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (et1.getText().toString().length() == 1)     //size as per your requirement
                {
                    et2.requestFocus();
                }
            }

            public void beforeTextChanged(CharSequence s, int start,
                                          int count, int after) {
            }

            public void afterTextChanged(Editable s) {
            }

        });


        et2.addTextChangedListener(new TextWatcher() {

            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (et2.getText().toString().length() == 1)     //size as per your requirement
                {
                    et3.requestFocus();
                }
            }

            public void beforeTextChanged(CharSequence s, int start,
                                          int count, int after) {
            }

            public void afterTextChanged(Editable s) {
            }

        });



        et3.addTextChangedListener(new TextWatcher() {

            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (et3.getText().toString().length() == 1)     //size as per your requirement
                {
                    et4.requestFocus();
                }
            }

            public void beforeTextChanged(CharSequence s, int start,
                                          int count, int after) {
            }

            public void afterTextChanged(Editable s) {
            }

        });



        et4.addTextChangedListener(new TextWatcher() {

            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (et4.getText().toString().length() == 1)     //size as per your requirement
                {
                    et4.requestFocus();
                }
            }

            public void beforeTextChanged(CharSequence s, int start,
                                          int count, int after) {
            }

            public void afterTextChanged(Editable s) {
            }

        });

    }

    public void backtoPage(View view) {
        super.onBackPressed();
    }

    public void btnCreateProfile(View view) {
        startActivity(new Intent(this,CreateProfileActivity.class));
    }
}
