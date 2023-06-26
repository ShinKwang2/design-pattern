package com.lightshoes.kundol.factory;

public enum CoffeeMenu {

    Americano(new Americano(3000)),
    Latte(new Latte(4500)),
    Espresso(new Espresso(2500)),
    Macchiato(new Macchiato(5000));

    private Coffee coffee;

    CoffeeMenu(Coffee coffee) {
        this.coffee = coffee;
    }

    public Coffee getCoffee() {
        return coffee;
    }
}
