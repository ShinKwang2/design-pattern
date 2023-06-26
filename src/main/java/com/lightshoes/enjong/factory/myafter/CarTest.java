package com.lightshoes.enjong.factory.myafter;


public class CarTest {

    public static void main(String[] args) {

        CarTest test = new CarTest();
        Car car = test.produceCar("Sonata");
        Car car2 = test.produceCar("Genesis");

        System.out.println("car = " + car);
        System.out.println("car2 = " + car2);
    }

    public Car produceCar(String name) {

        Car car = null;

        CarFactory factory = new CarFactory();
        return factory.createCar(name);
    }
}
