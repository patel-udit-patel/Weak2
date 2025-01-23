package Day4.Level1;

import java.util.ArrayList;

// School class (Aggregates Students)
class School {
    private String name;
    private ArrayList<StudentSc> students;

    public School(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void addStudent(StudentSc student) {
        students.add(student);
    }

    public void displayStudents() {
        System.out.println("School: " + name);
        for (StudentSc student : students) {
            student.displayCourses();
        }
    }
}

// Student class (Associated with multiple Courses)
class StudentSc {
     String name; //It should be private
    private ArrayList<Course> courses;

    public StudentSc(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public void enrollInCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
            course.addStudent(this);
        }
    }

    public void displayCourses() {
        System.out.println("Student: " + name + " is enrolled in:");
        for (Course course : courses) {
            System.out.println(" - " + course.getName());
        }
    }
}

// Course class (Associated with multiple Students)
class Course {
    private String name;
    private ArrayList<StudentSc> students;

    public Course(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void addStudent(StudentSc student) {
        if (!students.contains(student)) {
            students.add(student);
        }
    }

    public String getName() {
        return name;
    }

    public void displayStudents() {
        System.out.println("Course: " + name + " has the following students:");
        for (StudentSc student : students) {
            System.out.println(" - " + student.name);
        }
    }
}

// Main class to demonstrate association and aggregation
public class SchoolAndStudents {
    public static void main(String[] args) {
        // Creating school
        School school = new School("Greenwood High");

        // Creating students
        StudentSc alice = new StudentSc("Alice");
        StudentSc bob = new StudentSc("Bob");

        // Creating courses
        Course math = new Course("Mathematics");
        Course science = new Course("Science");

        // Enrolling students in courses
        alice.enrollInCourse(math);
        alice.enrollInCourse(science);
        bob.enrollInCourse(math);

        // Adding students to school
        school.addStudent(alice);
        school.addStudent(bob);

        // Display school structure
        school.displayStudents();

        // Display enrolled students in each course
        math.displayStudents();
        science.displayStudents();
    }
}

