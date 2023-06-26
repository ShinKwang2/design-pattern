package com.lightshoes.enjong.factory.mylast;


public class CarTest {
    private final CarFactory factory = new HyundaiFactory();

    public static void main(String[] args) {

        CarTest test = new CarTest();
        Car car = test.produceCar("Sonata");
        Car car2 = test.produceCar("Genesis");

    }

    public Car produceCar(String name) {
        return factory.manufacturingCar(name);
    }
}
