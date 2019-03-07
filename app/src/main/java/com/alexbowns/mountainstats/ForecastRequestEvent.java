package com.alexbowns.mountainstats;

public interface ForecastRequestEvent
{
    void requestComplete(Forecast forecast);
}
