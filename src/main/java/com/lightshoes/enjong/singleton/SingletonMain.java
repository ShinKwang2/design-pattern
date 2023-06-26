package com.lightshoes.enjong.singleton;

import java.util.Calendar;

public class SingletonMain {

    public static void main(String[] args) {
        Singleton singletonA = Singleton.getInstance();
        Singleton singletonB = Singleton.getInstance();

        if (singletonA == singletonB) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }

        Calendar calendarA = Calendar.getInstance();
        System.out.println(calendarA);
        Calendar calendarB = Calendar.getInstance();
        System.out.println(calendarB);

        System.out.println(calendarA == calendarB);
    }
}
