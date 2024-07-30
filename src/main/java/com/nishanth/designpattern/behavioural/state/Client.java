package com.nishanth.designpattern.behavioural.state;

import com.nishanth.designpattern.behavioural.state.tool.Brush;
import com.nishanth.designpattern.behavioural.state.tool.Eraser;

public class Client {
    public static void main(String[] args) {
        Canvas canvas = new Canvas();
        canvas.setCurrentTool(new Brush());

        canvas.mouseUp();
        canvas.mouseDown();

        canvas.setCurrentTool(new Eraser());
        canvas.mouseUp();
        canvas.mouseDown();
    }
}
