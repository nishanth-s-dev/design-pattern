package com.nishanth.designpattern.behavioural.iterator;

public class Client {
    public static void main(String[] args) {
        BrowserHistory history = new BrowserHistory();
        history.push("a");
        history.push("b");
        history.push("c");

        for (String url : history.getUrls()) {
            System.out.println(url);
        }

        for (int i = 0; i < history.getUrls().size(); i++) {
            System.out.println(history.getUrls().get(i));
        }
    }
}
