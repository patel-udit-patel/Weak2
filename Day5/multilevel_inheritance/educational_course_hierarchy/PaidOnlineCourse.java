package Day5.multilevel_inheritance.educational_course_hierarchy;

//creating paidOnlineCourse class inheriting OnlineCourse
public class PaidOnlineCourse extends OnlineCourse{
    int fee;
    int discount;

    //Constructor for PaidOnlineCourse class
    PaidOnlineCourse(String courseName,int duration,String platform,boolean isRecorded,int fee,int discount){
        super(courseName, duration, platform, isRecorded);
        this.fee=fee;
        this.discount=discount;
    }

    //overriding displayCourse method of Course
    @Override
    void displayCourse() {
        super.displayCourse();
        System.out.println("Fee "+this.fee);
        System.out.println("Discount "+this.discount);
    }
}
