package com.example.miniinstagram;

import java.util.Date;

public class Notice {

    private Date date;
    private int image;
    private boolean like;

    public Notice() {

    }

    public Notice(Date date, int image, boolean like) {
        this.date = date;
        this.image = image;
        this.like = like;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public boolean isLike() {
        return like;
    }

    public void setLike(boolean like) {
        this.like = like;
    }
}
