package com.alexbowns.mountainstats.Storage;

import com.alexbowns.mountainstats.DataObjects.LogData;
import com.alexbowns.mountainstats.InterfaceAdapters.LogStorage;

import java.util.Date;

public class SkiLogStorage implements LogStorage
{
    @Override
    public LogData[] getLogDataForDate(Date date)
    {
        return new LogData[0];
    }

    @Override
    public LogData[] getLogDataWithMatchingTitle(String title)
    {
        return new LogData[0];
    }

    @Override
    public void saveLogData(LogData logData)
    {

    }
}
