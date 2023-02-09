package com.lightshoes.designpattern.factory;

public class Macchiato extends Coffee {

    private int price;

    public Macchiato(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return this.price;
    }
}
