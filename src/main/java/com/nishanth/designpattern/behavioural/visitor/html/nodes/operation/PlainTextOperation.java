package com.nishanth.designpattern.behavioural.visitor.html.nodes.operation;

import com.nishanth.designpattern.behavioural.visitor.html.nodes.AnchorNode;
import com.nishanth.designpattern.behavioural.visitor.html.nodes.HeadingNode;

public class PlainTextOperation implements Operation {
    @Override
    public void executeOperation(HeadingNode node) {
        System.out.println("Plain Text Operation : Heading Node");
    }

    @Override
    public void executeOperation(AnchorNode node) {
        System.out.println("Plain Text Operation : Anchor Node");
    }
}
