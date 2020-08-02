package com.version1.dbfz_combos;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class KeyButton extends androidx.appcompat.widget.AppCompatImageButton implements View.OnClickListener {

    TextView inputList;
    String name;

    public KeyButton(Context context){
        super(context);
        setOnClickListener(this);
    }

    public KeyButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        setOnClickListener(this);
    }

    public KeyButton(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

    }
}
