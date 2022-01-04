package com.example.dz_7.model;

public class Postor {

    private int image;
    private String text;
    private int image2;

    public Postor(int image, String text, int image2) {
        this.image = image;
        this.text = text;
        this.image2 = image2;
    }

    public int getImage2() {
        return image2;
    }

    public Postor(int image, String text) {
        this.image = image;
        this.text = text;
    }

    public int getImage() {
        return image;
    }

    public String getText() {
        return text;
    }
}
