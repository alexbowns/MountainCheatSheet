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
    public void getCurrentLogData_ManuallyUpdateFields()
    {
        LogData expected = mockLogData();
        expected.id = -1; // setting this to the default id for testing purposes since we don't allow skiLogInput to set the id on purpose since that could cause more harm than good for the save logic.
        skiLogInput.setDetails(expected.details);
        skiLogInput.setTitle(expected.title);
        skiLogInput.setImage(expected.logImage);
        skiLogInput.setDate(expected.date);
        skiLogInput.setLocation(expected.logLocation);
        assertEquals(expected, skiLogInput.getCurrentLogData());
    }

    @Test
    public void getCurrentLogData_InitLogInputWithLogData()
    {
        LogData expected = mockLogData();
        skiLogInput = new SkiLogInput(expected);
        assertEquals(expected, skiLogInput.getCurrentLogData());
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

    private LogData mockLogData()
    {
        LogData mockLogData = new LogData();
        mockLogData.id = 2343;
        mockLogData.details = "Dear diary, today I went skiing! It was pow pow.";
        mockLogData.title = "Blower pow ahead!";
        mockLogData.logImage = new LogImage();
        mockLogData.date = new Date(1560959335);
        mockLogData.logLocation = new LogLocation("Crystal Mountain");

        return mockLogData;
    }
}