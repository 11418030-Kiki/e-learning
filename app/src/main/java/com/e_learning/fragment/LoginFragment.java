package com.e_learning.fragment;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.e_learning.R;
import com.e_learning.activity.MainActivity;
import com.e_learning.activity.password.CreateProfileActivity;
import com.e_learning.activity.password.ForgotPasswordActivity;
import com.e_learning.activity.password.OTPActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class LoginFragment extends Fragment {
    private Button bnforgot;
    private Button bntLogin;
    private Context context;
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
     this.context=context;

    }

    public LoginFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_login, container, false);
        bnforgot=v.findViewById(R.id.btn_forgot_password);
        bnforgot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "forgot Password", Toast.LENGTH_SHORT).show();
                Intent inte=new Intent(context,ForgotPasswordActivity.class);
                startActivity(inte);
            }
        });
        bntLogin=v.findViewById(R.id.btnLogin);
        bntLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context, MainActivity.class));
            }
        });

        return v;
    }

}
