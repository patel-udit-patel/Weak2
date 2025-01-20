package Day2.Level1;

class Book{
    private String title;
    private String author;
    private int price;

    Book(){
        System.out.println("Book object has created with default values");

    }
    Book(String title,String author,int price){
        this.title=title;
        this.author=author;
        this.price=price;
        System.out.println("Book object has created with parameterised values ");
    }
    void display(){
        System.out.println("Title :"+this.title);
        System.out.println("Author :"+this.author);
        System.out.println("Price :"+this.price);
    }

}
public class BookManagement {
    public static void main(String[]args){
        Book first=new Book();
        Book second=new Book("Vinay ki Kahaniya","Udit",500);
        first.display();
        second.display();
    }
}

