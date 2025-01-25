package Day5.Day5.assisted_problem.EmployeeManagementSystem;

public class Employee {
    String name;
    int id;
    int salary;

    Employee(String name,int id,int salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    void displaySalary(){
        System.out.println("Salary"+this.salary);
    }
}
