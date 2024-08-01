package com.nishanth.designpattern.behavioural.visitor.html.nodes;

import com.nishanth.designpattern.behavioural.visitor.html.nodes.operation.Operation;

public class AnchorNode implements HtmlNode{
    @Override
    public void execute(Operation operation) {
        operation.executeOperation(this);
    }
}
