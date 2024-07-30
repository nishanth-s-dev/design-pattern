package com.nishanth.designpattern.behavioural.strategy.compressor;

public class JPEGCompressor implements ImageCompressor{
    @Override
    public void compress() {
        System.out.println("Jpeg Compressor");
    }
}
