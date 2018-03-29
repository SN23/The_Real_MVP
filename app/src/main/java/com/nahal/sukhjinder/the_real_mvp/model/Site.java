package com.nahal.sukhjinder.the_real_mvp.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Sukhjinder on 3/5/18.
 */

public class Site implements Parcelable {

    private String siteName;
    private int siteImage;
    private String siteDescription;

    public Site(String siteName, int siteImage, String siteDescription) {
        this.siteName = siteName;
        this.siteImage = siteImage;
        this.siteDescription = siteDescription;
    }

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public int getSiteImage() {
        return siteImage;
    }

    public void setSiteImage(int siteImage) {
        this.siteImage = siteImage;
    }

    public String getSiteDescription() {
        return siteDescription;
    }

    public void setSiteDescription(String siteDescription) {
        this.siteDescription = siteDescription;
    }

    protected Site(Parcel in) {
        siteName = in.readString();
        siteImage = in.readInt();
        siteDescription = in.readString();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(siteName);
        dest.writeInt(siteImage);
        dest.writeString(siteDescription);
    }

    @SuppressWarnings("unused")
    public static final Parcelable.Creator<Site> CREATOR = new Parcelable.Creator<Site>() {
        @Override
        public Site createFromParcel(Parcel in) {
            return new Site(in);
        }

        @Override
        public Site[] newArray(int size) {
            return new Site[size];
        }
    };
}