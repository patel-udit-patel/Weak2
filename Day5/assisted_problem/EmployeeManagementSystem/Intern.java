package Day5.Day5.assisted_problem.EmployeeManagementSystem;

public class Intern extends Employee{
    int assignments;

    Intern(String name,int id,int salary,int assignments){
        super(name,id,salary);
        this.assignments=assignments;
    }

    @Override
    void displaySalary() {
        System.out.println("Inter has stipend of ");
        super.displaySalary();
    }
}
