package com.example.ibrahimabdelgawad.shpocktest.home.service;

import android.content.Context;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Ibrahim AbdelGawad on 12/25/2017.
 */

public class NetworkManager {

    private ApiService apiService;
    private Context context;
    private Retrofit retrofit;

    public NetworkManager(Context context) {
        this.context = context;
        initRetrofit();
    }

    private void initRetrofit() {
        OkHttpClient.Builder httpClient = new OkHttpClient
                .Builder();

        retrofit = new Retrofit.Builder()
                .baseUrl("http://www.nsode.at/")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(httpClient.build())
                .build();
    }

    public ApiService service() {
        if (apiService == null) {
            apiService = retrofit.create(ApiService.class);
        }
        return apiService;
    }
}
