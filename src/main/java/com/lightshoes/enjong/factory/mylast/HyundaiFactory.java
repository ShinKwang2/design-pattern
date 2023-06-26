package com.lightshoes.enjong.factory.mylast;


public class HyundaiFactory extends CarFactory {

    @Override
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

        System.out.println(car);
        return car;
    }
}
