public class LateFeeAccount {

    private String regNo;
    private double totalFee;

    public LateFeeAccount(String regNo, double totalFee) {
        this.regNo = regNo;
        this.totalFee = totalFee;
    }

    public final double calculateLateFee(int daysLate) {
        return totalFee * 0.01 * daysLate;
    }

    public final void printSummary(int daysLate) {

        if (daysLate <= 0) {
            System.out.println(
                regNo + " - On time, no late fee"
            );
            return;
        }

        double lateFee = calculateLateFee(daysLate);

        System.out.println(
            regNo
            + " | Total Fee: Rs "
            + totalFee
            + " | Late Fee: Rs "
            + lateFee
        );
    }

    public static void main(String[] args) {

        String[] regNos = {
            "RA001",
            "RA002",
            "RA003",
            "RA004"
        };

        double[] totalFees = {
            200000,
            150000,
            180000,
            220000
        };

        int[] daysLate = {
            10,
            0,
            -2,
            5
        };

        for (int i = 0; i < regNos.length; i++) {

            LateFeeAccount account =
                new LateFeeAccount(
                    regNos[i],
                    totalFees[i]
                );

            account.printSummary(daysLate[i]);
        }
    }
}