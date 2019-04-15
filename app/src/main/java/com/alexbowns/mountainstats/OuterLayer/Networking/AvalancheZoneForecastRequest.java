package com.alexbowns.mountainstats.OuterLayer.Networking;

import com.alexbowns.mountainstats.InnerLayer.Domain.AvalancheForecast.AvalancheZoneForecast;

import retrofit2.Callback;
import retrofit2.http.GET;
import retrofit2.http.Query;

public class AvalancheZoneForecastRequest
{
    @GET("/api/user")
    void getZoneForecast(@Query("user_id") int userId, Callback<AvalancheZoneForecast> callback)
    {

    }
}
