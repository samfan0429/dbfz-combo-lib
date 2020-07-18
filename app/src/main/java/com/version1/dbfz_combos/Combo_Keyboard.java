package com.version1.dbfz_combos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Handler;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

import android.os.Bundle;

public class Combo_Keyboard extends AppCompatActivity implements View.OnClickListener{
    String combos;

    TextView comboScript;


    Key hButton;
    Key lButton;
    Key sButton;
    Key mButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        combos = "";
        comboScript = (TextView) findViewById(R.id.textView1);


//        comboScript.setText(combos);

        hButton = new Key(this, R.id.hbutton, 'H');
        hButton.setOnClickListener(this);

        lButton = new Key(this, R.id.lbutton, 'L');
        lButton.setOnClickListener(this);

        sButton = new Key(this, R.id.sbutton, 'S');
        sButton.setOnClickListener(this);

        mButton = new Key(this, R.id.mbutton, 'M');
        mButton.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
        int temp=view.getId();

        if(temp==R.id.hbutton){
            combos+=hButton.getButtonType();
        }
        else if(temp==R.id.lbutton){
            combos+=lButton.getButtonType();
        }
        else if(temp==R.id.sbutton){
            combos+=sButton.getButtonType();
        }
        else if(temp==R.id.mbutton){
            combos+=mButton.getButtonType();
        }
        comboScript.setText(combos);
        view.invalidate();
    }

//    public void displayNewText(View view) {
//        TextView temp = (TextView) findViewById(R.id.textView1);
//        temp.setText(combos);
//    }

    private void textUpdate(final char buttonType) {
        combos+=buttonType;
        comboScript.post(new Runnable() {
            @Override
            public void run() {
                comboScript.setText(combos);
            }
        });
    }

}