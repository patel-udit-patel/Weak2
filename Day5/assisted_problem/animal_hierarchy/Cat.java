package Day5.Day5.assisted_problem.animal_hierarchy;

public class Cat extends Animal {
    String owner;
    Cat(String name,int age,String owner){
        super(name,age);
        this.owner=owner;
    }

    @Override
    void makeSound() {
        System.out.println("Meow......Meow");
    }
}
