package com.alexbowns.mountainstats.DataObjects;

import java.util.Date;

public class LogData
{
    public int id = -1;
    public String details = "";
    public String title = "";
    public LogLocation logLocation = new LogLocation(null);
    public Date date = new Date();
    public LogImage logImage = new LogImage();

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
            return true;
        if (obj == null || obj.getClass() != getClass())
            return false;

        LogData comparedLogData = (LogData)obj;
        return this.id == comparedLogData.id
                && this.details == comparedLogData.details
                && this.date == comparedLogData.date
                && this.title == comparedLogData.title
                && this.logLocation == comparedLogData.logLocation
                && this.logImage == comparedLogData.logImage;
    }
}
