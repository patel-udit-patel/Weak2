package Day5.single_inheritance.library_management;

public class Book {
    String title;
    int publicationYear;

    Book(String title,int publicationYear){
        this.title=title;
        this.publicationYear=publicationYear;
    }
    void displayInfo(){
        System.out.println("Title "+this.title);
        System.out.println("Publication Year "+this.publicationYear);
    }
}
