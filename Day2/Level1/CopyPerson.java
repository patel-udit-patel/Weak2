package Day2.Level1;

class Person{
    private String name;
    private String address;
    private int age;

    Person(){
        this.name="Vinay";
        this.address="Pathani";
        this.age=21;
        System.out.println("Person object is initialised with default values");
    }
    Person(Person p1){
        this.name=p1.name;
        this.address=p1.address;
        this.age=p1.age;
        System.out.println("Person object is initialised with values of parameterised object");
    }

    void display(){
        System.out.println("Name "+this.name);
        System.out.println("Address "+this.address);
        System.out.println("Age "+this.age );
    }

}
public class CopyPerson {
    public static void main(String[]args){
        Person p1=new Person();
        Person p2=new Person(p1);
        p1.display();
        p2.display();
    }
}
