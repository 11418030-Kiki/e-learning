package com.e_learning.custom_view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.EditText;




@SuppressLint("AppCompatCustomView")
public class MyEditText extends EditText {


    public MyEditText(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public MyEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public MyEditText(Context context) {
        super(context);
        init();
    }

    private void init() {
        if (!isInEditMode()) {
            Typeface tf = Typeface.createFromAsset(getContext().getAssets(),
                    "font/SF_SAN_FRANCISCO_UI_DISPLAY_BOLD_594B9606EE182.ttf");
            setTypeface(tf);
        }
    }

}
