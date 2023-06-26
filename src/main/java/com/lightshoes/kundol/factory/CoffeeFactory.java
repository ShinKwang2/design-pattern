package com.lightshoes.kundol.factory;

public class CoffeeFactory {

    public static Coffee orderCoffee(String order) {
        return makeCoffee(order);
    }

    private static Coffee makeCoffee(String order) {
        CoffeeMenu[] coffeeMenus = CoffeeMenu.class.getEnumConstants();
        for (CoffeeMenu coffeeMenu : coffeeMenus) {
            if (coffeeMenu.name().equalsIgnoreCase(order)) {
                return coffeeMenu.getCoffee();
            }
        }
        return null;
    }
}
