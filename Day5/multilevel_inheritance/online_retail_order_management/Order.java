package Day5.multilevel_inheritance.online_retail_order_management;

//creating class order public
public class Order {
    int orderId;
    String orderDate;

    //Constructor for class Order
    Order(int orderId,String orderDate){
        this.orderId=orderId;
        this.orderDate=orderDate;
    }
    //method displays status of Order
    void getOrderStatus(){
        System.out.println("Order Id "+this.orderId);
        System.out.println("Order date "+this.orderDate);
    }
}
