package com.nahal.sukhjinder.the_real_mvp.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.nahal.sukhjinder.the_real_mvp.R;
import com.nahal.sukhjinder.the_real_mvp.model.City;

import java.util.List;

/**
 * Created by Sukhjinder on 3/4/18.
 */

public class CityRecyclerAdapter extends RecyclerView.Adapter<CityRecyclerAdapter.CityViewHolder> {

    private List<City> cities;
    private OnUserClickListener onUserClickListener;

    public CityRecyclerAdapter(List<City> cities, OnUserClickListener onUserClickListener) {
        this.cities = cities;
        this.onUserClickListener = onUserClickListener;
    }

    @Override
    public CityViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.city, parent, false);
        return new CityViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CityViewHolder holder, int position) {
        holder.bind(position);
    }

    @Override
    public int getItemCount() {
        return cities.size();
    }


    public class CityViewHolder extends RecyclerView.ViewHolder {

        private TextView labelTextView;
        private ImageView cityImage;

        public CityViewHolder(View itemView) {
            super(itemView);
            labelTextView = itemView.findViewById(R.id.city_label);
            cityImage = itemView.findViewById(R.id.city_image);
        }

        public void bind(final int position) {
            labelTextView.setText(cities.get(position).getCityName());
            cityImage.setImageResource(cities.get(position).getCityImage());
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (onUserClickListener != null) {
                        onUserClickListener.onUserClicked(cities.get(position));
                    }
                }
            });

        }

    }

    public interface OnUserClickListener {
        void onUserClicked(City city);
    }
}