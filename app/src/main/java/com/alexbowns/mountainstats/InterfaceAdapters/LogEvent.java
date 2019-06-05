package com.alexbowns.mountainstats.InterfaceAdapters;

public interface LogEvent {
    void logSaved(Log log);
    void logDeleted(Log log);
}
