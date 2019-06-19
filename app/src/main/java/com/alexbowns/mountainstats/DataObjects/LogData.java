package com.alexbowns.mountainstats.DataObjects;

import java.util.Date;

public class LogData
{
    public String details = "";
    public String title = "";
    public LogLocation logLocation = new LogLocation(null);
    public Date date = new Date();
    public LogImage logImage = new LogImage();
}
