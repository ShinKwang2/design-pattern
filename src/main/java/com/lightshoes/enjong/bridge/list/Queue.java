package com.lightshoes.enjong.bridge.list;

import com.lightshoes.enjong.bridge.impl.AbstractList;

public class Queue<T> extends List<T> {


    public Queue(AbstractList<T> list) {
        super(list);
        System.out.println("Queue를 만듭니다.");
    }

    public void enQueue(T object) {
        super.add(object, getSize());
    }

    public T deQueue() {
        return remove(0);
    }
}
