package com.alexbowns.mountainstats.Forecast;

import com.alexbowns.mountainstats.Forecast.Forecast;

public interface ForecastRequestEvent
{
    void requestComplete(Forecast forecast);
}
