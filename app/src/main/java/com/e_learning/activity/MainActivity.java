package com.e_learning.activity;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.e_learning.R;

public class MainActivity extends AppCompatActivity {
    private LinearLayout linearHighSchool;
    private LinearLayout linearJuniorHighSchool;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        linearHighSchool = findViewById(R.id.linear_layout_highschool);
        linearJuniorHighSchool = findViewById(R.id.linear_layout_junior_high);
        linearHighSchool.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View v) {
                selectHighSchool();
            }
        });
        linearJuniorHighSchool.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View v) {
                selectJuniorHighSchool();
            }
        });

    }
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    private void selectJuniorHighSchool() {
        linearJuniorHighSchool.setBackground(getResources().getDrawable(R.drawable.custom_radio_button_oncheck));;
        linearHighSchool.setBackground(getResources().getDrawable(R.drawable.custom_radio_button_onuncheck));

    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    private void selectHighSchool() {

        linearHighSchool.setBackground(getResources().getDrawable(R.drawable.custom_radio_button_oncheck));
        linearJuniorHighSchool.setBackground(getResources().getDrawable(R.drawable.custom_radio_button_onuncheck));
        


    }
}
