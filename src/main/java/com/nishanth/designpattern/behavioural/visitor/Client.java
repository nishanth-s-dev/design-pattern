package com.nishanth.designpattern.behavioural.visitor;

import com.nishanth.designpattern.behavioural.visitor.html.HtmlDocument;
import com.nishanth.designpattern.behavioural.visitor.html.nodes.AnchorNode;
import com.nishanth.designpattern.behavioural.visitor.html.nodes.HeadingNode;

public class Client {
    public static void main(String[] args) {
        HtmlDocument htmlDocument = new HtmlDocument();
        htmlDocument.addNode(new HeadingNode());
        htmlDocument.addNode(new AnchorNode());
        htmlDocument.highlight();
    }
}
