package com.nishanth.designpattern.behavioural.strategy;

import com.nishanth.designpattern.behavioural.strategy.constant.ImageCompressor;
import com.nishanth.designpattern.behavioural.strategy.constant.ImageFilter;

public class ImageStorage {
    private final ImageCompressor compressor;
    private final ImageFilter filter;

    public ImageStorage(ImageCompressor compressor, ImageFilter filter) {
        this.compressor = compressor;
        this.filter = filter;
    }

    public void store(String fileName) {
        // Compressing image
        if (compressor == ImageCompressor.JPEG) {
            System.out.println("JPEG compressor");
        } else if (compressor == ImageCompressor.PNG) {
            System.out.println("PNG compressor");
        } else if (compressor == ImageCompressor.JPG) {
            System.out.println("JPG compressor");
        } else if (compressor == ImageCompressor.SVG) {
            System.out.println("SVG compressor");
        }

        // Filtering image
        if (filter == ImageFilter.BEAUTIFY) {
            System.out.println("Applying Beautify Filter");
        } else if (filter == ImageFilter.BLACK_AND_WHITE) {
            System.out.println("Applying Black and White Filter");
        } else if (filter == ImageFilter.HIGH_CONTRAST) {
            System.out.println("Applying High Contrast Filter");
        } else if (filter == ImageFilter.BLUE_CONTRAST) {
            System.out.println("Applying Blue Contrast Filter");
        }


        // Storing logic
    }
}
