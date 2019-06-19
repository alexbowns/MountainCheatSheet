package com.alexbowns.mountainstats.Domain;

import com.alexbowns.mountainstats.DataObjects.LogData;
import com.alexbowns.mountainstats.DataObjects.LogImage;
import com.alexbowns.mountainstats.DataObjects.LogLocation;
import com.alexbowns.mountainstats.InterfaceAdapters.LogInput;

import java.util.Date;

public class SkiLogInput implements LogInput
{
    private LogData currentLogData;

    public SkiLogInput()
    {
        currentLogData = new LogData();
    }

    @Override
    public void setDetails(String details)
    {
        currentLogData.details = details;
    }

    @Override
    public void setTitle(String title)
    {
        currentLogData.title = title;
    }

    @Override
    public void setImage(LogImage image)
    {
        currentLogData.logImage = image;
    }

    @Override
    public void setLocation(LogLocation location)
    {
        currentLogData.logLocation = location;
    }

    @Override
    public void setDate(Date date)
    {
        currentLogData.date = date;
    }

    @Override
    public LogData getCurrentLogData()
    {
        return currentLogData;
    }
}
