package com.version1.dbfz_combos;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;

import android.os.Bundle;

public class Combo_Keyboard extends AppCompatActivity implements View.OnClickListener{

    String combos;

    FrameLayout keyBoard;

    ImageButton test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.combo_scribe);

        test = (ImageButton) findViewById(R.id.buttonh);
//        keyBoard = (FrameLayout) findViewById(R.id.keyboard);
//        keyBoard.addView(aNewViewOne);

    }



    @Override
    public void onClick(View view) {

    }

}