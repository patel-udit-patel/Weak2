//Parent class
class Patient{
    //static data members of Patient class
    private static String hospitalName="AIIMS";
    private static int totalPatients=0;
    //instance variables of Patient class
    private String name;
    private int age;
    private String ailment;
    private final int patientID;

    //Constructor of patient class
    Patient(String name,int age,String ailment,int patientID){
        this.name=name;
        this.age=age;
        this.ailment=ailment;
        this.patientID=patientID;
        totalPatients++;
    }
    //method prints total number of patients
    static void getTotalPatients(){
        System.out.println("Total number of patients "+totalPatients);
    }
    //method displays details of patient
    void displayDetails(){
        System.out.println("Name of patient "+this.name);
        System.out.println("Patient ID "+this.patientID);
        System.out.println("Age of patient "+this.age);
        System.out.println("Ailment of patient "+this.ailment);
        System.out.println("Hospital name "+hospitalName);
    }
}
public class HospitalManagementSystem {
    //main method where execution starts
    public static void main(String[]args){
        //creating Patient object
        Patient p1=new Patient("Vinay",21,"Fever",123);
        //method call for total patients
        Patient.getTotalPatients();
        //checking if p1 is instance of Patient
        if(p1 instanceof Patient){
            //method call for display details
            p1.displayDetails();
        }
        else{
            //otherwise display message
            System.out.println("p1 is not an instance of patient ");
        }
    }
}
