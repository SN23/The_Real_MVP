package com.nahal.sukhjinder.the_real_mvp.interfaces;

import com.nahal.sukhjinder.the_real_mvp.model.City;
import com.nahal.sukhjinder.the_real_mvp.model.Restaurant;
import com.nahal.sukhjinder.the_real_mvp.model.Site;
import com.nahal.sukhjinder.the_real_mvp.model.Weather;

/**
 * Created by Sukhjinder on 3/5/18.
 */

public interface DetailView {

    void displayCityDetails(City city);

    void displayCityWeather(Weather weather);

    void displayCitySite(Site site);

    void displayRestaurant(Restaurant restaurant);

}
