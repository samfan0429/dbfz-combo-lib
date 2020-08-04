package com.version1.dbfz_combos;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.Layout;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;

import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;

import java.lang.reflect.Type;

public class CallKeyButton extends androidx.appcompat.widget.AppCompatButton implements View.OnClickListener {

    private KeyBoard myFrame;
    private String name;


    public CallKeyButton(Context context){
        super(context);
        super.setText("Error");
    }

    public CallKeyButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        setOnClickListener(this);

        TypedArray a = context.obtainStyledAttributes(attrs,R.styleable.CallKeyButton);
        init(a, context);
        a.recycle();
    }

    public CallKeyButton(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        setOnClickListener(this);

        TypedArray a = context.obtainStyledAttributes(attrs,R.styleable.CallKeyButton);

        init(a, context);
        a.recycle();
    }

    @SuppressLint("InflateParams")
    private void init(TypedArray a, Context context){
        this.name = a.getString(R.styleable.CallKeyButton_name);
        super.setText(name);

//        int myFrameID = a.getResourceId(R.styleable.CallKeyButton_keyboard,-1);
//        View v = new View(context);
//        myFrame = v.findViewById(myFrameID);
//        if(myFrame == null){
//            Log.d("WTF", " thing is giving NULL");
//        }
//        Log.d("Naming done ", " At least this works");
    }

    public void setMyFrame(KeyBoard myFrame) {
        this.myFrame = myFrame;
    }

    @Override
    public void onClick(View view) {
        Log.d("Clicked", " I have been clicked for god's sake");
        myFrame.changeView(this.name);
    }
}
