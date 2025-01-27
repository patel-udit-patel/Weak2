package com.ride_hailing_application;

// Subclass representing an Auto
class Auto extends Vehicle implements GPS {
    private String location;

    public Auto(String vehicleId, String driverName, double ratePerKm, String location) {
        super(vehicleId, driverName, ratePerKm);
        this.location = location;
    }

    @Override
    public double calculateFare(double distance) {
        return ratePerKm * distance * 1.1; // Autos have a small surcharge
    }

    @Override
    public void getCurrentLocation() {
        System.out.println("Auto Location: " + location);
    }

    @Override
    public void updateLocation(String newLocation) {
        location = newLocation;
        System.out.println("Auto location updated to: " + location);
    }
}
