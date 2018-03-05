package com.nahal.sukhjinder.the_real_mvp;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Sukhjinder on 3/4/18.
 */


public class CityViewHolder extends RecyclerView.ViewHolder implements CityRowView {

    private TextView labelTextView;
    private ImageView cityImage;

    public CityViewHolder(View itemView) {
        super(itemView);
        labelTextView = itemView.findViewById(R.id.city_label);
        cityImage = itemView.findViewById(R.id.city_image);
    }

    @Override
    public void setLabel(String title) {
        labelTextView.setText(title);
    }

    @Override
    public void setImage(int image) {
        cityImage.setImageResource(image);
    }
}