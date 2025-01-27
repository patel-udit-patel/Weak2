package com.ride_hailing_application;


// Subclass representing a Bike
class Bike extends Vehicle implements GPS {
    private String location;

    public Bike(String vehicleId, String driverName, double ratePerKm, String location) {
        super(vehicleId, driverName, ratePerKm);
        this.location = location;
    }

    @Override
    public double calculateFare(double distance) {
        return ratePerKm * distance * 0.9; // Bikes have a discount
    }

    @Override
    public void getCurrentLocation() {
        System.out.println("Bike Location: " + location);
    }

    @Override
    public void updateLocation(String newLocation) {
        location = newLocation;
        System.out.println("Bike location updated to: " + location);
    }
}