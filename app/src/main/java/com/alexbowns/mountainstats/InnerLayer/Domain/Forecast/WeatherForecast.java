package com.alexbowns.mountainstats.InnerLayer.Domain.Forecast;

import com.alexbowns.mountainstats.InnerLayer.Domain.MountainName;

import java.util.Date;

public class WeatherForecast
{
    public Date date;
    public MountainName mountainName;
    public int highTemp;
    public int lowTemp;
    public int precipitation;

    public WeatherForecast(Date date, MountainName mountainName, int highTemp, int lowTemp, int precipitation)
    {

    }
}
