package com.alexbowns.mountainstats.Presentation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.alexbowns.mountainstats.DataObjects.LogData;
import com.alexbowns.mountainstats.InterfaceAdapters.LogEvent;
import com.alexbowns.mountainstats.R;

public class LogActivity extends AppCompatActivity implements LogEvent
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log);
    }

    @Override
    public void logSaved(LogData logData)
    {

    }

    @Override
    public void logDeleted(LogData logData)
    {

    }
}
