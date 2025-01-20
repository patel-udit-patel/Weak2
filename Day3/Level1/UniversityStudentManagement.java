//Student class
class Student{
    //Class variables
    private static String universityName;
    private static int totalStudents=0;
    //instance variables
    private String name;
    private final int rollNumber;
    private char grade;

    //Constructor
    Student(String name,int rollNumber,char grade){
        this.name=name;
        this.rollNumber=rollNumber;
        this.grade=grade;
        totalStudents++;
    }
    //method displays total number of students
    static void displayTotalStudents(){
        System.out.println("Total number of students "+totalStudents);
    }
    //method displays details of particular student
    void displayDetails(){
        System.out.println("Name of student "+this.name);
        System.out.println("Roll number "+this.rollNumber);
        System.out.println("Grade "+this.grade);

    }
}
public class UniversityStudentManagement {
    //main method
    public static void main(String[]args){
        //Creating Student object
        Student s1=new Student("Vinay Jadaun",1234,'E');
        //calling method
        Student.displayTotalStudents();
        //checking if s1 is instance of Student
        if(s1 instanceof Student){
            //method call for display details
            s1.displayDetails();

        }
        else{
            //otherwise print message
            System.out.println("s1 is not an instance of Student ");
        }
    }
}
