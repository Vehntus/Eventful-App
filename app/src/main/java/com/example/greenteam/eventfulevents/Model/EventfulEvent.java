package com.example.greenteam.eventfulevents.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by NB on 2016-11-17.
 */

public class EventfulEvent {

    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("city_name")
    @Expose
    private String cityName;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("venue_address")
    @Expose
    private String venueAddress;
    @SerializedName("description")
    @Expose
    private String description;

    public String getUrl() {
        return url;
    }

    public String getCityName() {
        return cityName;
    }

    public String getTitle() {
        return title;
    }

    public String getVenueAddress() {
        return venueAddress;
    }

    public String getDescription() {
        return description;
    }
}