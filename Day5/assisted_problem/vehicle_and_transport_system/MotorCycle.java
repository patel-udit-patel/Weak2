package Day5.Day5.assisted_problem.vehicle_and_transport_system;

public class MotorCycle extends Vehicle{
    int efficiency;

    MotorCycle(int maxSpeed,String fuelType,int efficiency){
        super(maxSpeed, fuelType);
        this.efficiency=efficiency;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Efficiency "+this.efficiency);
    }
}
