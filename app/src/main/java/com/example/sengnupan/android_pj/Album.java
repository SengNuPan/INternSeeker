package com.example.sengnupan.android_pj;


public class Album {
    private int react;
    private int[]images;

    public Album( int[] images,int react) {
        this.react = react;
        this.images = images;
    }

    public int[] getImages() {
        return images;
    }

    public void setImages(int[] images) {
        this.images = images;
    }

    public int getReact() {
        return react;
    }

    public void setReact(int react) {
        this.react = react;
    }
}