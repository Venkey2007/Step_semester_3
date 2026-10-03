package oops.class_problems.week8;

public class PaymentDemo {

    public static void main(String[] args) {

        Customer customer =
                new Customer("C1", "John");

        Product laptop =
                new Product("P1", "Laptop", 1000.0);

        Product mouse =
                new Product("P2", "Mouse", 50.0);

        System.out.println("1. Creating order:");

        Order order =
                new Order("O1", customer);

        order.addProduct(laptop);
        order.addProduct(mouse);

        System.out.println(
                "Order Total: $" + order.calculateTotal()
        );

        System.out.println("\n2. Paying with Credit Card:");

        PaymentMethod creditCard =
                new CreditCardPayment();

        order.makePayment(creditCard);

        System.out.println(
                "Order Status: " + order.getStatus()
        );

        System.out.println("\n3. Creating another order:");

        Order failedOrder =
                new Order("O2", customer);

        failedOrder.addProduct(laptop);

        System.out.println("\n4. Attempting failed payment:");

        PaymentMethod failedPayment =
                new FailedPayment();

        failedOrder.makePayment(failedPayment);

        System.out.println(
                "Order Status after failed payment: "
                + failedOrder.getStatus()
        );
    }
}