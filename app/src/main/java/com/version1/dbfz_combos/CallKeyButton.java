package com.version1.dbfz_combos;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;

import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;

public class CallKeyButton extends androidx.appcompat.widget.AppCompatButton implements View.OnClickListener {

    keyGroup myFrame;
    String name;
    Boolean pressed;


    public CallKeyButton(Context context){
        super(context);
        super.setText("Error");
    }

    public CallKeyButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        setOnClickListener(this);

        TypedArray a = context.obtainStyledAttributes(attrs,R.styleable.CallKeyButton);
        
        this.name = a.getString(R.styleable.CallKeyButton_name);
        super.setText(name);
//        Log.d("Naming done ", " At least this works");
        a.recycle();
    }

    public CallKeyButton(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        setOnClickListener(this);

        TypedArray a = context.obtainStyledAttributes(attrs,R.styleable.CallKeyButton);

        this.name = a.getString(R.styleable.CallKeyButton_name);
        super.setText(name);
//        Log.d("Naming done ", " At least this works");
        a.recycle();
    }


    public void setMyFrame(keyGroup myFrame) {
        this.myFrame = myFrame;
    }

    @Override
    public void onClick(View view) {
//        Log.d("Clicked", " I have been clicked for god's sake");

    }
}
