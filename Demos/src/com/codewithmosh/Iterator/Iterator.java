package com.codewithmosh.Iterator;


public interface Iterator<T> {
    T current();
    Boolean hasNext();
    void next();
}
