package module;

import java.util.List;

public class Order {
    private int orderID;
    private List<Booksorder> bookOrders;

    public Order(List<Booksorder> bookOrders, int orderID) {
        this.bookOrders = bookOrders;
        this.orderID = orderID;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public List<Booksorder> getBookOrders() {
        return bookOrders;
    }

    public void setBookOrders(List<Booksorder> bookOrders) {
        this.bookOrders = bookOrders;
    }

    public int calculateTotalAmount() {
        int totalAmount = 0;
        for (Booksorder bookOrder : this.bookOrders) {
            totalAmount += bookOrder.calculateTotalPrice();
        }
        return totalAmount;
    }
}
