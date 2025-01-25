package Day5.multilevel_inheritance.educational_course_hierarchy;

//Controller class for educational course hierarchy
public class OnlineCourseHierarchyController {
    public static void main(String[]args){
        //Creating course object and displaying course
        Course CSE=new Course("Computer Sceince ",40);
        CSE.displayCourse();
        System.out.println();

        //Creating object for OnlineCourse and calling method displayCourse
        OnlineCourse javaDevelopment=new OnlineCourse("Java Full Stack ",30,"You tube",true);
        javaDevelopment.displayCourse();
        System.out.println();

        //Creating object for PaidOnlineCourse and calling method displayCourse
        PaidOnlineCourse systemDesign=new PaidOnlineCourse("System Design",20,"Physics wallah",true,4000,1500);
        systemDesign.displayCourse();
    }
}
