package com.nahal.sukhjinder.the_real_mvp;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sukhjinder on 3/4/18.
 */

public class CityListPresenter {

    private List<City> cities = new ArrayList<>();


    public void loadCities() {
        City newYorkCity = new City("New York City", R.drawable.new_york_city);
        City boston = new City("Boston", R.drawable.boston);
        City chicago = new City("Chicago", R.drawable.chicago);
        City miami = new City("Miami", R.drawable.miami);
        City dallas = new City("Dallas", R.drawable.dallas);
        City honolulu = new City("Honolulu", R.drawable.honolulu);
        City lasVegas = new City("Las Vegas", R.drawable.las_vegas);
        City losAngeles = new City("Los Angeles", R.drawable.los_angeles);
        City seattle = new City("Seattle", R.drawable.seattle);
        City washington_dc = new City("Washington D.C.", R.drawable.washington_dc);

        cities.add(newYorkCity);
        cities.add(boston);
        cities.add(chicago);
        cities.add(miami);
        cities.add(dallas);
        cities.add(honolulu);
        cities.add(lasVegas);
        cities.add(losAngeles);
        cities.add(seattle);
        cities.add(washington_dc);
    }

    public void onBindCityRowViewAtPosition(int position, CityRowView rowView) {
        City city = cities.get(position);
        rowView.setImage(city.getCityImage());
        rowView.setLabel(city.getCityName());
    }

    public int getCitiesRowsCount() {
        return cities.size();
    }


    public void onItemInteraction(int position) {
        Log.d("City", cities.get(position).getCityName());
//        Intent intent = new Intent(this, MainActivity.class);
//        intent.putExtra("City", cities.get(position));
    }
}
