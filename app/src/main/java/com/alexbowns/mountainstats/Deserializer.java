package com.alexbowns.mountainstats;

public interface Deserializer<T> {
    T parsePayload(String payload);
}
