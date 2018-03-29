package com.nahal.sukhjinder.travel_guide.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Sukhjinder on 3/4/18.
 */

public class City implements Parcelable {

    private String cityName;
    private int cityImage;
    private String description;
    private Site site;
    private Weather weather;
    private Restaurant restaurant;

    public City(String cityName, int cityImage, String description, Site site, Weather weather, Restaurant restaurant) {
        this.cityName = cityName;
        this.cityImage = cityImage;
        this.description = description;
        this.site = site;
        this.weather = weather;
        this.restaurant = restaurant;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityImage() {
        return cityImage;
    }

    public void setCityImage(int cityImage) {
        this.cityImage = cityImage;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Site getSite() {
        return site;
    }

    public void setSite(Site site) {
        this.site = site;
    }

    public Weather getWeather() {
        return weather;
    }

    public void setWeather(Weather weather) {
        this.weather = weather;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    protected City(Parcel in) {
        cityName = in.readString();
        cityImage = in.readInt();
        description = in.readString();
        site = (Site) in.readValue(Site.class.getClassLoader());
        weather = (Weather) in.readValue(Weather.class.getClassLoader());
        restaurant = (Restaurant) in.readValue(Restaurant.class.getClassLoader());
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(cityName);
        dest.writeInt(cityImage);
        dest.writeString(description);
        dest.writeValue(site);
        dest.writeValue(weather);
        dest.writeValue(restaurant);
    }

    @SuppressWarnings("unused")
    public static final Parcelable.Creator<City> CREATOR = new Parcelable.Creator<City>() {
        @Override
        public City createFromParcel(Parcel in) {
            return new City(in);
        }

        @Override
        public City[] newArray(int size) {
            return new City[size];
        }
    };
}