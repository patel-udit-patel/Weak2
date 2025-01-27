package com.vehicle_rental_system;

// Abstract class Vehicle
abstract class Vehicle implements Insurable {
    private String vehicleNumber;
    private String type;
    protected double rentalRate;
    private String insurancePolicyNumber; // Encapsulated field

    public Vehicle(String vehicleNumber, String type, double rentalRate, String insurancePolicyNumber) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    public abstract double calculateRentalCost(int days);

    @Override
    public double calculateInsurance() {
        return rentalRate * 0.1; // Example insurance cost calculation
    }

    @Override
    public String getInsuranceDetails() {
        return "Insurance Policy: Confidential";
    }

    public String getVehicleDetails() {
        return "Vehicle Number: " + vehicleNumber + ", Type: " + type;
    }
}