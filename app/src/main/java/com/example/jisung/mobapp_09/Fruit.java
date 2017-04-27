package com.example.jisung.mobapp_09;

/**
 * Created by jisung on 2017-04-27.
 */

public class Fruit {
    String name;
    int imgno;

    public Fruit(String name, int imgno) {
        this.name = name;
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
