package com.example.ibrahimabdelgawad.shpocktest.home.fragment;

import com.example.ibrahimabdelgawad.shpocktest.core.BaseFragment;
import com.example.ibrahimabdelgawad.shpocktest.home.model.Item;
import com.example.ibrahimabdelgawad.shpocktest.home.presenter.GalleryPresenterImp;
import com.example.ibrahimabdelgawad.shpocktest.home.view.GalleryView;

import java.util.List;

/**
 * Created by Ibrahim AbdelGawad on 12/27/2017.
 */

public class GalleryFragment extends BaseFragment<GalleryPresenterImp>  implements GalleryView {

    @Override
    public void showGalleryList(List<Item> itemList) {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    public GalleryPresenterImp getPresenter() {
        return null;
    }
}
