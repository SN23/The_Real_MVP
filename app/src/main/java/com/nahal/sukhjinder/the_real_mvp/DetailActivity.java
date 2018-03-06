package com.nahal.sukhjinder.the_real_mvp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Sukhjinder on 3/5/18.
 */

public class DetailActivity extends AppCompatActivity implements DetailView {

    private Intent intent;

    private City city;

    private TextView cityNameTextView;
    private TextView cityDescriptionTextView;
    private ImageView cityImage;

    private ImageView weatherIcon;
    private TextView weatherDescriptionTextView;
    private TextView temperatureTextView;
    private TextView humidityTextView;
    private TextView windTextView;

    private ImageView siteIcon;
    private TextView siteNameTextView;
    private TextView siteDescriptionTextView;

    private ImageView restaurantIcon;
    private TextView restaurantDescriptionTextView;
    private TextView restaurantNameTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.city_detail);

        intent = getIntent();
        city = intent.getParcelableExtra("City");
        Weather weather = city.getWeather();
        Site site = city.getSite();
        Restaurant restaurant = city.getRestaurant();


//        cityImage = findViewById(R.id.city_detail_image);
//        cityImage.setImageResource(R.drawable.new_york_city);


        displayCityDetails(city);
        displayCityWeather(weather);
        displayCitySite(site);
        displayRestaurant(restaurant);
    }


    @Override
    public void displayCityDetails(City city) {

        cityImage = (ImageView) findViewById(R.id.city_detail_image);
        cityImage.setImageResource(city.getCityImage());

        cityNameTextView = (TextView) findViewById(R.id.city_name);
        cityNameTextView.setText(city.getCityName());

        cityDescriptionTextView = findViewById(R.id.city_description);
        cityDescriptionTextView.setText(city.getDescription());
    }

    @Override
    public void displayCityWeather(Weather weather) {

        weatherIcon = findViewById(R.id.weather_icon);
        weatherIcon.setImageResource(weather.getWeatherIcon());

        weatherDescriptionTextView = findViewById(R.id.weather_description);
        weatherDescriptionTextView.setText(weather.getDescription());

        temperatureTextView = findViewById(R.id.temperature);
        temperatureTextView.setText(weather.getTemperature());

        humidityTextView = findViewById(R.id.humidity);
        humidityTextView.setText(weather.getHumidity());

        windTextView = findViewById(R.id.wind);
        windTextView.setText(weather.getWindSpeed());
    }

    @Override
    public void displayCitySite(Site site) {

        siteIcon = findViewById(R.id.site_image);
        siteIcon.setImageResource(site.getSiteImage());

        siteNameTextView = findViewById(R.id.site_name);
        siteNameTextView.setText(site.getSiteName());

        siteDescriptionTextView = findViewById(R.id.site_description);
        siteDescriptionTextView.setText(site.getSiteDescription());

    }

    @Override
    public void displayRestaurant(Restaurant restaurant) {

        restaurantIcon = findViewById(R.id.restaurantImage);
        restaurantIcon.setImageResource(restaurant.getRestaurantImage());

        restaurantNameTextView = findViewById(R.id.restaurant_name);
        restaurantNameTextView.setText(restaurant.getRestaurantName());

        restaurantDescriptionTextView = findViewById(R.id.restaurant_description);
        restaurantDescriptionTextView.setText(restaurant.getRestaurantDescription());
    }
}
