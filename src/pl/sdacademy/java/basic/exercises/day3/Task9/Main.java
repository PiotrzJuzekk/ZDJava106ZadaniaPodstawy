package pl.sdacademy.java.basic.exercises.day3.Task9;

public class Main {
    public static void main(String[] args) {
        OrderItem cukier = new OrderItem("cukier", 3, 4);
        OrderItem mleko = new OrderItem("mleko", 5, 3.12);

        Order order = new Order(5);
        order.addItem(cukier);
        order.addItem(mleko);
        order.addItem(mleko);
        order.addItem(mleko);
        order.addItem(mleko);
        order.addItem(mleko);
    }
}
