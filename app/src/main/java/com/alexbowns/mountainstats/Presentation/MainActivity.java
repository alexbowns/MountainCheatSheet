package com.alexbowns.mountainstats.Presentation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.alexbowns.mountainstats.R;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void switchActivity()
    {
        Intent intent = new Intent(this, LogActivity.class);
        startActivity(intent);
    }
}
