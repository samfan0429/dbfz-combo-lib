package com.version1.dbfz_combos;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;

import androidx.constraintlayout.widget.ConstraintLayout;

public class KeyBoard extends FrameLayout {
    private ConstraintLayout controller;
    private ConstraintLayout characters;
    private ConstraintLayout none;
    private LayoutInflater inflater;

    public KeyBoard(Context context){
        super(context);
//        Log.d("worked well", " going well");
    }

    public KeyBoard(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public KeyBoard(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init(context);
    }

    private void init(Context context){
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        /*Initialize the views*/
        View v = inflater.inflate(R.layout.controller,null);
        controller = (ConstraintLayout) v;
        controller.setVisibility(View.VISIBLE);
        super.addView(controller);

        v = inflater.inflate(R.layout.characters,null);
        characters = (ConstraintLayout) v;
        characters.setVisibility(View.GONE);
        super.addView(characters);

        v = inflater.inflate(R.layout.characters2,null);
        none = (ConstraintLayout) v;
        none.setVisibility(View.GONE);
        super.addView(none);
    }

    public void changeView(String buttonName){
        if(buttonName.toLowerCase().equals("commands")){
            if(controller.getVisibility()==View.GONE){
                resetViews();
                controller.setVisibility(View.VISIBLE);
            }
        }
        else if(buttonName.toLowerCase().equals("characters")){
            if(characters.getVisibility()==View.GONE){
                resetViews();
                characters.setVisibility(View.VISIBLE);
            }
        }
        else{
            if(none.getVisibility()==View.GONE){
                resetViews();
                none.setVisibility(View.VISIBLE);
            }

        }
    }

    private void resetViews(){
        int count = super.getChildCount();
        View tmp;
        for(int i =0; i<count ; i++){
            tmp = super.getChildAt(i);
            tmp.setVisibility(View.GONE);
        }
    }

}
