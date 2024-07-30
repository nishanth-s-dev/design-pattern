package com.nishanth.designpattern.behavioural.state.tool;

public class Brush implements Tool {
    @Override
    public void mouseUp() {
        System.out.println("Brush Icons");
    }

    @Override
    public void mouseDown() {
        System.out.println("Drawing a dashed line");
    }
}
