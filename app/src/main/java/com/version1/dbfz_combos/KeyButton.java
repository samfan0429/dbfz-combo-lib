package com.version1.dbfz_combos;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class KeyButton extends androidx.appcompat.widget.AppCompatImageButton implements View.OnClickListener {
    ButtonManager papa;
    String name;
    TextView output;

    public KeyButton(Context context){
        super(context);
        setOnClickListener(this);
    }

    public KeyButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        setOnClickListener(this);
        TypedArray a = context.obtainStyledAttributes(attrs,R.styleable.KeyButton);
        name = a.getString(R.styleable.KeyButton_keyName);
        if(super.getParent()==null) {
            Log.i("Name" ,name);
        }
    }

    public void setPapa(ButtonManager papa){
        this.papa = papa;
    }

    public void setOutput(TextView output){
        this.output = output;
    }

    public ButtonManager getPapa(){
        return papa;
    }

    public String getName(){
        return name;
    }
    @Override
    public void onClick(View v) {
        if(super.getParent()!=null) {
            Log.i("YesPapa" ,name);
        }
//        papa.updateText(this.name);
//        String tmp = output.getText().toString()+this.name;
//        output.setText(tmp);
    }
}
