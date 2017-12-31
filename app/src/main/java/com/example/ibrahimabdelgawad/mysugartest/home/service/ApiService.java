package com.example.ibrahimabdelgawad.shpocktest.home.service;

import com.example.ibrahimabdelgawad.shpocktest.home.model.GalleryModel;

import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * Created by Ibrahim AbdelGawad on 12/25/2017.
 */

public interface ApiService {
    @GET("items")
    Observable<GalleryModel> getGalleryItems();
}
