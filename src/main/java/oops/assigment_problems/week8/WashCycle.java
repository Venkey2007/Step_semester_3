package oops.assigment_problems.week8;

public class WashCycle {

    private Student student;
    private WashingMachine machine;
    private WashType washType;
    private boolean completed;

    public WashCycle(Student student, WashingMachine machine, WashType washType) {
        this.student = student;
        this.machine = machine;
        this.washType = washType;
        this.completed = false;
    }

    public Student getStudent() {
        return student;
    }

    public WashingMachine getMachine() {
        return machine;
    }

    public WashType getWashType() {
        return washType;
    }

    public double calculateCharge() {
        return washType.getCharge();
    }

    public boolean isCompleted() {
        return completed;
    }

    public void completeCycle() {
        if (completed) {
            throw new IllegalStateException("Wash cycle is already completed.");
        }

        machine.completeWash();
        completed = true;
    }
}
