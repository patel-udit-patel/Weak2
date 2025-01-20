package Day2.Level1;

class Vehicle{
    private String ownerName;
    private String vehicleType;
    private static int registrationFee;

    Vehicle(String ownerName,String vehicleType){
        this.ownerName=ownerName;
        this.vehicleType=vehicleType;
    }
    void displayVehicleDetails(){
        System.out.println("Name of owner "+this.ownerName);
        System.out.println("Registration fee "+registrationFee);
    }
    void updateRegistrationFee(int newRegistrationFee){
        registrationFee=newRegistrationFee;
        System.out.println("Registration fee is changed as "+registrationFee);
    }

}
public class VehicleRegistration {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Udit Patel", "Racing");
        v1.displayVehicleDetails();
        v1.updateRegistrationFee(1200);
        v1.displayVehicleDetails();
    }
}
