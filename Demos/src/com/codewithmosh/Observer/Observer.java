package com.codewithmosh.Observer;

public abstract class Observer {
    protected DataSource data;
    
    public Observer(DataSource data) {
        this.data = data;
    }
    abstract void update();
}
