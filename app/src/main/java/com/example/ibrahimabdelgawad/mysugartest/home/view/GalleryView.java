package com.example.ibrahimabdelgawad.shpocktest.home.view;

import com.example.ibrahimabdelgawad.shpocktest.core.BaseView;
import com.example.ibrahimabdelgawad.shpocktest.home.model.Item;

import java.util.List;

/**
 * Created by Ibrahim AbdelGawad on 12/25/2017.
 */

public interface GalleryView extends BaseView{
    void showGalleryList(List<Item> itemList);
    void showLoading();
    void hideLoading();
}
