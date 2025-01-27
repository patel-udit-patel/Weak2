package com.vehicle_rental_system;

// Subclass Bike
class Bike extends Vehicle {
    public Bike(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Bike", rentalRate, insurancePolicyNumber);
    }

    @Override
    public double calculateRentalCost(int days) {
        return rentalRate * days * 0.9; // 10% discount for bikes
    }
}
