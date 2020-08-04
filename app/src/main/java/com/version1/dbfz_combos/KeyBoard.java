package com.version1.dbfz_combos;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import java.util.HashMap;

import androidx.constraintlayout.widget.ConstraintLayout;

public class KeyBoard extends ConstraintLayout {
    private LayoutInflater inflater;
    private HashMap<String,ConstraintLayout> layoutFinder;


    public KeyBoard(Context context){
        super(context);
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
        layoutFinder = new HashMap<>();
        /*Initialize the views and insert them to hash table for convenience*/
        View v = inflater.inflate(R.layout.controller,null);
        ConstraintLayout tmp = (ConstraintLayout) v;
        tmp.setVisibility(VISIBLE);
        super.addView(tmp);
        layoutFinder.put("commands",tmp);

        v = inflater.inflate(R.layout.characters,null);
        tmp = (ConstraintLayout) v;
        tmp.setVisibility(GONE);
        super.addView(tmp);
        layoutFinder.put("main",tmp);

        v = inflater.inflate(R.layout.characters2,null);
        tmp = (ConstraintLayout) v;
        tmp.setVisibility(GONE);
        super.addView(tmp);
        layoutFinder.put("assists",tmp);
    }

    public void changeView(String buttonName){
        ConstraintLayout tmp = layoutFinder.get(buttonName.toLowerCase());
        if(tmp.getVisibility()==GONE){
            resetViews();
            tmp.setVisibility(VISIBLE);
        }
    }

    private void resetViews(){
        int count = super.getChildCount();
        View tmp;
        for(int i =0; i<count ; i++){
            tmp = super.getChildAt(i);
            tmp.setVisibility(GONE);
        }
    }

    public HashMap<String,ConstraintLayout> getLayoutFinder(){
        return layoutFinder;
    }

    public LayoutInflater getInflater(){
        return getInflater();
    }

}
