package Day5.Day5.assisted_problem.vehicle_and_transport_system;

public class Vehicle {
    int maxSpeed;
    String fuelType;

    Vehicle(int maxSpeed,String fuelType){
        this.maxSpeed=maxSpeed;
        this.fuelType=fuelType;
    }
    void displayInfo(){
        System.out.println("Max Speed "+this.maxSpeed);
        System.out.println("Fuel Type "+this.fuelType);
    }
}
