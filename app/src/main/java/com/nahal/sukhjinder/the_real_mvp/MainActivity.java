package com.nahal.sukhjinder.the_real_mvp;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {


    CityListPresenter cityListPresenter;
    static Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cityListPresenter = new CityListPresenter();
        cityListPresenter.loadCities();

        initRecyclerView();
        context = getApplicationContext();
    }

    private void initRecyclerView() {
        RecyclerView recyclerView = findViewById(R.id.image_recycler_view);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        CityRecyclerAdapter cityRecyclerAdapter = new CityRecyclerAdapter(cityListPresenter);
        recyclerView.setAdapter(cityRecyclerAdapter);
    }

}
