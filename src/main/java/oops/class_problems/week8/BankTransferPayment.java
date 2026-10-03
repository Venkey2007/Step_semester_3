package oops.class_problems.week8;

public class BankTransferPayment implements PaymentMethod {

    @Override
    public boolean processPayment(double amount) {
        System.out.println(
                "Processing bank transfer payment of $" + amount
        );
        return true;
    }
}
