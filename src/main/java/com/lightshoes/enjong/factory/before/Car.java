package com.lightshoes.enjong.factory.before;

public class Car {

    public static final String SONATA = "Sonata";
    public static final String GRANDEUR = "Grandeur";
    public static final String GENESIS = "Genesis";

    String productName;

    public Car(String productName) {
        this.productName = productName;
    }

    @Override
    public String toString() {
        return productName;
    }
}
