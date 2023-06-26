package com.lightshoes.enjong.bridge.impl;

public interface AbstractList<T> {

    T deleteElement(int i);

    T getElement(int i);

    int insertElement(T obj, int i);

    int getElementSize();
}
