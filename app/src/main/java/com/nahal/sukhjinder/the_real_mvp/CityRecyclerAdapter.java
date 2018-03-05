package com.nahal.sukhjinder.the_real_mvp;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

/**
 * Created by Sukhjinder on 3/4/18.
 */

public class CityRecyclerAdapter extends RecyclerView.Adapter<CityViewHolder> {

    private final CityListPresenter presenter;


    public CityRecyclerAdapter(CityListPresenter repositoriesPresenter) {
        this.presenter = repositoriesPresenter;
    }

    @Override
    public CityViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new CityViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.city, parent, false), presenter);
    }

    @Override
    public void onBindViewHolder(CityViewHolder holder, int position) {
        presenter.onBindCityRowViewAtPosition(position, holder);
    }

    @Override
    public int getItemCount() {
        return presenter.getCitiesRowsCount();
    }

}


