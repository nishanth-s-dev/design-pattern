package com.nishanth.designpattern.behavioural.strategy;

import com.nishanth.designpattern.behavioural.strategy.compressor.ImageCompressor;
import com.nishanth.designpattern.behavioural.strategy.filter.ImageFilter;
import com.nishanth.designpattern.behavioural.strategy.compressor.JPEGCompressor;
import com.nishanth.designpattern.behavioural.strategy.filter.BlackAndWhiteImageFilter;

public class Client {
    public static void main(String[] args) {
        ImageFilter imageFilter = new BlackAndWhiteImageFilter();
        ImageCompressor imageCompressor = new JPEGCompressor();
        ImageStorage imageStorage = new ImageStorage(imageCompressor, imageFilter);
        imageStorage.store("test.jpeg");
    }
}
