package com.codewithmosh.Strategy;

public class ImageStorage {
    private Compressor compressor;
    private Filter filter;
    public ImageStorage(Compressor compressor, Filter filter) {
        this.compressor = compressor;
        this.filter = filter;
    }
    public void store(String filename){
        compressor.apply();
        filter.apply();
    }
    
}
