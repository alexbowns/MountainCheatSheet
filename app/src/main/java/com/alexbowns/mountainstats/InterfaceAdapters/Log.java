package com.alexbowns.mountainstats.InterfaceAdapters;

import android.media.Image;

public interface Log {
    void setDescription(String description);
    void setTitle(String title);
    void setImage(Image image);
    void setLocation(String location);
    void save();
}
