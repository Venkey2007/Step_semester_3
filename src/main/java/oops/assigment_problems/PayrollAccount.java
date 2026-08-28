package oops.assigment_problems;

public class PayrollAccount {

    private double balance;

    PayrollAccount(double openingBalance) {
        balance = openingBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public static void main(String[] args) {

        PayrollAccount account = new PayrollAccount(10000);

        System.out.println("Initial Balance: " + account.getBalance());

        account.deposit(5000);

        System.out.println("Balance after deposit: " + account.getBalance());

        account.deposit(-1000);

        System.out.println("Final Balance: " + account.getBalance());
    }
}