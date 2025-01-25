package Day5.hybrid_inheritance.vehicle_management_system;

// Main class to test the implementation
public class VehicleManagement {
    public static void main(String[] args) {
        ElectricVehicle ev = new ElectricVehicle("Tesla Model S", 250);
        PetrolVehicle pv = new PetrolVehicle("Ford Mustang", 240);

        ev.displayInfo();
        ev.charge();

        System.out.println();

        pv.displayInfo();
        pv.refuel();
    }
}
