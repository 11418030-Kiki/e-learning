package com.e_learning.custom_view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.Button;



@SuppressLint("AppCompatCustomView")
public class MyButton extends Button {

    public MyButton(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public MyButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public MyButton(Context context) {
        super(context);
        init();
    }

    private void init() {
        if (!isInEditMode()) {
            //Typeface tf = Typeface.createFromAsset(getContext().getAssets(),
              //      "asset/SF_SAN_FRANCISCO_UI_DISPLAY_BOLD_594B9606EE182.ttf");

            Typeface tf=Typeface.createFromAsset(getContext().getAssets(), "font/SF_SAN_FRANCISCO_UI_DISPLAY_BOLD_594B9606EE182.ttf");;
            setTypeface(tf);
        }
    }

}
