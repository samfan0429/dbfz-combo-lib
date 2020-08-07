package com.version1.dbfz_combos;

import android.content.Context;
import android.telecom.Call;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;

public class CallButtonLayout extends LinearLayout {
    private KeyBoard myFrame;
    private CallKeyButton pressed;

    public CallButtonLayout(Context context) {
        super(context);
    }

    public CallButtonLayout(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public void setMyFrame(KeyBoard myFrame){
        this.myFrame=myFrame;
        initChildren();
    }

    private void initChildren(){
        int count = super.getChildCount();
        CallKeyButton tmp;
        for(int i =0; i<count ; i++){
            tmp = (CallKeyButton) super.getChildAt(i);
            tmp.setPapa(this);
            if(tmp.getName().toLowerCase().equals("commands")){
                tmp.setPressed(true);
                pressed = tmp;
            }
        }
    }

    public void update(CallKeyButton button){
        if(!pressed.equals(button)) {
            pressed.setPressed(false);
            button.setPressed(true);
            pressed = button;
            myFrame.changeView(button.getName());
        }
    }


    private void resetButtons(){
        int count = super.getChildCount();
        CallKeyButton tmp;
        for(int i =0; i<count ; i++){
            tmp = (CallKeyButton) super.getChildAt(i);
            tmp.setPressed(false);
        }
    }
}
