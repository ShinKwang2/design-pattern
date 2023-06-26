package com.lightshoes.enjong.factory.last;

public abstract class CarFactory {

    public  Car manufacturingCar(String name) {

        Car car;
        preparingOthers();
        car = createCar(name);
        washCar();

        return car;
    }

    public void preparingOthers() {
        System.out.println("preparingOthers");
    }

    public void washCar() {
        System.out.println("washCar");
    }

    public abstract Car createCar(String name);
}
