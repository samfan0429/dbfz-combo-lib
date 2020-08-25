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
    OutputText outputDisplay;
    private LayoutInflater inflater;
    private String role;

    public ButtonManager(Context context) {
        super(context);
    }

    public ButtonManager(Context context, AttributeSet attrs) {
        super(context, attrs);
//        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//        View v = LayoutInflater.from(getContext()).inflate(R.layout.outputs,null);
        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.ButtonManager);
        this.role = a.getString(R.styleable.ButtonManager_role);
//        init(role, v);

    }

    public void initThings() {
        if (role.equals("controller")) {
            initController();
        } else if (role.equals("main")) {
            initChar();
        } else {
            initChar();
        }
    }

    private void initController() {
        ConstraintLayout tmp;
        KeyButton tmpButt;
        int count = super.getChildCount();
        int count2;
        for (int i = 0; i < count; i++) {
            tmp = (ConstraintLayout) super.getChildAt(i);
//            Log.i("childCount",Integer.toString(tmp.getChildCount()));
            count2 = tmp.getChildCount();
            for (int j = 0; j < count2; j++) {
                tmpButt = (KeyButton) tmp.getChildAt(j);
                tmpButt.setPapa(this);
            }
        }
    }

    private void initChar() {
        KeyButton tmp;
        int count = super.getChildCount();
        int count2;
        for (int i = 0; i < count; i++) {
            tmp = (KeyButton) super.getChildAt(i);
            tmp.setPapa(this);

        }
    }

    public void setOutputDisplay(View v){
        if (role.equals("controller")) {
            outputDisplay = v.findViewById(R.id.commandList);
//            Log.i("worked", outputDisplay.getText().toString());
//            Log.i("inflater", "inflater working");
//            if(outputDisplay!=null) {
//                Log.i("worked", outputDisplay.getText().toString());
//            }
        } else if (role.equals("main")) {
            outputDisplay = v.findViewById(R.id.mainCharacter);
//            Log.i("inflater", "inflater working");
//            if(outputDisplay!=null) {
//                Log.i("inflater", "mainCharacter found");
//            }
        } else {
            outputDisplay = v.findViewById(R.id.assistSet);
//            Log.i("inflater", "inflater working");
//            if(outputDisplay!=null) {
//                Log.i("inflater", "assistSet found");
//            }
        }
//        Log.i("Debug", outputDisplay.getText().toString());
//        outputDisplay.setText("Fudge");
    }

    public void updateText(String name){
//        outputDisplay.setText("");
        outputDisplay.update(name);
    }
}
