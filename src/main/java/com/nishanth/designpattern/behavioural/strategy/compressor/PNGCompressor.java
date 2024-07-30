package com.nishanth.designpattern.behavioural.strategy.compressor;

public class PNGCompressor implements ImageCompressor{
    @Override
    public void compress() {
        System.out.println("Compressing PNG image");
    }
}
