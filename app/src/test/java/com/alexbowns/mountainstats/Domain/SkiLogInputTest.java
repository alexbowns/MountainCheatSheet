package com.alexbowns.mountainstats.Domain;

import com.alexbowns.mountainstats.DataObjects.LogData;
import com.alexbowns.mountainstats.DataObjects.LogImage;
import com.alexbowns.mountainstats.DataObjects.LogLocation;

import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class SkiLogInputTest
{

    SkiLogInput skiLogInput;

    @Before
    public void setUp() throws Exception
    {
        skiLogInput = new SkiLogInput();
    }

    @Test
    public void setDetails()
    {
        skiLogInput.setDetails("this is a small sentence");
        assertEquals("this is a small sentence", skiLogInput.getCurrentLogData().details);
    }

    @Test
    public void setDetails_Edit()
    {
        skiLogInput.setDetails("this is a small sentence");
        skiLogInput.setDetails("this is an edited sentence");
        assertEquals("this is an edited sentence", skiLogInput.getCurrentLogData().details);
    }

    @Test
    public void setDetails_NeverSet()
    {
        assertEquals("", skiLogInput.getCurrentLogData().details);
    }

    @Test
    public void setTitle()
    {
        skiLogInput.setTitle("title mc title");
        assertEquals("title mc title", skiLogInput.getCurrentLogData().title);
    }

    @Test
    public void setTitle_Edit()
    {
        skiLogInput.setTitle("title mc title");
        skiLogInput.setTitle("Dr professor title mc title");
        assertEquals("Dr professor title mc title", skiLogInput.getCurrentLogData().title);
    }

    @Test
    public void setTitle_NeverSet()
    {
        assertEquals("", skiLogInput.getCurrentLogData().title);
    }

    @Test
    public void setImage()
    {
        LogImage image = new LogImage();
        skiLogInput.setImage(image);
        assertNotNull(skiLogInput.getCurrentLogData().logImage);
    }

    @Test
    public void setImage_NeverSet()
    {
        assertNotNull(skiLogInput.getCurrentLogData().logImage);
    }

    @Test
    public void setLocation()
    {
        LogLocation location = new LogLocation("Some Location Name");
        skiLogInput.setLocation(location);
        assertTrue(skiLogInput.getCurrentLogData().logLocation.equals(new LogLocation("Some Location Name")));
    }

    @Test
    public void setLocation_Edit()
    {
        LogLocation location = new LogLocation("Some Location Name");
        skiLogInput.setLocation(location);
        location.name = "A new name";
        skiLogInput.setLocation(location);
        assertTrue(skiLogInput.getCurrentLogData().logLocation.equals(new LogLocation("A new name")));
    }

    @Test
    public void setLocation_NeverSet()
    {
        assertTrue(skiLogInput.getCurrentLogData().logLocation.equals(new LogLocation(null)));
    }

    @Test
    public void setDate()
    {
        Date date = new Date(1560959335);
        skiLogInput.setDate(date);
        assertEquals(date, skiLogInput.getCurrentLogData().date);
    }

    @Test
    public void setDate_NeverSet()
    {
        assertNotNull(skiLogInput.getCurrentLogData().date);
    }

    @Test
    public void getCurrentLogData()
    {
        String testDetails = "Dear diary, today I went skiing! It was pow pow.";
        String testTitle = "Blower pow ahead!";
        LogImage testImage = new LogImage();
        Date testDate = new Date(1560959335);
        LogLocation testLocation = new LogLocation("Crystal Mountain");
        skiLogInput.setDetails(testDetails);
        skiLogInput.setTitle(testTitle);
        skiLogInput.setImage(testImage);
        skiLogInput.setDate(testDate);
        skiLogInput.setLocation(testLocation);
        LogData currentLogData = skiLogInput.getCurrentLogData();
        assertEquals(testDetails, currentLogData.details);
        assertEquals(testTitle, currentLogData.title);
        assertEquals(testDate, currentLogData.date);
        assertEquals(testImage, currentLogData.logImage);
        assertEquals(testLocation, currentLogData.logLocation);
    }

    @Test
    public void getCurrentLogData_FieldsNotSet_NoNullFields()
    {
        LogData currentLogData = skiLogInput.getCurrentLogData();
        assertNotNull(currentLogData.details);
        assertNotNull(currentLogData.title);
        assertNotNull(currentLogData.logImage);
        assertNotNull(currentLogData.date);
        assertNotNull(currentLogData.logLocation);
    }
}