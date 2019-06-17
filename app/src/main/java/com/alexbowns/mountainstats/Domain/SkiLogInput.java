package com.alexbowns.mountainstats.Domain;

import android.media.Image;

import com.alexbowns.mountainstats.DataObjects.LogData;
import com.alexbowns.mountainstats.InterfaceAdapters.LogInput;

import java.util.Date;

public class SkiLogInput implements LogInput
{
    @Override
    public void setDetails(String details) {

    }

    @Override
    public void setTitle(String title) {

    }

    @Override
    public void setImage(Image image) {

    }

    @Override
    public void setLocation(String location) {

    }

    @Override
    public void setDate(Date date) {

    }

    @Override
    public LogData getCurrentLogData()
    {
        return null;
    }
}
