package Day5.hierarchical_inheritance.school_system;

//Creating staff class inheriting Person
public class Staff extends Person{
    int workingHours;

    //Constructor for Staff class
    Staff(String name,int age,int workingHours){
        super(name, age);
        this.workingHours=workingHours;
    }

    //method is overriding displayDetail of person class
    @Override
    void displayDetail() {
        super.displayDetail();
        System.out.println("Working Hours "+this.workingHours);
    }
    //method displays role of person
    void displayRole(){
        System.out.println("Role  Staff");
    }
}
