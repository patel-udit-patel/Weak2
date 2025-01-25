package Day5.multilevel_inheritance.online_retail_order_management;

//Controller class for Order
public class OnlineRetailOrderController {
    public static void main(String[]args){
        //creating Order object and calling method getOrderStatus
        Order tShirt=new Order(123,"23-01-25");
        tShirt.getOrderStatus();

        //creating object of ShippedOrder and calling getOrderStatus method
        ShippedOrder wristWatch=new ShippedOrder(234,"20-01-25",235);
        wristWatch.getOrderStatus();

        //Creating object for DeliveredOrder
        DeliveredOrder mobilePhone=new DeliveredOrder(345,"18-01-25",456,"23-01-25");
        mobilePhone.getOrderStatus();

    }
}
