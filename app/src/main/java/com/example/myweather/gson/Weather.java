package com.example.myweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Weather {
    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;
    @SerializedName("suggestion")
    public suggestion Suggestion;
    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
    
}
