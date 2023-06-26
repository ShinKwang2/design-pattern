package com.lightshoes.enjong.singleton;

public class SingletonMultiThread {

    private static volatile SingletonMultiThread instance;

    private SingletonMultiThread() {}

    public static SingletonMultiThread getInstance() {

        SingletonMultiThread temp = instance;
        if (temp == null) {
            synchronized (SingletonMultiThread.class) {
                if (temp == null) {
                    instance = temp = new SingletonMultiThread();
                }
            }
        }
        return temp;
    }
}
