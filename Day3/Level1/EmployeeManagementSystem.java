//Employee class
class Employee{
    //static data members of Employee class
    private static String companyName;
    private static int totalEmployee;
    //instance variables of Employee
    private String name;
    private final int id;
    private String designation;

    //Constructor of Employee class with parameters
    Employee(String name,int id,String designation){
        this.name=name;
        this.id=id;
        this.designation=designation;
        totalEmployee++;
    }
    //method displays total number of employee
    void displayTotalEmployees(){
        System.out.println("Total number of employee "+totalEmployee);
    }

    //method prints employee details
    void employeeDetails(){
        System.out.println("Company name "+companyName);
        System.out.println("Employee name "+this.name);
        System.out.println("Employee id "+this.id);
        System.out.println("Designation "+this.designation);

    }
}

public class EmployeeManagementSystem {
    //main method where execution starts
    public static void main(String[]args){
        //Creating Employee object
        Employee e1=new Employee("Vinay jadon",1223,"Senior analyst ");
        //checking if e1 is an instance of Employee
        boolean istrue=e1 instanceof Employee;
        if(istrue){
            //if true then call employeeDetails
            e1.employeeDetails();

        }else{
            //otherwise print message
            System.out.println("e1 is not an instance of Employee");
        }
    }
}
