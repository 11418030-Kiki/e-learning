package com.e_learning.fragment;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.e_learning.R;
import com.e_learning.activity.MainActivity;
import com.e_learning.activity.password.CreateProfileActivity;
import com.e_learning.activity.password.OTPActivity;


/**
 * A simple {@link Fragment} subclass.
 */
public class SignUpFragment extends Fragment {
    private Button signup;
    private Context context;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.context=context;

    }

    public SignUpFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View v= inflater.inflate(R.layout.fragment_sign_up, container, false);
       signup=v.findViewById(R.id.sign_up);
       signup.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               startActivity(new Intent(context,OTPActivity.class));
           }
       });
       return v;
    }

}
