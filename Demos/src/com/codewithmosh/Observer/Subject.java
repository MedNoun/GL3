package com.codewithmosh.Observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observers = new ArrayList<>();
    public void addObserver(Observer e){
        observers.add(e);

    }
    public void removeObserver(Observer e){
        observers.remove(e);
    }
    public void notifyObservers(){
        for(var observer : observers){
            observer.update();
        }
    }
}
