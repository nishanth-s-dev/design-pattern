package com.nishanth.designpattern.behavioural.strategy;


import com.nishanth.designpattern.behavioural.strategy.compressor.ImageCompressor;
import com.nishanth.designpattern.behavioural.strategy.filter.ImageFilter;

public class ImageStorage {
    public void store(String fileName, ImageCompressor compressor, ImageFilter filter) {
        // Compressing image
        compressor.compress();

        // Filtering image
        filter.filter();

        // Storing logic
        System.out.println("Stored image to " + fileName);
    }
}
