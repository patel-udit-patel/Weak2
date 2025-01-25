package Day5.Day5.assisted_problem.vehicle_and_transport_system;

public class Car extends Vehicle {
    int seatCapacity;

    Car(int maxSpeed,String fuelType,int seatCapacity){
        super(maxSpeed,fuelType);
        this.seatCapacity=seatCapacity;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Seat capacity "+this.seatCapacity);
    }
}
