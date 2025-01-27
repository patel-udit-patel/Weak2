package com.ride_hailing_application;

// Main class to test the Ride-Hailing Application
public class RideHailingSystem {
    public static void processRide(Vehicle vehicle, double distance) {
        vehicle.getVehicleDetails();
        System.out.println("Total Fare: " + vehicle.calculateFare(distance) + "\n");
    }

    public static void main(String[] args) {
        Vehicle car = new Car("C101", "John Doe", 10, "Downtown");
        Vehicle bike = new Bike("B202", "Jane Smith", 5, "Uptown");
        Vehicle auto = new Auto("A303", "Alice Brown", 7, "Suburb");

        processRide(car, 15);
        processRide(bike, 10);
        processRide(auto, 12);

        // GPS functionality
        GPS gpsCar = new Car("C404", "Bob White", 12, "Central Park");
        gpsCar.getCurrentLocation();
        gpsCar.updateLocation("Airport");
    }
}