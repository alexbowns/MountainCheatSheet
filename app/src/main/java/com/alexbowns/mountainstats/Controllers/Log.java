package com.alexbowns.mountainstats.Controllers;

import com.alexbowns.mountainstats.DataObjects.LogData;
import com.alexbowns.mountainstats.DataObjects.LogImage;
import com.alexbowns.mountainstats.DataObjects.LogLocation;
import com.alexbowns.mountainstats.Domain.SkiLogInput;
import com.alexbowns.mountainstats.InterfaceAdapters.LogInput;

import java.util.Date;

public class Log
{
    private LogInput logInput;

    public Log()
    {
        logInput = new SkiLogInput();
    }

    public Log(LogData existingLog)
    {
        if (existingLog == null)
            logInput = new SkiLogInput();
        else
            logInput = parseLogDataToLogInput(existingLog);
    }

    public void setDetails(String details)
    {
        logInput.setDetails(details);
    }

    public void setTitle(String title)
    {
        logInput.setTitle(title);
    }

    public void setImage(LogImage image)
    {
        logInput.setImage(image);
    }

    public void setLocation(LogLocation location)
    {
        logInput.setLocation(location);
    }

    public void setDate(Date date)
    {
        logInput.setDate(date);
    }

    public LogData getLogData()
    {
        return logInput.getCurrentLogData();
    }

    private void initializeNewInstances()
    {
        logInput = new SkiLogInput();
    }

    private void initializeWithExistingLogData(LogData logData)
    {
        logInput = parseLogDataToLogInput(logData);
    }

    private LogInput parseLogDataToLogInput(LogData logData)
    {
        return new SkiLogInput(logData);
    }

}
