package com.safe.core;

import android.location.LocationListener;
import android.location.LocationManager;

public class LocationService {

    private LocationManager locationManager;

    public LocationService(LocationManager locationManager){

        this.locationManager = locationManager;
    }

    public void registerListener(LocationListener locationListener) {
         locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 0, locationListener);
    }
}
