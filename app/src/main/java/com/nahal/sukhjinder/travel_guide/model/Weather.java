package com.nahal.sukhjinder.travel_guide.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Sukhjinder on 3/5/18.
 */

public class Weather implements Parcelable {

    private String temperature;
    private String humidity;
    private String description;
    private String windSpeed;

    public Weather(String temperature, String humidity, String description, String windSpeed, int weatherIcon) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.description = description;
        this.windSpeed = windSpeed;
        this.weatherIcon = weatherIcon;
    }

    public String getTemperature() {

        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(String windSpeed) {
        this.windSpeed = windSpeed;
    }

    public int getWeatherIcon() {
        return weatherIcon;
    }

    public void setWeatherIcon(int weatherIcon) {
        this.weatherIcon = weatherIcon;
    }

    private int weatherIcon;

    protected Weather(Parcel in) {
        temperature = in.readString();
        humidity = in.readString();
        description = in.readString();
        windSpeed = in.readString();
        weatherIcon = in.readInt();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(temperature);
        dest.writeString(humidity);
        dest.writeString(description);
        dest.writeString(windSpeed);
        dest.writeInt(weatherIcon);
    }

    @SuppressWarnings("unused")
    public static final Parcelable.Creator<Weather> CREATOR = new Parcelable.Creator<Weather>() {
        @Override
        public Weather createFromParcel(Parcel in) {
            return new Weather(in);
        }

        @Override
        public Weather[] newArray(int size) {
            return new Weather[size];
        }
    };
}