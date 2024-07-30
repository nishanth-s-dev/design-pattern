package com.nishanth.designpattern.behavioural.strategy;

import com.nishanth.designpattern.behavioural.strategy.compressor.ImageCompressor;
import com.nishanth.designpattern.behavioural.strategy.filter.ImageFilter;
import com.nishanth.designpattern.behavioural.strategy.compressor.JPEGCompressor;
import com.nishanth.designpattern.behavioural.strategy.filter.BlackAndWhiteImageFilter;


/*
    * Difference between state pattern and strategy pattern.
    * In state pattern the class behaves based on the current state object, which is currentTool in our example.
    * The currentTool is a concrete implementation of Tool interface. which has two methods in our case. all tools should have that methods.
    * In state pattern there is only one state, in contrast strategy have more than one. Different behaviour are represented based on different strategy object.
 */

public class Client {
    public static void main(String[] args) {
        ImageFilter imageFilter = new BlackAndWhiteImageFilter();
        ImageCompressor imageCompressor = new JPEGCompressor();
        ImageStorage imageStorage = new ImageStorage(imageCompressor, imageFilter);
        imageStorage.store("test.jpeg");
    }
}
