package com.nishanth.designpattern.behavioural.strategy;


import com.nishanth.designpattern.behavioural.strategy.compressor.ImageCompressor;
import com.nishanth.designpattern.behavioural.strategy.filter.ImageFilter;

public class ImageStorage {
    private final ImageCompressor compressor;
    private final ImageFilter filter;

    public ImageStorage(ImageCompressor compressor, ImageFilter filter) {
        this.compressor = compressor;
        this.filter = filter;
    }

    public void store(String fileName) {
        // Compressing image
        compressor.compress();

        // Filtering image
        filter.filter();

        // Storing logic
        System.out.println("Stored image to " + fileName);
    }
}
