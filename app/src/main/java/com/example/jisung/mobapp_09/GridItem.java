package com.example.jisung.mobapp_09;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by jisung on 2017-04-27.
 */

public class GridItem extends LinearLayout {
    TextView tv;
    ImageView img;

    public GridItem(Context context) {
        super(context);
        init(context);
    }



    public void init(Context context){
         LayoutInflater.from(context).inflate(R.layout.griditem,this);
        tv = (TextView)findViewById(R.id.tv1);
        img = (ImageView)findViewById(R.id.img1);
    }
    public void setData(Fruit one){
        tv.setText(one.name);
        img.setImageResource(one.imgno);
    }

}
