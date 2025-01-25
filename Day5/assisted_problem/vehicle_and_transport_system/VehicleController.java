package Day5.Day5.assisted_problem.vehicle_and_transport_system;

public class VehicleController {
    public static void main(String[]args){

        Vehicle alto=new Car(220,"CNG",5);
        Vehicle volvo=new Truck(120,"Diesel",10);
        Vehicle ninja=new MotorCycle(440,"Petrol",40);
        Vehicle splendor=new MotorCycle(120,"Petrol",80);
        Vehicle[] array=new Vehicle[]{alto,volvo,ninja,splendor};

        for(int i=0;i<array.length;i++){
            System.out.println();
            array[i].displayInfo();
        }
    }
}
