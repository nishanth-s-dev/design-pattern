package com.nishanth.designpattern.behavioural.iterator;

public interface Iterator {
    // isDone == hasNext
    boolean isDone();
    String current();
    void next();
}
