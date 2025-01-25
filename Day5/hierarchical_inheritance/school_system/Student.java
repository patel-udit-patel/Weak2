package Day5.hierarchical_inheritance.school_system;

//creating Student object inheriting Person
public class Student extends Person{
    char grade;

    //Constructor for Student class
    Student(String name,int age,char grade){
        super(name, age);
        this.grade=grade;

    }

    //method overrides displayDetail method of Person
    @Override
    void displayDetail() {
        super.displayDetail();
        System.out.println("Grade "+this.grade);
    }
    //method displays role of person
    void displayRole(){
        System.out.println("Role Student");
    }
}
