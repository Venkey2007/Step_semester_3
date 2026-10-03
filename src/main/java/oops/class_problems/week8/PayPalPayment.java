package oops.class_problems.week8;

public class PayPalPayment implements PaymentMethod {

    @Override
    public boolean processPayment(double amount) {
        System.out.println(
                "Processing PayPal payment of $" + amount
        );
        return true;
    }
}
