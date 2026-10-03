package oops.class_problems.week8;

public class Contractor extends Employee {

    private static final int MAX_LEAVE_DAYS = 5;

    public Contractor(String employeeId, String name) {
        super(employeeId, name);
    }

    @Override
    public boolean canTakeLeave(int days) {
        return days > 0 && days <= MAX_LEAVE_DAYS;
    }
}
