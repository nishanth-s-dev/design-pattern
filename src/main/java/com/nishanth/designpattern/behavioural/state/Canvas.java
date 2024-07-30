package com.nishanth.designpattern.behavioural.state;


// This is not maintainable
// If we need to add another methods like keyUp and keyDown, we need to duplicate those long conditions.
// Also, if we need to add one more tool, We need to modify all the methods. Which is not great and hard to extend.

public class Canvas {
    private ToolType currentTool;

    public void mouseUp() {
        if (currentTool == ToolType.SELECTION) {
            System.out.println("Selection Icon");
        } else if (currentTool == ToolType.BRUSH) {
            System.out.println("Brush Icon");
        } else if (currentTool == ToolType.ERASER) {
            System.out.println("Eraser Icon");
        }
    }

    public void mouseDown() {
        if (currentTool == ToolType.SELECTION) {
            System.out.println("Draw dashed rectangle");
        } else if (currentTool == ToolType.BRUSH) {
            System.out.println("Draw line");
        } else if (currentTool == ToolType.ERASER) {
            System.out.println("Erase something");
        }
    }
}
