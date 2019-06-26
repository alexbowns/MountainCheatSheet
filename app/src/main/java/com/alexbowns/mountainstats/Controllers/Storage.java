package com.alexbowns.mountainstats.Controllers;

import com.alexbowns.mountainstats.DataObjects.LogData;
import com.alexbowns.mountainstats.InterfaceAdapters.LogStorage;
import com.alexbowns.mountainstats.Storage.SkiLogDataManager;

import java.util.Date;

public class Storage
{
    private LogStorage logStorage = new SkiLogDataManager();

    public void saveCurrentLog(LogData logData)
    {
        logStorage.saveLogData(logData);
    }

    public LogData[] getLogDataForDate(Date date)
    {
        return logStorage.getLogDataForDate(date);
    }

    public LogData[] getLogDataWithMatchingTitle(String title)
    {
        return logStorage.getLogDataWithMatchingTitle(title);
    }

}
