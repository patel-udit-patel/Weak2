package Day5.Day5.assisted_problem.EmployeeManagementSystem;

public class EmployeeController {
    public static void main(String []args) {
        Employee e1 = new Employee("Udit", 123, 25000);
        e1.displaySalary();
        Manager m1=new Manager("Vinay",234,12000,4);
        m1.displaySalary();
        Developer d1=new Developer("Utkarsh",345,7000,5);
        d1.displaySalary();
        Intern s1=new Intern("Ujjwal",456,4000,10);
        s1.displaySalary();
    }
}
