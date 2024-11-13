import java.util.ArrayList;
import java.util.Currency;

public class Order {
    private Customer customer;
    private ArrayList<OrderLine> orderLine;
    private Currency total;

    public Order(Customer customer) {
        this.customer = customer;
        this.orderLine = new ArrayList<>();
    }

    public Currency getTotal() {
        return total;
    }

    public void setTotal(Currency total) {
        this.total = total;
    }

    public OrderLine addLine(OrderLine line) {
        orderLine.add(line);
        return line;
    }

    public void removeLine(OrderLine line) {
        orderLine.remove(line);
    }

    public void inOrder() {
        System.out.println("Order Info:");
        System.out.println("Customer: " + customer);
        System.out.println("Total: " + total);
        System.out.println("Order Lines:");
        for (OrderLine line : orderLine) {
            System.out.println(" - Value: " + line.getValue());
        }
    }
}
