public class PaymentProcessor {

    private int hostelCount = 0;
    private int dayScholarCount = 0;

    public void processPayment(FeeAccount account, double amount) {

        if (account instanceof HostelFeeAccount) {

            System.out.println(
                "Paid in two installments (hostel account)"
            );

            hostelCount++;

        } else {

            System.out.println(
                "Paid in one go (day-scholar account)"
            );

            dayScholarCount++;
        }
    }

    public static void main(String[] args) {

        FeeAccount[] accounts = {
            new HostelFeeAccount(),
            new HostelFeeAccount(),
            new FeeAccount("Day Scholar"),
            new FeeAccount("Day Scholar")
        };

        PaymentProcessor processor =
            new PaymentProcessor();

        for (int i = 0; i < accounts.length; i++) {

            processor.processPayment(
                accounts[i],
                60000
            );
        }

        System.out.println(
            "Hostel accounts processed: "
            + processor.hostelCount
            + " | Day-scholar accounts processed: "
            + processor.dayScholarCount
        );
    }
}