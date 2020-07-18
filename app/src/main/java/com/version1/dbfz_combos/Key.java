package com.version1.dbfz_combos;

import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageButton;

public class Key extends AppCompatButton{
    boolean pressed;
    private int id;
    private char buttonType;
    public Key(Context context, int id, char type){
        super(context);
        this.id=id;
        this.buttonType=type;
        this.pressed=false;
    }

    public int getId(){
        return this.id;
    }

    public char getButtonType(){
        return this.buttonType;
    }
}
