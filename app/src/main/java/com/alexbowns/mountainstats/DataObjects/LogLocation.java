package com.alexbowns.mountainstats.DataObjects;

public class LogLocation
{
    public String name = "";

    public LogLocation(String name)
    {
        if (name != null)
            this.name = name;
    }

    public boolean equals(LogLocation object)
    {
        if (this.name == object.name)
            return true;
        else
            return false;
    }
}
