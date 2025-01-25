package Day5.Day5.assisted_problem.animal_hierarchy;

public class Bird extends Animal {
    String habitat;
    Bird(String name,int age,String habitat){
        super(name,age);
        this.habitat =habitat;
    }

    @Override
    void makeSound() {
        System.out.println("Chirp..chirp..");
    }
}
