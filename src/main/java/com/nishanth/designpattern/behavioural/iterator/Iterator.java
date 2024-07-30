package com.nishanth.designpattern.behavioural.iterator;

public interface Iterator {
    boolean isDone();
    String current();
    void next();
}
