package com.nishanth.designpattern.behavioural.iterator;

import java.util.Stack;

public class BrowserHistory {
//    private final Stack<String> urls = new Stack<>();
    private final String[] urls = new String[10];
    int index = 0;

    public void push(String url) {
//        urls.push(url);
        urls[index++] = url;
    }

    public String pop() {
//        return urls.pop();
        return urls[--index];
    }

    public String[] getUrls() {
//        return urls;
        return urls;
    }

    public Iterator createIterator() {
//        return new StackIterator(urls);
        return new ListIterator(urls);
    }
}
