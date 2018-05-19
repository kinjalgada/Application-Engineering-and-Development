package Business.OrderItem;

import Business.Policy.Product;
import java.util.ArrayList;

public class Order {

    private static int count = 0;
    private int orderNumber;
    private int orderTotalAmount;

    private ArrayList<OrderItem> orderItemList;

    public Order() {
        count++;
        orderNumber = count;
        orderItemList = new ArrayList<>();
    }
    
    public int getOrderNumber() {
        return orderNumber;
    }
    
    public void removeOrderItem(OrderItem o) {
        orderItemList.remove(o);
    }
    
    public OrderItem addOrderItem(Product p, String q, String status) {
        OrderItem o = new OrderItem();
        o.setPolicy(p);
        o.setAutomobileNo(q);
        o.setStatus(status);
        orderItemList.add(o);
        return o;
    }
    
    public ArrayList<OrderItem> getOrderItemList() {
        return orderItemList;
    }
    
    public void setOrderItemList(ArrayList<OrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }
    
}
