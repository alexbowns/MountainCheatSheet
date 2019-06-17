package com.alexbowns.mountainstats.InterfaceAdapters;

import com.alexbowns.mountainstats.DataObjects.LogData;

import java.util.Date;

public interface LogStorage
{
    LogData[] getLogDataForDate(Date date);
    LogData[] getLogDataWithMatchingTitle(String title);
    void saveLogData(LogData logData);
}
