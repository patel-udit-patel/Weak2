package Day5.multilevel_inheritance.online_retail_order_management;

public class ShippedOrder extends Order {
    int trackingNumber;
    ShippedOrder(int orderId,String orderDate,int trackingNumber){
        super(orderId, orderDate);
        this.trackingNumber=trackingNumber;
    }

    @Override
    void getOrderStatus() {
        super.getOrderStatus();
        System.out.println("Tracking Number "+this.trackingNumber);
    }
}
