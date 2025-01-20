package Day2.Level1;

class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;

    // Constructor
    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    // Public method to access CGPA
    public double getCGPA() {
        return CGPA;
    }

    // Public method to modify CGPA
    public void setCGPA(double CGPA) {
        if (CGPA >= 0.0 && CGPA <= 10.0) {
            this.CGPA = CGPA;
        } else {
            System.out.println("Invalid CGPA. Must be between 0.0 and 10.0");
        }
    }

    // Display student details
    public void displayDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + getCGPA());
    }
}

// Subclass PostgraduateStudent
class PostgraduateStudent extends Student {
    private String specialization;

    // Constructor
    public PostgraduateStudent(int rollNumber, String name, double CGPA, String specialization) {
        super(rollNumber, name, CGPA);
        this.specialization = specialization;
    }

    // Method to display postgraduate student details
    public void displayPGDetails() {
        System.out.println("\nPostgraduate Student Details:");
        System.out.println("Roll Number: " + rollNumber); // Accessing public member
        System.out.println("Name: " + name); // Accessing protected member
        System.out.println("Specialization: " + specialization);
    }
}

// Main class to test the functionality
public class UniversityManagement {
    public static void main(String[] args) {
        // Creating Student object
        Student student1 = new Student(101, "Rahul Sharma", 8.5);
        student1.displayDetails();

        // Modifying CGPA
        student1.setCGPA(9.2);
        System.out.println("Updated CGPA: " + student1.getCGPA());

        // Creating PostgraduateStudent object
        PostgraduateStudent pgStudent = new PostgraduateStudent(201, "Amit Verma", 9.0, "Computer Science");
        pgStudent.displayPGDetails();
    }
}


