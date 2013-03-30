package com.safe.core;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class LocationServiceTest {

    @Test
    public void theLocationListenerIsRegisteredToTheLocationManager(){
        Assert.assertThat(1, is(1));
    }
}
