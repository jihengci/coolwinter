package com.coolwinter.android.gson;

import android.net.NetworkInfo;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by 恒慈 on 2017/12/24.
 */

public class Weater {
    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;
    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
