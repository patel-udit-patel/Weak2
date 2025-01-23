package Day4.Level1;

import java.util.ArrayList;

// University class (Composition with Departments, Aggregation with Faculty)
class UniversityWF {
    private String name;
    private ArrayList<DepartmentWF> departments;
    private ArrayList<Faculty> facultyMembers;

    public UniversityWF(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
        this.facultyMembers = new ArrayList<>();
    }

    public void addDepartment(String deptName) {
        departments.add(new DepartmentWF(deptName));
    }

    public void addFaculty(Faculty faculty) {
        facultyMembers.add(faculty);
    }

    public void displayUniversityDetails() {
        System.out.println("University: " + name);
        System.out.println("Departments:");
        for (DepartmentWF dept : departments) {
            dept.displayEmployees();
        }
        System.out.println("Faculty Members:");
        for (Faculty faculty : facultyMembers) {
            System.out.println(" - " + faculty.getName());
        }
    }
}

// Department class (Composition - Exists only within a University)
class DepartmentWF {
    private String name;
    private ArrayList<EmployeeWF> employees;

    public DepartmentWF(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(EmployeeWF employee) {
        employees.add(employee);
    }

    public void displayEmployees() {
        System.out.println("Department: " + name);
        for (EmployeeWF emp : employees) {
            System.out.println(" - " + emp.getName());
        }
    }
}

// Faculty class (Aggregation - Can exist independently of a University)
class Faculty {
    private String name;

    public Faculty(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// Employee class (Exists only within a Department)
class EmployeeWF {
    private String name;

    public EmployeeWF(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// Main class to demonstrate composition and aggregation
public class UniversityWithFacilities {
    public static void main(String[] args) {
        // Creating university
        UniversityWF university = new UniversityWF("Tech University");

        // Adding departments
        university.addDepartment("Computer Science");
        university.addDepartment("Physics");

        // Adding faculty members (Aggregation - Independent of University)
        Faculty profVinay = new Faculty("Dr. Vinay");
        Faculty profUdit = new Faculty("Dr. Udit");
        university.addFaculty(profVinay);
        university.addFaculty(profUdit);

        // Adding employees (Professors) to departments
        DepartmentWF csDept = new DepartmentWF("Computer Science");
        csDept.addEmployee(new EmployeeWF("Prof. Alice"));
        csDept.addEmployee(new EmployeeWF("Prof. Bob"));

        DepartmentWF physicsDept = new DepartmentWF("Physics");
        physicsDept.addEmployee(new EmployeeWF("Prof. Charlie"));

        // Display university details
        university.displayUniversityDetails();
    }
}
