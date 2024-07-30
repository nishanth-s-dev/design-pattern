package com.nishanth.designpattern.behavioural.iterator;

//import java.util.Stack;

// If we decide to change internal implementation of urls, it will affect Client code.
// It can affect code in this class. That's fine. But it should not affect outside code.
// Assume, 100 classes using this class, and breaking because of this internal change.
// We can solve this with the help of iterator pattern.

public class BrowserHistory {
//    private final Stack<String> urls = new Stack<>();
    private final String[] urls = new String[10];

    public void push(String url) {
//        urls.push(url);
    }

    public String pop() {
//        return urls.pop();

//        temp
        return null;
    }

    public String[] getUrls() {
        return urls;
    }
}
