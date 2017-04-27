package com.example.jisung.mobapp_09;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.view.LayoutInflaterCompat;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;

/**
 * Created by jisung on 2017-04-27.
 */

public class AddFruit extends LinearLayout {
    int imgno=0;
    EditText et;
    ImageView img;
    Button b_next,b_add;
    public AddFruit(Context context,AttributeSet attrs) {
        super(context,attrs);
        init(context);
    }

    void init(Context context){
        LayoutInflater.from(context).inflate(R.layout.fruit_add,this);
        et = (EditText)findViewById(R.id.f_name);
        img = (ImageView)findViewById(R.id.image1);
        b_next = (Button)findViewById(R.id.b_next);
        b_add = (Button)findViewById(R.id.b_add);

    }
}
