package oops.class_problems.week8;

import java.util.ArrayList;
import java.util.List;

public class Order {

    public enum Status {
        CREATED,
        PAID
    }

    private String orderId;
    private Customer customer;
    private List<Product> products;
    private Status status;

    public Order(String orderId, Customer customer) {
        this.orderId = orderId;
        this.customer = customer;
        this.products = new ArrayList<>();
        this.status = Status.CREATED;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public double calculateTotal() {
        double total = 0;

        for (Product product : products) {
            total += product.getPrice();
        }

        return total;
    }

    public boolean makePayment(PaymentMethod paymentMethod) {

        if (products.isEmpty()) {
            System.out.println(
                    "Order must contain at least one product before payment."
            );
            return false;
        }

        if (status == Status.PAID) {
            System.out.println("Order has already been paid.");
            return false;
        }

        double total = calculateTotal();

        boolean paymentSuccessful =
                paymentMethod.processPayment(total);

        if (paymentSuccessful) {
            status = Status.PAID;
            System.out.println("Payment successful. Order is now PAID.");
            return true;
        }

        System.out.println(
                "Payment failed. Order remains unpaid."
        );
        return false;
    }

    public String getOrderId() {
        return orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<Product> getProducts() {
        return products;
    }

    public Status getStatus() {
        return status;
    }
}
