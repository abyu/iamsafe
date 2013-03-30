package com.safe.core;

import android.location.LocationManager;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.mockito.Mockito.verify;
import static org.mockito.MockitoAnnotations.initMocks;

public class LocationServiceTest {

    @Mock
    private LocationManager locationManager;

    @Mock
    private UserLocationListener locationListener;

    @Before
    public void beforeTest(){
        initMocks(this);
    }

    @Test
    public void theLocationListenerIsRegisteredToTheLocationManagerWithGPSProvider(){

        LocationService locationService = new LocationService(locationManager);
        locationService.registerListener(locationListener);

        verify(locationManager).requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 0, locationListener);
    }


}
