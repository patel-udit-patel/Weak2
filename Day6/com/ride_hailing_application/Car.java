package com.ride_hailing_application;

// Subclass representing a Car
class Car extends Vehicle implements GPS {
    private String location;

    public Car(String vehicleId, String driverName, double ratePerKm, String location) {
        super(vehicleId, driverName, ratePerKm);
        this.location = location;
    }

    @Override
    public double calculateFare(double distance) {
        return ratePerKm * distance;
    }

    @Override
    public void getCurrentLocation() {
        System.out.println("Car Location: " + location);
    }

    @Override
    public void updateLocation(String newLocation) {
        location = newLocation;
        System.out.println("Car location updated to: " + location);
    }
}