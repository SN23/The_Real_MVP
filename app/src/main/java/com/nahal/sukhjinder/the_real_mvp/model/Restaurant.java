package com.nahal.sukhjinder.the_real_mvp.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Sukhjinder on 3/5/18.
 */

public class Restaurant implements Parcelable {
    private String restaurantName;
    private String restaurantDescription;
    private int restaurantImage;

    public Restaurant(String restaurantName, String restaurantDescription, int restaurantImage) {
        this.restaurantName = restaurantName;
        this.restaurantDescription = restaurantDescription;
        this.restaurantImage = restaurantImage;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getRestaurantDescription() {
        return restaurantDescription;
    }

    public void setRestaurantDescription(String restaurantDescription) {
        this.restaurantDescription = restaurantDescription;
    }

    public int getRestaurantImage() {
        return restaurantImage;
    }

    public void setRestaurantImage(int restaurantImage) {
        this.restaurantImage = restaurantImage;
    }

    protected Restaurant(Parcel in) {
        restaurantName = in.readString();
        restaurantDescription = in.readString();
        restaurantImage = in.readInt();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(restaurantName);
        dest.writeString(restaurantDescription);
        dest.writeInt(restaurantImage);
    }

    @SuppressWarnings("unused")
    public static final Parcelable.Creator<Restaurant> CREATOR = new Parcelable.Creator<Restaurant>() {
        @Override
        public Restaurant createFromParcel(Parcel in) {
            return new Restaurant(in);
        }

        @Override
        public Restaurant[] newArray(int size) {
            return new Restaurant[size];
        }
    };
}