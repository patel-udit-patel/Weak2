package Day4.Level1;
import java.util.ArrayList;

// Company class (Composition - contains Departments)
class Company {
    private String name;
    private ArrayList<Department> departments;

    public Company(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void displayDepartments() {
        System.out.println("Company: " + name);
        for (Department dept : departments) {
            dept.displayEmployees();
        }
    }

    public Department getDepartment(int index) {
        return departments.get(index);
    }
}

// Department class (Exists only within a Company)
class Department {
    private String name;
    private ArrayList<Employee> employees;

    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void displayEmployees() {
        System.out.println("Department: " + name);
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}

// Employee class (Exists only within a Department)
class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" + "name='" + name + '\'' + '}';
    }
}

// Main class to demonstrate composition
public class CompanyAndDepartments {
    public static void main(String[] args) {
        // Creating company
        Company company = new Company("Tech Corp");

        // Creating departments
        Department itDepartment = new Department("IT");
        Department hrDepartment = new Department("HR");

        // Adding departments to company
        company.addDepartment(itDepartment);
        company.addDepartment(hrDepartment);

        // Adding employees to departments
        itDepartment.addEmployee(new Employee("Alice"));
        itDepartment.addEmployee(new Employee("Bob"));
        hrDepartment.addEmployee(new Employee("Charlie"));

        // Display company structure
        company.displayDepartments();
    }
}


