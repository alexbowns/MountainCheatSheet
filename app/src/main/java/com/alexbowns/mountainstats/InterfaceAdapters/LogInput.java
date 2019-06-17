package com.alexbowns.mountainstats.InterfaceAdapters;

import android.media.Image;

import com.alexbowns.mountainstats.DataObjects.LogData;

import java.util.Date;

public interface LogInput
{
    void setDetails(String details);
    void setTitle(String title);
    void setImage(Image image);
    void setLocation(String location);
    void setDate(Date date);
    LogData getCurrentLogData();
}
