package com.nishanth.designpattern.behavioural.visitor.html.nodes;

public class AnchorNode implements HtmlNode{
    @Override
    public void highlight() {
        System.out.println("Highlight Anchor");
    }
}
