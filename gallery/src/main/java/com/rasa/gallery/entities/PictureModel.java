package com.rasa.gallery.entities;

import java.io.Serializable;

public class PictureModel implements Serializable {
    private String imageUrl;
    private String textTitle;


    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getTextTitle() {
        return textTitle;
    }

    public void setTextTitle(String textTitle) {
        this.textTitle = textTitle;
    }
}
