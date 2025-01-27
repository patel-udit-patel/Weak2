package com.ride_hailing_application;

// Interface for GPS functionality
interface GPS {
    void getCurrentLocation();
    void updateLocation(String newLocation);
}
