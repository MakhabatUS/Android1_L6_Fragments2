package com.makhabatusen.android1_l6_fragments2;

public class DestinationModel {
    private String title;
    private String desc;
    private int image;


    public DestinationModel(String title, String desc, int image) {
        this.title = title;
        this.desc = desc;
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public String getDesc() {
        return desc;
    }

    public int getImage() {
        return image;
    }
}
