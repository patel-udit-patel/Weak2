package Day5.Day5.assisted_problem.EmployeeManagementSystem;

public class Manager extends Employee{
    int teams;

    Manager(String name,int id,int salary,int teams){
        super(name,id,salary);
        this.teams=teams;
    }

    @Override
    void displaySalary() {
        System.out.println("Manager has paid off ");
        super.displaySalary();
    }
}
