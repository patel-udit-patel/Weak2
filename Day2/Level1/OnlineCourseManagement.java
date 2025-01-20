package Day2.Level1;

class Course{
    private String courseName;
    private int duration;
    private int fee;
    private static String instituteName;

    Course(String courseName,int duration,int fee){
        this.courseName=courseName;
        this.duration=duration;
        this.fee=fee;
    }
    void displayCourseDetails(){
        System.out.println("Name of course "+this.courseName);
        System.out.println("Duration "+this.duration);
        System.out.println("Fee "+this.fee);
        System.out.println("Institution "+instituteName);
    }
    void updateInstitutionName(String newInstituteName){
        instituteName=newInstituteName;
        System.out.println("Institute name is updated as "+newInstituteName);
    }

}
public class OnlineCourseManagement {
    public static void main(String[]args){
        Course c1=new Course("CapgeminiExceller",2,0);
        c1.displayCourseDetails();
        c1.updateInstitutionName("Bridzlabs");
        c1.displayCourseDetails();;
    }
}
