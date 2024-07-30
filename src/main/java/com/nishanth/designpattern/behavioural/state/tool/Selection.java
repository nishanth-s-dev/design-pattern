package com.nishanth.designpattern.behavioural.state.tool;

public class Selection implements Tool {
    @Override
    public void mouseUp() {
        System.out.println("Selection Icon");
    }

    @Override
    public void mouseDown() {
        System.out.println("drawing dashed rectangle");
    }
}
