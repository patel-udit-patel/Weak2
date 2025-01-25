package Day5.Day5.assisted_problem.animal_hierarchy;

//controller for Animals
public class AnimalController {
    public static void main(String[]args) {
        //creating object of Animal class and calling method makeSound
        Animal animal = new Animal("abhu", 8);
        animal.makeSound();

        //creating object of class Dog and calling method makeSound
        Dog dj=new Dog("Home","dj",10);
        dj.makeSound();

        //creating object of class Cat and calling method makeSound
        Cat kitty=new Cat("Kitty",6,"Udit");
        kitty.makeSound();

        //creating object of class Bird and calling method makeSound
        Bird sparrow=new Bird("Jack",2,"Forest");
        sparrow.makeSound();
    }
}
