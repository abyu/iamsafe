package com.safe.core;

import android.location.Location;
import android.location.LocationManager;

public class LocationService {

    private LocationManager locationManager;

    public LocationService(LocationManager locationManager){

        this.locationManager = locationManager;
    }

    public Location getLocation(){
        return null;
    }
}
