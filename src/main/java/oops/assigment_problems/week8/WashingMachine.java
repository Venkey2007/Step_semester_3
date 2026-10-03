package oops.assigment_problems.week8;

public class WashingMachine {

    private String machineId;
    private boolean busy;

    public WashingMachine(String machineId) {
        this.machineId = machineId;
        this.busy = false;
    }

    public String getMachineId() {
        return machineId;
    }

    public boolean isAvailable() {
        return !busy;
    }

    public void startWash() {
        if (busy) {
            throw new IllegalStateException("Machine " + machineId + " is already busy.");
        }

        busy = true;
    }

    public void completeWash() {
        if (!busy) {
            throw new IllegalStateException("Machine " + machineId + " is not currently running.");
        }

        busy = false;
    }
}