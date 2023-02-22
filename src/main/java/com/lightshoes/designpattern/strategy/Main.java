package com.lightshoes.designpattern.strategy;

public class Main {

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Item A = new Item("light", 1000);
        Item B = new Item("shoes", 3000);

        cart.addItem(A);
        cart.addItem(B);

        // pay by LUNACard
        cart.pay(new LUNACardStrategy("lightshoes@test.com", "qwerty"));
        // pay by KAKAOBank
        cart.pay(new KAKAOCardStrategy("Lee shinkwang", "1234567", "123", "12/01"));
    }
}
