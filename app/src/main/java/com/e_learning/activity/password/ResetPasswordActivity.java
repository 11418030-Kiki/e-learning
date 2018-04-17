package com.e_learning.activity.password;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.e_learning.R;
import com.e_learning.custom_view.MyTextView;

import org.w3c.dom.Text;

public class ResetPasswordActivity extends AppCompatActivity {
    private android.support.v7.widget.Toolbar toolbar;
    private ImageView ivBack;
    private MyTextView tvToolbarHeader;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_password);
        toolbar= findViewById(R.id.include_tbPass);
    tvToolbarHeader=(MyTextView)toolbar.findViewById(R.id.toolbar_header);
    tvToolbarHeader.setText("Reset Password");
    }
}
