package com.vehicle_rental_system;
// Subclass Truck
class Truck extends Vehicle {
    public Truck(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Truck", rentalRate, insurancePolicyNumber);
    }

    @Override
    public double calculateRentalCost(int days) {
        return rentalRate * days * 1.2; // 20% surcharge for trucks
    }
}
