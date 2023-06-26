package com.lightshoes.kundol.factory;

public class Main {

    public static void main(String[] args) {
        Coffee latte = CoffeeFactory.orderCoffee("Latte");
        Coffee americano = CoffeeFactory.orderCoffee("Americano");
        Coffee wrongOrder = CoffeeFactory.orderCoffee("wrongOrder");

        System.out.println("Factory Latte :: " + latte);
        System.out.println("Factory Americano :: " + americano);
        System.out.println("Factory Wrong Order :: " + wrongOrder);
    }
}
