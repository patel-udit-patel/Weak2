//Product class
class Product{
    //class variable
    private static int discount;
    //instance variable
    private String productName;
    private final int productID;
    private int price;
    private int quantity;

    //constructor
    Product(String productName,int productID,int price,int quantity){
        this.productName=productName;
        this.price=price;
        this.quantity=quantity;
        this.productID=productID;

    }
    //method updates value of discount
    static void updateDiscount(int newDiscount){
        discount=newDiscount;
    }
    //method displays details about product
    void displayDetails(){
        System.out.println("Product name "+this.productName);
        System.out.println("Product ID "+this.productID);
        System.out.println("Price "+this.price);
        System.out.println("Quantity "+this.quantity);
        System.out.println("Discount "+discount);
    }

}
public class ShippingCartSystem {
    //main method
    public static void main(String[]args){
        //Creating instance of Product class
        Product p1=new Product("IPhone16",123,130000,1);
        //checking if p1 is instance of product
        boolean isTrue=p1 instanceof Product;
        if(isTrue){
            //calling method for display details of p1
            p1.displayDetails();
        }
        else{
            //otherwise print message
            System.out.println("p1 is not an instance of Product");
        }
    }
}
