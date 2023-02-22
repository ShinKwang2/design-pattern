package com.lightshoes.designpattern.strategy;

public class LUNACardStrategy implements PaymentStrategy {

    private String email;
    private String password;

    public LUNACardStrategy(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid using LUNACard.");
    }
}
