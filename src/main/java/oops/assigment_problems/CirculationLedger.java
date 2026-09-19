package oops.assigment_problems;

public class CirculationLedger {

    private static String ledgerStatus;

    static {
        ledgerStatus = "READY";
    }

    public static String getLedgerStatus() {
        return ledgerStatus;
    }
}