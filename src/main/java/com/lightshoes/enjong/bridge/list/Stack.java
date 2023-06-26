package com.lightshoes.enjong.bridge.list;

import com.lightshoes.enjong.bridge.impl.AbstractList;

public class Stack<T> extends List<T> {

    public Stack(AbstractList<T> list) {
        super(list);
        System.out.println("Stack을 만듭니다.");
    }

    public void push(T object) {
        super.add(object, 0);
    }

    public T pop() {
        return super.remove(0);
    }

    public T peek() {
        return super.get(0);
    }
}
