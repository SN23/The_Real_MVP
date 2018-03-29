package com.nahal.sukhjinder.the_real_mvp.view;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;

import com.nahal.sukhjinder.the_real_mvp.contract.MainActivityContract;
import com.nahal.sukhjinder.the_real_mvp.presenter.MainPresenter;
import com.nahal.sukhjinder.the_real_mvp.adapters.CityRecyclerAdapter;
import com.nahal.sukhjinder.the_real_mvp.R;
import com.nahal.sukhjinder.the_real_mvp.databinding.ActivityMainBinding;
import com.nahal.sukhjinder.the_real_mvp.model.City;

import java.util.List;

/**
 * Displays the main screen which consists of list of cities
 */
public class MainActivity extends AppCompatActivity implements MainActivityContract.View, CityRecyclerAdapter.OnUserClickListener {


    private MainPresenter mainPresenter;
    private ActivityMainBinding binding;
    private CityRecyclerAdapter cityRecyclerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        mainPresenter = new MainPresenter(this);
        initRecyclerView(mainPresenter.loadCities());
    }

    public void initRecyclerView(List<City> cities) {
        binding.imageRecyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        cityRecyclerAdapter = new CityRecyclerAdapter(cities, this);
        binding.imageRecyclerView.setAdapter(cityRecyclerAdapter);
    }

    public void onUserClicked(City city) {
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra("City", city);
        startActivity(intent);
    }
}