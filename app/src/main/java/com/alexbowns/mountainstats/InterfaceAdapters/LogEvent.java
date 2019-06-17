package com.alexbowns.mountainstats.InterfaceAdapters;

public interface LogEvent {
    void logSaved(LogInput logInput);
    void logDeleted(LogInput logInput);
}
