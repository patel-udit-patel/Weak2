package Day5.hybrid_inheritance.vehicle_management_system;

// Subclass ElectricVehicle inheriting from Vehicle
class ElectricVehicle extends Vehicle {
    public ElectricVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);
    }

    public void charge() {
        System.out.println(model + " is charging its battery.");
    }
}
