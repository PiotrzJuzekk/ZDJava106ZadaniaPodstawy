package pl.sdacademy.java.basic.exercises.day3.Task9;

public class Order {
    private int maxOrderItem;
    private OrderItem[] orderItems;
    private int currentOrderItems;

    public Order(int maxOrderItem) {
        this.maxOrderItem = maxOrderItem;
        this.currentOrderItems = 0;
        this.orderItems = new OrderItem[maxOrderItem];
    }

    public boolean addItem(OrderItem orderItem) {
        if (!orderItem.isCorrect()) {
            System.out.println("Item is incorrect");
            return false;
        }
        if (currentOrderItems >= maxOrderItem) {
            System.out.println("Order is full");
            return false;
        }
        orderItems[currentOrderItems] = orderItem;
        currentOrderItems++;
        return true;
    }

//    getTotalAmount
//    foreach po tablicy
//    sum += get price

//    count += getQuantity
}
