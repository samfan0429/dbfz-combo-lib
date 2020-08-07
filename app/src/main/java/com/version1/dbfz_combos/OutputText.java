package com.version1.dbfz_combos;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class OutputText extends androidx.appcompat.widget.AppCompatTextView {
    String initial;
    String output;
    public OutputText(Context context) {
        super(context);

    }

    public OutputText(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initial=getText().toString();
        output = "";
    }

    public void update(String input){
        if(input.toLowerCase().equals("backspace")){
            int i = 1+1;
        }
        else {
            output += input;
            setText(output);
        }
    }
}
