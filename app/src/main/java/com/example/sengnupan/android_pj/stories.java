package com.example.sengnupan.android_pj;

public class stories{
    private int imageId;
    private String movieName;
    private String aboutMovie;

    public stories(int imageId, String movieName, String aboutMovie) {
        this.imageId = imageId;
        this.movieName = movieName;
        this.aboutMovie = aboutMovie;
    }

    public String getMovieName() {
        return movieName;
    }

    public int getImageId() {
        return imageId;
    }

    public String getAboutMovie() {
        return aboutMovie;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public void setAboutMovie(String aboutMovie) {
        this.aboutMovie = aboutMovie;
    }
}
