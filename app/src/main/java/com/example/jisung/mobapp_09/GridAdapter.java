package com.example.jisung.mobapp_09;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.Toast;


import java.util.ArrayList;

/**
 * Created by jisung on 2017-04-27.
 */

public class GridAdapter extends BaseAdapter {
    Context context;
    ArrayList<Fruit> fruit;
    int check =0;

    public GridAdapter(Context context, ArrayList<Fruit> fruit) {
        this.context = context;
        this.fruit = fruit;
    }

    @Override
    public int getCount() {
        return fruit.size();
    }

    @Override
    public Object getItem(int position) {
        return fruit.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
//        if(convertView==null)
//        LayoutInflater.from(context).inflate(R.layout.griditem,null);
//        //여기서 이벤트를 받는다.
//        final TextView tv = (TextView)convertView.findViewById(R.id.tv1);
//        final ImageView img = (ImageView)convertView.findViewById(R.id.img1);
//        tv.setText(fruit.get(position).name);
//        img.setImageResource(fruit.get(position).imgno);

        if (convertView == null)
            convertView = new GridItem(context);
        ((GridItem) convertView).setData(fruit.get(position));

        final TextView tp = (TextView)convertView.findViewById(R.id.price1);
        if(check==0)
            tp.setVisibility(View.INVISIBLE);

        else
            tp.setVisibility(View.VISIBLE);

        return convertView;
    }
    public void Checkprice() {
        if(check==0)
            check=1;
        else
            check=0;
        return ;
    }

}
