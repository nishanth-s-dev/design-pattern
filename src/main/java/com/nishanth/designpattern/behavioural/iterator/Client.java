package com.nishanth.designpattern.behavioural.iterator;

public class Client {
    public static void main(String[] args) {
        BrowserHistory history = new BrowserHistory();
        history.push("a");
        history.push("b");
        history.push("c");

        Iterator iterator = history.createIterator();
        while (!iterator.isDone()) {
            System.out.println(iterator.current());
            iterator.next();
        }
    }
}
