package Day5.Day5.assisted_problem.vehicle_and_transport_system;

public class Truck extends Vehicle {
    int loadCapacity;

    Truck(int maxSpeed,String fuelType,int loadCapacity){
        super(maxSpeed, fuelType);
        this.loadCapacity=loadCapacity;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Load Capacity "+this.loadCapacity);
    }
}
