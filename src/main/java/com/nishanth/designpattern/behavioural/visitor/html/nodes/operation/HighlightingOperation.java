package com.nishanth.designpattern.behavioural.visitor.html.nodes.operation;

import com.nishanth.designpattern.behavioural.visitor.html.nodes.AnchorNode;
import com.nishanth.designpattern.behavioural.visitor.html.nodes.HeadingNode;

public class HighlightingOperation implements Operation {
    @Override
    public void executeOperation(HeadingNode node) {
        System.out.println("Heading is highlighted");
    }

    @Override
    public void executeOperation(AnchorNode node) {
        System.out.println("Anchor is highlighted");
    }
}
