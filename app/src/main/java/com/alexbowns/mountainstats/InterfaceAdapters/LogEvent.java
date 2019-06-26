package com.alexbowns.mountainstats.InterfaceAdapters;

import com.alexbowns.mountainstats.DataObjects.LogData;

public interface LogEvent {
    void logSaved(LogData logData);
    void logDeleted(LogData logData);
}
