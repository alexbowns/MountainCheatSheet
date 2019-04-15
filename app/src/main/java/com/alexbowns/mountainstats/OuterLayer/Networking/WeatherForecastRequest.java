package com.alexbowns.mountainstats.OuterLayer.Networking;

import com.alexbowns.mountainstats.InnerLayer.Domain.Forecast.WeatherForecast;
import com.alexbowns.mountainstats.InnerLayer.Domain.MountainName;

import retrofit2.Callback;
import retrofit2.http.GET;
import retrofit2.http.Query;

public class WeatherForecastRequest
{
    // asynchronously with a callback
    @GET("/api/user")
    public void getWeatherForecast(@Query("user_id") MountainName location, Callback<WeatherForecast> callback)
    {

    }
}
