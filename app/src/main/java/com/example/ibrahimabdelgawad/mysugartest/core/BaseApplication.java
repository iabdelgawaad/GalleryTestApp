package com.example.ibrahimabdelgawad.shpocktest.core;

import android.app.Application;

/**
 * Created by Ibrahim AbdelGawad on 12/25/2017.
 */

public class BaseApplication extends Application {

    private static BaseApplication instance;

    public BaseApplication getInstance() {
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
    }
}
