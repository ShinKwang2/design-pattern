package com.lightshoes.enjong.factory.mylast;

public abstract class Car {

    String productName;

    public Car(String productName) {
        this.productName = productName;
    }

    @Override
    public String toString() {
        return productName;
    }
}
