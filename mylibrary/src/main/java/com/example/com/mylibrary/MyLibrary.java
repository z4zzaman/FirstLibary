package com.example.com.mylibrary;

/*
 *  ****************************************************************************
 *  * Created by : Md. Moniruzzaman Monir on 11/15/2018 at 3:56 PM.
 *  * Email : moniruzzaman@w3engineers.com
 *  *
 *  * Purpose:
 *  *
 *  * Last edited by : Md. Moniruzzaman Monir on 11/15/2018.
 *  *
 *  * Last Reviewed by : <Reviewer Name> on <mm/dd/yy>
 *  ****************************************************************************
 */

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.support.annotation.Nullable;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import android.widget.TextView;

public class MyLibrary extends AppCompatTextView {
    TextView textView ;
    int textColor;
    public MyLibrary(Context context) {
        super(context);
        textView = new TextView(context);
    }

    public MyLibrary(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        TypedArray typedArray = getContext().obtainStyledAttributes(attrs, R.styleable.MyLibrary);
        textColor = typedArray.getColor(R.styleable.MyLibrary_text2Color, Color.GREEN);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();

    }


    public void setText2Color(int textColor) {
        setTextColor(textColor);
    }
}
