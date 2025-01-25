package Day5.Day5.assisted_problem.animal_hierarchy;

public class Dog extends Animal {
    String place;

    Dog(String place,String name,int age){
        super(name,age);
        this.place=place;
    }

    @Override
    void makeSound() {
        System.out.println("Bark...Bark...");
    }
}
