import java.util.Scanner;

//Creating class CartItem
class CartItem{
    String itemName;
    int price;
    int quantity;

    //using static variable named total
    static int total=0;
    void addItem(String itemName,int price,int quantity){
        this.itemName=itemName;
        this.price=price;
        this.quantity=quantity;
        total=total+price*quantity;
    }
    //method reduces amount from total
    void removeItem(int quantity){
        if(quantity>this.quantity){
            System.out.println("Item with this quantity is not in the cart");
        }else {
            total = total - (this.price * quantity);
            System.out.println("Items "+quantity+" is reduced from cart ");
        }
    }
    //method displays total cost
    void displayTotalCost(){
        System.out.println("The total amount of items is "+total);
    }

}

public class SimulateShoppingCart {
    public static void main(String[]args){
        //Using scanner object for user input
        Scanner input=new Scanner(System.in);

        //Taking input from user
        System.out.println("Enter itemName , price  and quantity");
        String itemName=input.nextLine();
        int price=input.nextInt();
        int quantity=input.nextInt();

        //Creating object of class CarItem
        CartItem first=new CartItem();

        //calling addItem for first
        first.addItem(itemName,price,quantity);

        //calling method for displaying total
        first.displayTotalCost();

        //removing item from cart of quantity
        int removeQuantity=input.nextInt();
        first.removeItem(removeQuantity);
        first.displayTotalCost();

    }
}
