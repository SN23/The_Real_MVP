package com.nahal.sukhjinder.the_real_mvp.activities;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.nahal.sukhjinder.the_real_mvp.interfaces.DetailView;
import com.nahal.sukhjinder.the_real_mvp.R;
import com.nahal.sukhjinder.the_real_mvp.databinding.CityDetailBinding;
import com.nahal.sukhjinder.the_real_mvp.model.City;
import com.nahal.sukhjinder.the_real_mvp.model.Restaurant;
import com.nahal.sukhjinder.the_real_mvp.model.Site;
import com.nahal.sukhjinder.the_real_mvp.model.Weather;

/**
 * Created by Sukhjinder on 3/5/18.
 */

public class DetailActivity extends AppCompatActivity implements DetailView {

    private Intent intent;
    private City city;
    private CityDetailBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.city_detail);

        intent = getIntent();
        city = intent.getParcelableExtra("City");
        Weather weather = city.getWeather();
        Site site = city.getSite();
        Restaurant restaurant = city.getRestaurant();

        displayCityDetails(city);
        displayCityWeather(weather);
        displayCitySite(site);
        displayRestaurant(restaurant);
    }


    @Override
    public void displayCityDetails(City city) {

        binding.cityDetailImage.setImageResource(city.getCityImage());
        binding.cityName.setText(city.getCityName());
        binding.cityDescription.setText(city.getDescription());
    }

    @Override
    public void displayCityWeather(Weather weather) {

        binding.weatherInfo.weatherIcon.setImageResource(weather.getWeatherIcon());
        binding.weatherInfo.weatherDescription.setText(weather.getDescription());
        binding.weatherInfo.temperature.setText(weather.getTemperature());
        binding.weatherInfo.humidity.setText(weather.getHumidity());
        binding.weatherInfo.wind.setText(weather.getWindSpeed());
    }

    @Override
    public void displayCitySite(Site site) {

        binding.site.siteImage.setImageResource(site.getSiteImage());
        binding.site.siteName.setText(site.getSiteName());
        binding.site.siteDescription.setText(site.getSiteDescription());

    }

    @Override
    public void displayRestaurant(Restaurant restaurant) {

        binding.restaurant.restaurantImage.setImageResource(restaurant.getRestaurantImage());
        binding.restaurant.restaurantName.setText(restaurant.getRestaurantName());
        binding.restaurant.restaurantDescription.setText(restaurant.getRestaurantDescription());
    }
}
