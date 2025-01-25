package Day5.Day5.assisted_problem.EmployeeManagementSystem;

public class Developer extends Employee{
    int projects;

    Developer(String name,int id,int salary,int projects){
        super(name,id,salary);
        this.projects=projects;
    }

    @Override
    void displaySalary() {
        System.out.println("Employee has salary ");
        super.displaySalary();
    }
}
