package com.lightshoes.enjong.factory.mylast;

public abstract class CarFactory {

    public Car manufacturingCar(String name) {

        Car car;
        preparingOthers(name);
        car = createCar(name);
        washCar(name);

        return car;
    }

    public void preparingOthers(String name) {
        System.out.println("preparingOthers - " + name);
    }

    public void washCar(String name) {
        System.out.println("washCar - " + name );
    }

    public abstract Car createCar(String name);
}
