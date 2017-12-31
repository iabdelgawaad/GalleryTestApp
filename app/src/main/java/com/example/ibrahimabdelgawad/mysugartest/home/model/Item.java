package com.example.ibrahimabdelgawad.shpocktest.home.model;

import java.io.Serializable;

/**
 * Created by Ibrahim AbdelGawad on 12/25/2017.
 */

public class Item implements Serializable{
    private Integer id;
    private String title;
    private String description;
    private Integer price;
    private String image;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
