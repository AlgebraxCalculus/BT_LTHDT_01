import java.util.ArrayList;

public class OrderList {
    private ArrayList<Order> order;

    public OrderList() {
        this.order = new ArrayList<>();
    }

    public void add(Order ord) {
        order.add(ord);
    }

    public void remove(Order ord) {
        order.remove(ord);
    }
    
    public int getCount() {
        return order.size();
    }
    
    public OrderIterator getOIterator() {
        return new OrderIterator(order);
    }
}