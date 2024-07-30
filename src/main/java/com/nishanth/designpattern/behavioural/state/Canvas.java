package com.nishanth.designpattern.behavioural.state;


// This is not maintainable
// If we need to add another methods like keyUp and keyDown, we need to duplicate those long conditions.
// Also, if we need to add one more tool, We need to modify all the methods. Which is not great and hard to extend.

import com.nishanth.designpattern.behavioural.state.tool.Tool;

public class Canvas {
    private Tool currentTool;

    public void mouseUp() {
        currentTool.mouseUp();
    }

    public void mouseDown() {
        currentTool.mouseDown();
    }

    public void setCurrentTool(Tool currentTool) {
        this.currentTool = currentTool;
    }
}
