package com.victorsaico.evadriver.widgets;

/**
 * Created by JARVIS on 22/04/2018.
 */

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.Button;

import com.victorsaico.evadriver.R;

public class CustomButton extends Button {
    public CustomButton(Context context) {
        super(context);

        if (!isInEditMode())
            font(context, null);
    }

    public CustomButton(Context context, AttributeSet attrs) {
        super(context, attrs);

        if (!isInEditMode())
            font(context, attrs);
    }

    public CustomButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        if (!isInEditMode())
            font(context, attrs);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public CustomButton(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);

        if (!isInEditMode())
            font(context, attrs);
    }

    public void font(Context context, AttributeSet attrs) {
        TypedArray attributeArray = context.obtainStyledAttributes(attrs, R.styleable.CustomTextView);
        String fontName = attributeArray.getString(R.styleable.CustomTextView_font);
        Typeface museo = Typeface.createFromAsset(context.getAssets(), "fonts/" + fontName);
        super.setTypeface(museo);
    }
}