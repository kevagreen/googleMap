package com.tts.mapsapp.service;

import com.tts.mapsapp.model.Location;
import org.springframework.stereotype.Service;


public interface MapService {

    void addCoordinates(Location location);
}
