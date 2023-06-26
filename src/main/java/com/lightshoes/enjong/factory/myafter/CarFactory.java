package com.lightshoes.enjong.factory.myafter;

public class CarFactory {

    public Car createCar(String productName) {

        Car car = null;
        if (productName.equalsIgnoreCase("sonata")) {
            car = new Sonata();
        }
        else if (productName.equalsIgnoreCase("grandeur")) {
            car = new Grandeur();
        }
        else if (productName.equalsIgnoreCase("genesis")) {
            car = new Genesis();
        }

        return car;
    }
}
