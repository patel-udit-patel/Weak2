package Day4.Level1;

import java.util.ArrayList;

// University Management System
class University {
    private String name;
    private ArrayList<StudentU> students;
    private ArrayList<Professor> professors;
    private ArrayList<CourseU> courses;

    public University(String name) {
        this.name = name;
        this.students = new ArrayList<>();
        this.professors = new ArrayList<>();
        this.courses = new ArrayList<>();
    }

    public void addStudent(StudentU student) {
        students.add(student);
    }

    public void addProfessor(Professor professor) {
        professors.add(professor);
    }

    public void addCourse(CourseU course) {
        courses.add(course);
    }

    public void displayUniversityDetails() {
        System.out.println("University: " + name);
        System.out.println("Students:");
        for (StudentU student : students) {
            System.out.println(" - " + student.getName());
        }
        System.out.println("Professors:");
        for (Professor professor : professors) {
            System.out.println(" - " + professor.getName());
        }
        System.out.println("Courses:");
        for (CourseU course : courses) {
            System.out.println(" - " + course.getCourseName());
        }
    }
}

// Student class (Enrolling in multiple courses)
class StudentU {
    private String name;
    private ArrayList<CourseU> courses;

    public StudentU(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void enrollCourse(CourseU course) {
        courses.add(course);
        course.addStudent(this);
        System.out.println(name + " enrolled in " + course.getCourseName());
    }
}

// Professor class (Teaching multiple courses)
class Professor {
    private String name;
    private ArrayList<CourseU> courses;

    public Professor(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void assignCourse(CourseU course) {
        courses.add(course);
        course.setProfessor(this);
        System.out.println(name + " is assigned to teach " + course.getCourseName());
    }
}

// Course class (Associated with students and professor)
class CourseU {
    private String courseName;
    private Professor professor;
    private ArrayList<StudentU> students;

    public CourseU(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public void addStudent(StudentU student) {
        students.add(student);
    }
}

// Main class to demonstrate University Management System
public class UniversityManagementSystem {
    public static void main(String[] args) {
        // Creating university
        University university = new University("Global University");

        // Creating professors
        Professor drUdit = new Professor("Dr. Udit");
        Professor drVinay = new Professor("Dr. Vinay");

        // Creating courses
        CourseU math = new CourseU("Mathematics");
        CourseU physics = new CourseU("Physics");

        // Assigning professors to courses
        drUdit.assignCourse(math);
        drVinay.assignCourse(physics);

        // Creating students
        StudentU alice = new StudentU("Alice");
        StudentU bob = new StudentU("Bob");

        // Students enrolling in courses
        alice.enrollCourse(math);
        bob.enrollCourse(physics);
        alice.enrollCourse(physics);

        // Adding students, professors, and courses to university
        university.addStudent(alice);
        university.addStudent(bob);
        university.addProfessor(drUdit);
        university.addProfessor(drVinay);
        university.addCourse(math);
        university.addCourse(physics);

        // Display university details
        university.displayUniversityDetails();
    }
}

