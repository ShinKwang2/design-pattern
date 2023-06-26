package com.lightshoes.enjong.bridge.impl;

import java.util.ArrayList;

public class ArrayListImpl<T> implements AbstractList<T> {

    private ArrayList<T> array;

    public ArrayListImpl() {
        array = new ArrayList<>();
        System.out.println("Array로 구현합니다.");
    }

    @Override
    public T deleteElement(int i) {
        if (array.size() == 0) {
            return null;
        }
        return array.remove(i);
    }

    @Override
    public T getElement(int i) {
        return array.get(i);
    }

    @Override
    public int insertElement(T obj, int i) {
        array.add(i, obj);
        return i;
    }

    @Override
    public int getElementSize() {
        return array.size();
    }
}
