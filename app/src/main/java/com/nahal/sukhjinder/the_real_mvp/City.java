package com.nahal.sukhjinder.the_real_mvp;

/**
 * Created by Sukhjinder on 3/4/18.
 */

public class City {

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
}
