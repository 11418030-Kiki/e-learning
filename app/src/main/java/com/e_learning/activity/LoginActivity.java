package com.e_learning.activity;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.e_learning.R;
import com.e_learning.adapter.TabAdapter;
import com.e_learning.fragment.LoginFragment;
import com.e_learning.fragment.SignUpFragment;


public class LoginActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        tabLayout = findViewById(R.id.tab_layout_people);
        viewPager = findViewById(R.id.view_pager_people);
        TabAdapter tabAdapter = new TabAdapter(getSupportFragmentManager());
        tabAdapter.addTabs(new LoginFragment(), "Login");
        tabAdapter.addTabs(new SignUpFragment(), "Sign up");
        viewPager.setAdapter(tabAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }

}
