package com.example.jisung.mobapp_09;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {

    ArrayList<Fruit> fruit = new ArrayList<Fruit>();
    final static String[] fruitName={"아보카도","수박","키위","바나나","체리","크랜베리"};
    final int imglist[] = {R.drawable.abocado,R.drawable.watermelon,R.drawable.kiwi,R.drawable.banana,R.drawable.cherry,R.drawable.cranberry};
    final static String[] priceList = {"10000원","20000원","5000원","8000원","100원","500원"};
    ArrayAdapter<String> auto;
    GridAdapter adapter;
    GridView gridView;
    AddFruit addFruit;
    CheckBox c1;
    int Fposition=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        gridView=(GridView)findViewById(R.id.grid);

        fruit.add(new Fruit("아보카도",priceList[0],imglist[0]));
        fruit.add(new Fruit("수박",priceList[1],imglist[1]));
        fruit.add(new Fruit("키위",priceList[2],imglist[2]));
        fruit.add(new Fruit("바나나",priceList[3],imglist[3]));

        adapter= new GridAdapter(this,fruit);
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Log.d("abc","abac");
                Toast.makeText(Main2Activity.this, "이거 오ㅑ ㅏ아ㅣㅓㄴ어리ㅏ", Toast.LENGTH_SHORT).show();
            }
        });
//        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Log.d("abc","abac");
//                Toast.makeText(Main2Activity.this, "이거 오ㅑ ㅏ아ㅣㅓㄴ어리ㅏ", Toast.LENGTH_SHORT).show();
//                addFruit.buttonChange();
//                Fposition = position;
//                Fruit fu = (Fruit)adapter.getItem(position);
//                AutoCompleteTextView t1 = (AutoCompleteTextView)findViewById(R.id.f_name);
//                EditText t2 = (EditText)findViewById(R.id.f_price);
//                ImageView i1 = (ImageView)findViewById(R.id.image1);
//                t1.setText(fu.name);
//                t2.setText(fu.price);
//                i1.setImageResource(imglist[fu.imgno]);
//
//            }
//        });

        auto = new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,fruitName);
        AutoCompleteTextView auT = (AutoCompleteTextView)findViewById(R.id.f_name);
        auT.setAdapter(auto);


        c1 = (CheckBox)findViewById(R.id.check1);
        c1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                adapter.Checkprice();
                adapter.notifyDataSetChanged();
            }
        });




        addFruit =(AddFruit)findViewById(R.id.w1);
        addFruit.setOnAddListener(new AddFruit.OnAddListener() {
            @Override
            public void onAdd(String name,String price, int imgno) {
                Toast.makeText(getApplicationContext(),name+"가 추가되었습니다.",Toast.LENGTH_SHORT).show();
                fruit.add(new Fruit(name,price,imglist[imgno]));
                adapter.notifyDataSetChanged();
            }
        });
        addFruit.setOnModifyListener(new AddFruit.OnModifyListener() {
            @Override
            public void onModify(String name, String price, int imgmo) {
                Toast.makeText(Main2Activity.this, "수정되었습니다.", Toast.LENGTH_SHORT).show();
                fruit.set(Fposition,new Fruit(name,price,imglist[imgmo]));
                addFruit.buttonChange();
                adapter.notifyDataSetChanged();
            }
        });



    }

}
