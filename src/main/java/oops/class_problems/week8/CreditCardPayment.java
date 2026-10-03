package oops.class_problems.week8;

public class CreditCardPayment implements PaymentMethod {

    @Override
    public boolean processPayment(double amount) {
        System.out.println(
                "Processing credit card payment of $" + amount
        );
        return true;
    }
}
