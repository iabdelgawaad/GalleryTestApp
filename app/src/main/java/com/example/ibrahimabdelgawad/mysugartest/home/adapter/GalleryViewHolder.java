package com.example.ibrahimabdelgawad.shpocktest.home.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.ibrahimabdelgawad.shpocktest.R;
import com.example.ibrahimabdelgawad.shpocktest.home.model.Item;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Ibrahim AbdelGawad on 10/15/2017.
 */

public class GalleryViewHolder extends RecyclerView.ViewHolder {

    private Context context;
    @Bind(R.id.address)
    TextView title;
    @Bind(R.id.name)
    TextView address;

    GalleryViewHolder(View view, Context context) {
        super(view);
        ButterKnife.bind(this, view);
        this.context = context;
    }

    public void bind(final Item item, final GalleryAdapter.OnItemClickListener listener) {
        title.setText(item.getTitle());
        address.setText(item.getPrice());
    }
}
