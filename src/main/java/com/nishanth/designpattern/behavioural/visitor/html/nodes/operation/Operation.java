package com.nishanth.designpattern.behavioural.visitor.html.nodes.operation;

import com.nishanth.designpattern.behavioural.visitor.html.nodes.AnchorNode;
import com.nishanth.designpattern.behavioural.visitor.html.nodes.HeadingNode;

public interface Operation {
    void executeOperation(HeadingNode node);
    void executeOperation(AnchorNode node);
}
