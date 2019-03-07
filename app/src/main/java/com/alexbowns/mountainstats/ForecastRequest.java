package com.alexbowns.mountainstats;

public class ForecastRequest
{
    private ForecastRequestEvent forecastRequestEvent;

    public ForecastRequest(ForecastRequestEvent event)
    {
        forecastRequestEvent = event;
    }

    public void requestTodaysForecast(MountainName mountainName)
    {
        
    }

    public void requestExtendedForecast(MountainName mountainName)
    {

    }
    //https://www.ncdc.noaa.gov/cdo-web/webservices/v2
}
