package com.lightshoes.designpattern.factory;

public class Espresso extends Coffee {

    private int price;

    public Espresso(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
