package com.nahal.sukhjinder.travel_guide.contract;

import com.nahal.sukhjinder.travel_guide.model.City;
import com.nahal.sukhjinder.travel_guide.model.Restaurant;
import com.nahal.sukhjinder.travel_guide.model.Site;
import com.nahal.sukhjinder.travel_guide.model.Weather;

/**
 * Created by Sukhjinder on 3/5/18.
 */

public interface DetailActivityContract {

    interface View {

        void displayCityDetails(City city);

        void displayCityWeather(Weather weather);

        void displayCitySite(Site site);

        void displayRestaurant(Restaurant restaurant);
    }

}
