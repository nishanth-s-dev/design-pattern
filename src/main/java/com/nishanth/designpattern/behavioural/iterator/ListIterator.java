package com.nishanth.designpattern.behavioural.iterator;

public class ListIterator implements Iterator {
    private final String[] list;
    private int index = 0;

    public ListIterator(String[] list) {
        this.list = list;
    }

    @Override
    public boolean isDone() {
        return index == list.length;
    }

    @Override
    public String current() {
        return list[index];
    }

    @Override
    public void next() {
        index++;
    }
}
