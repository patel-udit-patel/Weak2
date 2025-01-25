package Day5.multilevel_inheritance.educational_course_hierarchy;

//creating OnlineCourse class inheriting Course class
public class OnlineCourse extends Course{
    String platform;
    boolean isRecorded;

    //constructor for OnlineCourse
    OnlineCourse(String courseName,int duration,String platform,boolean isRecorded){
        super(courseName, duration);
        this.platform=platform;
        this.isRecorded=isRecorded;
    }

    //method overriding display course of Course
    @Override
    void displayCourse() {
        super.displayCourse();
        System.out.println("Platform "+this.platform);
        System.out.println("isRecorded ? "+this.isRecorded);
    }
}
