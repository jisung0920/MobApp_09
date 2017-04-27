package com.example.jisung.mobapp_09;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by jisung on 2017-04-27.
 */

public class SpinnerAdapter extends BaseAdapter{
    String[] fruite;
    Context context;

    public SpinnerAdapter(String[] fruite, Context context) {
        this.fruite = fruite;
        this.context = context;
    }

    @Override
    public int getCount() {
        return fruite.length;
    }

    @Override
    public Object getItem(int position) {
        return fruite[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView==null)
            convertView = LayoutInflater.from(context).inflate(R.layout.spinner_item,null);
        //여기서 이벤트를 받는다.
        final CheckBox c1 = (CheckBox)convertView.findViewById(R.id.checkbox);


        final TextView tv = (TextView)convertView.findViewById(R.id.t1);

        tv.setText(fruite[position]);

        c1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    Toast.makeText(context, "선택되었습니다.", Toast.LENGTH_SHORT).show();
            }
        });
        return convertView;
    }
}
