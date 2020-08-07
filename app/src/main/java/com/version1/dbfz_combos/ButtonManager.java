package com.version1.dbfz_combos;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;

import java.security.Key;

public class ButtonManager extends ConstraintLayout {
    TextView outputDisplay;
    String output;
    private LayoutInflater inflater;
    private String role;

    public ButtonManager(Context context) {
        super(context);
    }

    public ButtonManager(Context context, AttributeSet attrs) {
        super(context, attrs);
        output = "";
//        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//        View v = inflater.inflate(R.layout.outputs, null);
//        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.ButtonManager);
//        this.role = a.getString(R.styleable.ButtonManager_role);
//        init(role, v);

    }

//    private void init(String role, View v) {
//        if (role.equals("controller")) {
//            outputDisplay = v.findViewById(R.id.commandList);
//            Log.i("worked", outputDisplay.getText().toString());
//            Log.i("inflater", "inflater working");
//            if(outputDisplay!=null) {
//                Log.i("worked", outputDisplay.getText().toString());
//            }
//            initController(v);
//            Log.i("worked", outputDisplay.getText().toString());
//        }
//        else if (role.equals("main")) {
//            outputDisplay = v.findViewById(R.id.mainCharacter);
////            Log.i("inflater", "inflater working");
////            if(outputDisplay!=null) {
////                Log.i("inflater", "mainCharacter found");
////            }
////            initCharacters(v);
//        }
//        else {
//            outputDisplay = v.findViewById(R.id.assistSet);
////            Log.i("inflater", "inflater working");
////            if(outputDisplay!=null) {
////                Log.i("inflater", "assistSet found");
////            }
////            initAssists(v);
//        }
//        Log.i("Debug",outputDisplay.getText().toString());
//    }
//    private void initController(View v){
//        initArrows(v);
//        initlhsm(v);
//    }

//    private void initArrows(View v){
//        v = inflater.inflate(R.layout.arrows,null);
//        KeyButton tmp = (KeyButton) v.findViewById(R.id.button1);
//        tmp.setPapa(this);
//        tmp.setOutput(outputDisplay);
//
//        tmp = (KeyButton)v.findViewById(R.id.button2);
//        tmp.setPapa(this);
//        tmp.setOutput(outputDisplay);
//
//        tmp = (KeyButton)v.findViewById(R.id.button3);
//        tmp.setPapa(this);
//        tmp.setOutput(outputDisplay);
//
//        tmp = (KeyButton)v.findViewById(R.id.button4);
//        tmp.setPapa(this);
//        tmp.setOutput(outputDisplay);
//
//        tmp = (KeyButton)v.findViewById(R.id.button5);
//        tmp.setPapa(this);
//        tmp.setOutput(outputDisplay);
//
//        tmp = (KeyButton)v.findViewById(R.id.button6);
//        tmp.setPapa(this);
//        tmp.setOutput(outputDisplay);
//
//        tmp = (KeyButton)v.findViewById(R.id.button7);
//        tmp.setPapa(this);
//        tmp.setOutput(outputDisplay);
//
//        tmp = (KeyButton)v.findViewById(R.id.button8);
//        tmp.setPapa(this);
//        tmp.setOutput(outputDisplay);
//
//        tmp = (KeyButton)v.findViewById(R.id.button9);
//        tmp.setPapa(this);
//        tmp.setOutput(outputDisplay);
//    }

//    private void initlhsm(View v){
//        v = inflater.inflate(R.layout.lhms,null);
//        KeyButton tmp = v.findViewById(R.id.buttonl);
//        tmp.setPapa(this);
//        tmp.setOutput(outputDisplay);
//
//        tmp = (KeyButton)v.findViewById(R.id.buttonm);
//        tmp.setPapa(this);
//        tmp.setOutput(outputDisplay);
//
//        tmp = (KeyButton)v.findViewById(R.id.buttonh);
//        tmp.setPapa(this);
//        tmp.setOutput(outputDisplay);
//
//        tmp = (KeyButton)v.findViewById(R.id.buttons);
//        tmp.setPapa(this);
//        tmp.setOutput(outputDisplay);

//        if(tmp.getPapa()!=null){
//            Log.i("worked","finally worked");
//        }
//    }

//    private void initCharacters(){
//        KeyButton tmp = super.findViewById(R.id.sacrifice1);
//        tmp.setPapa(this);
//
//        tmp = super.findViewById(R.id.sacrifice2);
//        tmp.setPapa(this);
//
//        tmp = super.findViewById(R.id.sacrifice3);
//        tmp.setPapa(this);
//
//    }

//    private void initAssists(View v){
//        v = inflater.inflate(R.layout.characters2,null);
//        KeyButton tmp = v.findViewById(R.id.sacrifice4);
//        tmp.setPapa(this);
//
//        tmp = v.findViewById(R.id.sacrifice5);
//        tmp.setPapa(this);
//
//        tmp = v.findViewById(R.id.sacrifice6);
//        tmp.setPapa(this);
//    }

//    public void updateText(String name){
////        outputDisplay.setText("");
//        output += name;
//        Log.i("outputCombo",output);
////        outputDisplay.setText(output);
}
