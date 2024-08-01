package com.nishanth.designpattern.behavioural.visitor.html.nodes;

import com.nishanth.designpattern.behavioural.visitor.html.nodes.operation.Operation;

public interface HtmlNode {
    void execute(Operation operation);
}
