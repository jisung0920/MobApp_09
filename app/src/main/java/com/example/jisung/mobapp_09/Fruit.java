package com.example.jisung.mobapp_09;

/**
 * Created by jisung on 2017-04-27.
 */

public class Fruit {
    final static String[] fruit={"아보카도","수박","키위","바나나","체리","크랜베리"};
    final static int[] image={R.drawable.abocado,R.drawable.watermelon,R.drawable.kiwi,R.drawable.banana,R.drawable.cherry,R.drawable.cranberry};;

    String name;
    String price;
    int imgno;

    public Fruit(String name,String price, int imgno) {
        this.name = name;
        this.price=price;
        this.imgno = imgno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImgno() {
        return imgno;
    }

    public void setImgno(int imgno) {
        this.imgno = imgno;
    }
}
