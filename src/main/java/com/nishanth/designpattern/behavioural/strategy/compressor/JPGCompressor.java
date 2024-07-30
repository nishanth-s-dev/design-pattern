package com.nishanth.designpattern.behavioural.strategy.compressor;

public class JPGCompressor implements ImageCompressor{
    @Override
    public void compress() {
        System.out.println("JPG Compressor");
    }
}
