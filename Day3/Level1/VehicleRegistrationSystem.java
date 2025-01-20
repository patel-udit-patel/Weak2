//Vehicle class
class Vehicle{
    //class variable
    private static int registrationFee;
    //object variable
    private String ownerName;
    private String vehicleType;
    private final int registrationNumber;

    //Constructor
    Vehicle(String ownerName,String vehicleType,int registrationNumber){
        this.ownerName=ownerName;
        this.vehicleType=vehicleType;
        this.registrationNumber=registrationNumber;
    }
    //method updates registration fee
    static void updateRegistrationFee(int newRegistrationFee){
        registrationFee=newRegistrationFee;
    }
    //method prints all details
    void displayDetails(){
        System.out.println("Name of owner "+this.ownerName);
        System.out.println("Type of Vehicle "+this.vehicleType);
        System.out.println("Registration number "+this.registrationNumber);
        System.out.println("Registration Fee "+registrationFee);
    }
}
public class VehicleRegistrationSystem {
    //main method
    public static void main(String[]args){
        //Creating vehicle object
        Vehicle v1=new Vehicle("Vinay","Activa",234);
        //method call for update registration
        Vehicle.updateRegistrationFee(1200);
        //checking if v1 is instance of Vehicle
        if(v1 instanceof Vehicle){
            //method call for details of v1
            v1.displayDetails();
        }else{
            //printing message
            System.out.println("v1 is not an instance of Vehicle");
        }
    }
}
