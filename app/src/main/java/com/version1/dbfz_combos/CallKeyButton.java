package com.version1.dbfz_combos;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.Layout;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

public class CallKeyButton extends androidx.appcompat.widget.AppCompatButton implements View.OnTouchListener {

    private CallButtonLayout papa;
    private String name;


    public CallKeyButton(Context context){
        super(context);
        super.setText("Error");
    }

    public CallKeyButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        setOnTouchListener(this);

        TypedArray a = context.obtainStyledAttributes(attrs,R.styleable.CallKeyButton);
        init(a, context);
        a.recycle();
    }

    public CallKeyButton(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);

        TypedArray a = context.obtainStyledAttributes(attrs,R.styleable.CallKeyButton);
        init(a, context);
        a.recycle();
    }

    @SuppressLint("InflateParams")
    private void init(TypedArray a, Context context){
        setName(a.getString(R.styleable.CallKeyButton_name));
        super.setText(name);
    }

    @Override
    public boolean onTouch(View v, MotionEvent motionEvent) {
        papa.update(this);
        return true;
    }

    public void setPapa(CallButtonLayout papa){
        this.papa = papa;
    }

    private void setName(String name){
        this.name = name;
    }

    public CallButtonLayout getPapa(){
        return papa;
    }

    public String getName(){
        return name;
    }
}
