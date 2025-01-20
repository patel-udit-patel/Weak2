package Day2.Level1;


class Circle{
    private int radius;

    Circle(){
        System.out.println("Circle object is initialised with default values");
    }
    Circle(int radius){
        this.radius=radius;
        System.out.println("Circle object is initialised with parameterised values ");
    }
    void display(){
        System.out.println("Circle has a radius of "+this.radius);
    }
}
public class CircleGeometry {
    public static void main(String[] args) {
        int radius = 5;
        Circle a = new Circle();
        Circle b = new Circle(radius);
        a.display();
        b.display();
    }
}


