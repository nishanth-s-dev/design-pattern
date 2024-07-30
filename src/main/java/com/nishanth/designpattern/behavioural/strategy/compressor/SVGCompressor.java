package com.nishanth.designpattern.behavioural.strategy.compressor;

public class SVGCompressor implements ImageCompressor{
    @Override
    public void compress() {
        System.out.println("SVG Compressor");
    }
}
