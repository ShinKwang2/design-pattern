package com.lightshoes.enjong.bridge.list;

import com.lightshoes.enjong.bridge.impl.AbstractList;

public abstract class List<T> {

    private AbstractList<T> impl;

    protected List(AbstractList<T> list) {
        this.impl = list;
    }

    protected void add(T object, int i) {
        impl.insertElement(object, i);
    }

    protected T remove(int i) {
        return impl.deleteElement(i);
    }

    protected T get(int i) {
        return impl.getElement(i);
    }

    protected int getSize() {
        return impl.getElementSize();
    }
}
