package Day5.multilevel_inheritance.educational_course_hierarchy;

//Creating course class
public class Course {
    String courseName;
    int duration;

    //constructor for course
    Course(String courseName,int duration){
        this.courseName=courseName;
        this.duration=duration;
    }
    //method displays details of course
    void displayCourse(){
        System.out.println("Name of Course "+this.courseName);
        System.out.println("Duration in hours "+this.duration);

    }
}
