package oops.class_problems.week8;

public class FailedPayment implements PaymentMethod {

    @Override
    public boolean processPayment(double amount) {
        System.out.println(
                "Payment processing failed for $" + amount
        );
        return false;
    }
}
