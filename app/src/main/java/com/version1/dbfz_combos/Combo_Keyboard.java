package com.version1.dbfz_combos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Context;
import android.content.res.TypedArray;
import android.media.Image;
import android.telecom.Call;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;

import android.os.Bundle;

public class Combo_Keyboard extends AppCompatActivity implements View.OnClickListener{

    String combos;

    FrameLayout keyBoard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.combo_scribe);
//        Log.d("From the main, the customkeyboard is: ", Integer.toString(R.id.customKeyboard));
        initCallButtons();

//        test = (ImageButton) findViewById(R.id.buttonh);
//        keyBoard = (FrameLayout) findViewById(R.id.customKeyboard);
//        keyBoard.addView(aNewViewOne);

    }

    private void initCallButtons(){
        KeyBoard keypad = findViewById(R.id.customKeyboard);
        CallButtonLayout temp = findViewById(R.id.linearLayout);
        temp.setMyFrame(keypad);
    }

    @Override
    public void onClick(View v) {
    }

}