import java.util.ArrayList;
import java.util.Iterator;

class OrderIterator implements Iterator<Order> {
    private ArrayList<Order> orders;
    private int index;

    public OrderIterator(ArrayList<Order> orders) {
        this.orders = orders;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < orders.size();
    }

    @Override
    public Order next() {
        return orders.get(index++);
    }
}