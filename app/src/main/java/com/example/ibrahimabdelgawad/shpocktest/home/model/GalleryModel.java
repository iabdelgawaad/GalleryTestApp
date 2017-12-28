package com.example.ibrahimabdelgawad.shpocktest.home.model;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Ibrahim AbdelGawad on 12/25/2017.
 */

public class GalleryModel implements Serializable{
    private Boolean success;
    private List<Item> items = null;

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
