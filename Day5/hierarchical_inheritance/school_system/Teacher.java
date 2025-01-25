package Day5.hierarchical_inheritance.school_system;

//creating teacher class inheriting person
public class Teacher extends Person{
    String subject;

    //Constructor for Teacher
    Teacher(String name,int age,String subject){
        super(name, age);
        this.subject=subject;
    }

    //method overriding displayDetail method of Person
    @Override
    void displayDetail() {
        super.displayDetail();
        System.out.println("Subject "+this.subject);
    }
    //method displays role of Person
    void displayRole(){
        System.out.println("Role  Teacher");
    }
}
