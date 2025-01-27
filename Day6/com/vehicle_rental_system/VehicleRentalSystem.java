package com.vehicle_rental_system;

import java.util.ArrayList;
import java.util.List;

// Main class to demonstrate polymorphism
public class VehicleRentalSystem {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("MH12AB1234", 500, "CAR123"));
        vehicles.add(new Bike("MP09XY5678", 200, "BIKE456"));
        vehicles.add(new Truck("GJ01LM7890", 1000, "TRUCK789"));

        int rentalDays = 5;
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getVehicleDetails());
            System.out.println("Rental Cost for " + rentalDays + " days: Rs." + vehicle.calculateRentalCost(rentalDays));
            System.out.println("Insurance Cost: Rs." + vehicle.calculateInsurance());
            System.out.println(vehicle.getInsuranceDetails());
            System.out.println("-----------------------------------");
        }
    }
}

