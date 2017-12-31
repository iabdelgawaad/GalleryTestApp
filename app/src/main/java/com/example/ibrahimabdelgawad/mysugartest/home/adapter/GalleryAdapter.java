package com.example.ibrahimabdelgawad.shpocktest.home.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ibrahimabdelgawad.shpocktest.R;
import com.example.ibrahimabdelgawad.shpocktest.home.model.Item;

import java.util.List;

/**
 * Created by Ibrahim AbdelGawad on 10/15/2017.
 */

public class GalleryAdapter extends RecyclerView.Adapter<GalleryViewHolder> {

    private Context mContext;
    private List<Item> carModelList;

    public interface OnItemClickListener {
        void onItemClick(Item item);
    }

    private final OnItemClickListener listener;

    public GalleryAdapter(Context mContext, List<Item> carModelList, OnItemClickListener listener) {
        this.mContext = mContext;
        this.carModelList = carModelList;
        this.listener = listener;
    }

    @Override
    public GalleryViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.gallery_list_item, parent, false);
        return new GalleryViewHolder(itemView, mContext);
    }

    @Override
    public void onBindViewHolder(GalleryViewHolder holder, int position) {
        holder.bind(carModelList.get(position), listener);
    }

    @Override
    public int getItemCount() {
        return carModelList.size();
    }
}