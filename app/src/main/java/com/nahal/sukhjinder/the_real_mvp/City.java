package com.nahal.sukhjinder.the_real_mvp;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Sukhjinder on 3/4/18.
 */

public class City implements Parcelable {

    private String cityName;
    private String funFact;
    private String sites;
    private int cityImage;

    public City(String cityName, int cityImage) {
        this.cityName = cityName;
        this.cityImage = cityImage;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getFunFact() {
        return funFact;
    }

    public void setFunFact(String funFact) {
        this.funFact = funFact;
    }

    public String getSites() {
        return sites;
    }

    public void setSites(String sites) {
        this.sites = sites;
    }

    public int getCityImage() {
        return cityImage;
    }

    public void setCityImage(int cityImage) {
        this.cityImage = cityImage;
    }

    protected City(Parcel in) {
        cityName = in.readString();
        funFact = in.readString();
        sites = in.readString();
        cityImage = in.readInt();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(cityName);
        dest.writeString(funFact);
        dest.writeString(sites);
        dest.writeInt(cityImage);
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