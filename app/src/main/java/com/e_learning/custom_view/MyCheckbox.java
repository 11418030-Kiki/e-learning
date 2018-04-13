package com.e_learning.custom_view;


import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.CheckBox;
import android.widget.TextView;



@SuppressLint("AppCompatCustomView")
public class MyCheckbox extends CheckBox {

    public MyCheckbox(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public MyCheckbox(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public MyCheckbox(Context context) {
        super(context);
        init();
    }

    private void init() {
        if (!isInEditMode()) {
            Typeface tf = Typeface.createFromAsset(getContext().getAssets(),
                    "SF_SAN_FRANCISCO_UI_DISPLAY_BOLD");
            setTypeface(tf);
        }
    }
}