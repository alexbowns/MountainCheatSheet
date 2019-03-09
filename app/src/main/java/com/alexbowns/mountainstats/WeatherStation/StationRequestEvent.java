package com.alexbowns.mountainstats.WeatherStation;

public interface StationRequestEvent {
    void onDataReceived(WeatherStationRequest request);
}
