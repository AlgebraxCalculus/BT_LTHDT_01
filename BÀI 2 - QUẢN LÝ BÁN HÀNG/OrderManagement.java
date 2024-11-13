import java.util.Currency;
import java.util.Locale;

public class OrderManagement {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Ha Noi", "KH01", "Nguyen Van A");
        Customer customer2 = new Customer("Hai Phong", "KH02", "Tran Van B");

        Order order1 = new Order(customer1);
        Order order2 = new Order(customer2);

        Currency usd = Currency.getInstance(Locale.US);
        order1.setTotal(usd);
        order2.setTotal(usd);
        
        OrderLine line1 = new OrderLine(usd);
        OrderLine line2 = new OrderLine(usd);
        OrderLine line3 = new OrderLine(usd);
        
        order1.addLine(line1);
        order1.addLine(line2);
        
        order2.addLine(line3);

        OrderList orderList = new OrderList();
        orderList.add(order1);
        orderList.add(order2);

        System.out.println("Total orders: " + orderList.getCount());

        OrderIterator iterator = orderList.getOIterator();
        while (iterator.hasNext()) {
            Order ord = iterator.next();
            ord.inOrder();
        }
    }
}
