package com.nishanth.designpattern.behavioural.visitor;

import com.nishanth.designpattern.behavioural.visitor.html.HtmlDocument;
import com.nishanth.designpattern.behavioural.visitor.html.nodes.AnchorNode;
import com.nishanth.designpattern.behavioural.visitor.html.nodes.HeadingNode;
import com.nishanth.designpattern.behavioural.visitor.html.nodes.operation.HighlightingOperation;
import com.nishanth.designpattern.behavioural.visitor.html.nodes.operation.MakeBoldOperation;
import com.nishanth.designpattern.behavioural.visitor.html.nodes.operation.PlainTextOperation;

public class Client {
    public static void main(String[] args) {
        HtmlDocument htmlDocument = new HtmlDocument();
        htmlDocument.addNode(new HeadingNode());
        htmlDocument.addNode(new AnchorNode());

        htmlDocument.execute(new HighlightingOperation());
        htmlDocument.execute(new PlainTextOperation());
        htmlDocument.execute(new MakeBoldOperation());
    }
}
