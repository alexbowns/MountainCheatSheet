package com.alexbowns.mountainstats.InterfaceAdapters;

import com.alexbowns.mountainstats.DataObjects.LogData;
import com.alexbowns.mountainstats.DataObjects.LogImage;
import com.alexbowns.mountainstats.DataObjects.LogLocation;

import java.util.Date;

public interface LogInput
{
    void setDetails(String details);
    void setTitle(String title);
    void setImage(LogImage image);
    void setLocation(LogLocation location);
    void setDate(Date date);
    LogData getCurrentLogData();
}
