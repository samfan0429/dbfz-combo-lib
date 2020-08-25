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
    private HashMap<String,ButtonManager> layoutFinder;
    private ButtonManager visible;


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
        ButtonManager tmp = (ButtonManager) v;
        tmp.setVisibility(VISIBLE);
        super.addView(tmp);
        layoutFinder.put("commands",tmp);
//        Log.i("childCount",Integer.toString(tmp.getChildCount()));
        this.visible = tmp;
        tmp.initThings();

        v = inflater.inflate(R.layout.characters,null);
        tmp = (ButtonManager) v;
        tmp.setVisibility(GONE);
        super.addView(tmp);
        layoutFinder.put("main",tmp);
//        Log.i("childCount",Integer.toString(tmp.getChildCount()));
        tmp.initThings();

        v = inflater.inflate(R.layout.characters2,null);
        tmp = (ButtonManager) v;
        tmp.setVisibility(GONE);
        super.addView(tmp);
        layoutFinder.put("assists",tmp);
//        Log.i("childCount",Integer.toString(tmp.getChildCount()));
        tmp.initThings();

    }

    public void changeView(String buttonName){
        ButtonManager tmp = layoutFinder.get(buttonName.toLowerCase());
        if(tmp.getVisibility()==GONE){
            visible.setVisibility(GONE);
            tmp.setVisibility(VISIBLE);
            visible = tmp;
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

    public void setOutputDisplays(View v){
        ButtonManager tmp;
        int count = super.getChildCount();
        for(int i=0; i<count ; i++){
            tmp = (ButtonManager) super.getChildAt(i);
            tmp.setOutputDisplay(v);
        }
    }

    public HashMap<String,ButtonManager> getLayoutFinder(){
        return layoutFinder;
    }

    public LayoutInflater getInflater(){
        return getInflater();
    }

}
