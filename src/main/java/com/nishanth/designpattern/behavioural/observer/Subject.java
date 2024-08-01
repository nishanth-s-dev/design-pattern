package com.nishanth.designpattern.behavioural.observer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Subject {
    private final List<Observer> observers = new LinkedList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(Object value) {
        for (Observer observer : observers) {
            observer.update(value);
        }
    }
}
