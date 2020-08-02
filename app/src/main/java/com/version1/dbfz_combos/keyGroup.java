package com.version1.dbfz_combos;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.FrameLayout;

import androidx.constraintlayout.widget.ConstraintLayout;

public class keyGroup extends FrameLayout {
    ConstraintLayout[] keys;


    public keyGroup(Context context){
        super(context);
    }

    public keyGroup(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public keyGroup(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

}
