package com.nishanth.designpattern.behavioural.iterator;

import java.util.Stack;

public class StackIterator implements Iterator{
    private final Stack<String> stack;

    public StackIterator(Stack<String> stack) {
        this.stack = stack;
    }

    @Override
    public boolean isDone() {
        return stack.isEmpty();
    }

    @Override
    public String current() {
        return stack.peek();
    }

    @Override
    public void next() {
        stack.pop();
    }
}
