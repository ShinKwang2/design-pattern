package com.lightshoes.enjong.template.after;

public class ElectronicCar extends Car {

    @Override
    public void drive() {
        System.out.println("전기로 운행을 합니다");
    }

    @Override
    public void stop() {
        System.out.println("전기 동력을 끊어 멈춥니다.");
    }
}
