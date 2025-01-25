package Day5.hierarchical_inheritance.school_system;

//Creating person class
public class Person {
    String name;
    int age;

    //Constructor for person class
    Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    //method displays details of person
    void displayDetail(){
        System.out.println("Name of Person "+this.name);
        System.out.println("Age of person "+this.age);
    }
}
