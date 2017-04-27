package com.example.jisung.mobapp_09;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {

    ArrayList<Fruit> fruit = new ArrayList<Fruit>();
    final int imglist[] = {R.drawable.abocado,R.drawable.watermelon,R.drawable.kiwi,R.drawable.banana,R.drawable.cherry,R.drawable.cranberry};
    GridAdapter adapter;
    GridView gridView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        gridView=(GridView)findViewById(R.id.grid);
        fruit.add(new Fruit("아보카도",imglist[0]));
        fruit.add(new Fruit("수박",imglist[1]));
        fruit.add(new Fruit("키위",imglist[2]));
        fruit.add(new Fruit("바나나",imglist[3]));

        adapter= new GridAdapter(this,fruit);
        gridView.setAdapter(adapter);

    }
}
