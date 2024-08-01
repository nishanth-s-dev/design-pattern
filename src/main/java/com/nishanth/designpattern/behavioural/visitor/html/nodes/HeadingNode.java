package com.nishanth.designpattern.behavioural.visitor.html.nodes;

public class HeadingNode implements HtmlNode {
    @Override
    public void highlight() {
        System.out.println("highlight heading");
    }

    @Override
    public void plainText() {
        System.out.println("Plain heading");
    }
}
