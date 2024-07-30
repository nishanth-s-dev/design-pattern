package com.nishanth.designpattern.behavioural.state.tool;

public class InkFiller implements Tool {
    @Override
    public void mouseUp() {
        System.out.println("InkFiller icon");
    }

    @Override
    public void mouseDown() {
        System.out.println("Filling ink");
    }
}
