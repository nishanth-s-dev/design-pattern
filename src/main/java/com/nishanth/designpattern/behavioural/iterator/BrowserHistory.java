package com.nishanth.designpattern.behavioural.iterator;

import java.util.Stack;

public class BrowserHistory {
    private final Stack<String> urls = new Stack<>();

    public void push(String url) {
        urls.push(url);
    }

    public String pop() {
        return urls.pop();
    }

    public Stack<String> getUrls() {
        return urls;
    }

    public Iterator createIterator() {
        return new StackIterator(urls);
    }
}
