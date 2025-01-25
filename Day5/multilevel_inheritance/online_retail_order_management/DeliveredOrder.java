package Day5.multilevel_inheritance.online_retail_order_management;

//Creating DeliveredOrder class inheriting ShippedOrder
public class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    //constructor for DeliveredOrder
    DeliveredOrder(int orderId,String orderDate,int trackingNumber,String deliveryDate ){
        super(orderId,orderDate,trackingNumber);
        this.deliveryDate=deliveryDate;
    }

    //overriding getOrderStatus of Order class
    @Override
    void getOrderStatus() {
        super.getOrderStatus();
        System.out.println("Delivery date "+this.deliveryDate);
    }
}
