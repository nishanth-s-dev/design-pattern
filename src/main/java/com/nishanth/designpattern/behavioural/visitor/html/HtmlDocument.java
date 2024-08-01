package com.nishanth.designpattern.behavioural.visitor.html;

import com.nishanth.designpattern.behavioural.visitor.html.nodes.HtmlNode;
import com.nishanth.designpattern.behavioural.visitor.html.nodes.operation.Operation;

import java.util.LinkedList;
import java.util.List;

public class HtmlDocument {
    private final List<HtmlNode> nodes = new LinkedList<>();

    public void addNode(HtmlNode node) {
        nodes.add(node);
    }

    public void execute(Operation operation) {
        for (HtmlNode node : nodes) {
            node.execute(operation);
        }
    }
}
