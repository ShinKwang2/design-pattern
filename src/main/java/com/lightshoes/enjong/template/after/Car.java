package com.lightshoes.enjong.template.after;

public abstract class Car {

    public final void run() { //재정의 금지를 위한 final
        startCar();
        drive();
        stop();
        turnOff();
        washCar();
    }

    public abstract void drive();

    public abstract void stop();

    public void startCar() {
        System.out.println("시동을 켭니다.");
    }
    public void turnOff() {
        System.out.println("시동을 끕니다.");
    }

    public void washCar() {};
}
