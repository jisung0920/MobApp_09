package com.example.jisung.mobapp_09;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.view.LayoutInflaterCompat;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;

/**
 * Created by jisung on 2017-04-27.
 */

public class AddFruit extends LinearLayout implements View.OnClickListener {
    int imgno=0;
    EditText et,ep;
    ImageView img;
    Button b_next,b_add;
    int button = 0;
    public AddFruit(Context context,AttributeSet attrs) {
        super(context,attrs);
        init(context);
    }

    void init(Context context){
        LayoutInflater.from(context).inflate(R.layout.fruit_add,this);
        et = (EditText)findViewById(R.id.f_name);
        ep = (EditText)findViewById(R.id.f_price);
        img = (ImageView)findViewById(R.id.image1);
        b_next = (Button)findViewById(R.id.b_next);
        b_add = (Button)findViewById(R.id.b_add);
        b_next.setOnClickListener(this);
        b_add.setOnClickListener(this);

    }
    interface OnAddListener{
        void onAdd(String name,String price, int imgno);

    }


    public OnAddListener onAddListener;

    public void setOnAddListener(OnAddListener onAddListener){
        this.onAddListener = onAddListener;
    }

    interface OnModifyListener{
        void onModify(String name,String price,int imgmo);
    }
    public OnModifyListener onModifyListener;

    public void setOnModifyListener(OnModifyListener onModifyListener){
        this.onModifyListener = onModifyListener;
    }

    public void buttonChange(){
        if(button ==0) {
            b_add.setText("M");
            button = 1;
        }
        else {
            b_add.setText("ADD");
            button=0;
        }
    }

    @Override
    public void onClick(View v) {
        if(v == b_add){
            if(button==0)
                onAddListener.onAdd(et.getText().toString(),ep.getText().toString(),imgno);
            else
                onModifyListener.onModify(et.getText().toString(),ep.getText().toString(),imgno);
        }
        else{
            if(imgno==Fruit.image.length-1)imgno = -1;
            img.setImageResource(Fruit.image[++imgno]);
        }
    }
}
