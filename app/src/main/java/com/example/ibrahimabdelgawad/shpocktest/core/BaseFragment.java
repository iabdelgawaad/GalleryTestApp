package com.example.ibrahimabdelgawad.shpocktest.core;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ibrahimabdelgawad.shpocktest.R;

import butterknife.ButterKnife;

/**
 * Created by Ibrahim AbdelGawad on 12/25/2017.
 */

public abstract class BaseFragment<P extends BasePresenter> extends Fragment implements BaseView {

    P presenter;

    public BaseFragment() {
        super();
    }

    public abstract P getPresenter();

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View baseView = inflater.inflate(R.layout.fragment_base_layout, container, false);
        ButterKnife.bind(this, baseView);

        return baseView;
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void showError(String error) {

    }
}
