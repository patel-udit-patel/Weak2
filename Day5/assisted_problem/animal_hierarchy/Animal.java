package Day5.Day5.assisted_problem.animal_hierarchy;

//creating Animal class
public class Animal {
    String name;
    int age;

    //constructor for Animal class
    Animal(String name,int age){
        this.name=name;
        this.age=age;
    }
    //method displays sound of animal
    void makeSound(){
        System.out.println("making sound.....");
    }
}
