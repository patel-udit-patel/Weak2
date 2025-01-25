package Day5.single_inheritance.library_management;

public class Author extends Book{
    String name;
    String bio;

    Author(String name,String bio,String title,int publicationYear){
        super(title,publicationYear);
        this.name=name;
        this.bio=bio;
    }
    @Override
    void displayInfo(){
        System.out.println("Name of Author "+this.name);
        System.out.println("Title of Book "+this.title);
        System.out.println("Bio of Author "+this.bio);
        System.out.println("Year of Publication "+this.publicationYear);
    }
}
