package com.example.recycleview;

public class ModelClass {
    private int imageview1;
    private String textview1;
    private String divider;

    ModelClass(int imageview1, String textview1, String divider) {
        this.imageview1 = imageview1;
        this.textview1 = textview1;
        this.divider = divider;

    }

    public int getImageview1() {
        return imageview1;
    }

    public String getTextview1() {
        return textview1;
    }

    public String getDivider() {
        return divider;
    }
}
