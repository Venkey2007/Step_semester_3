package oops.class_problems.week8;

public class LeaveRequest {

    public enum Status {
        PENDING,
        APPROVED,
        REJECTED
    }

    private Employee employee;
    private int days;
    private Status status;

    public LeaveRequest(Employee employee, int days) {
        this.employee = employee;
        this.days = days;
        this.status = Status.PENDING;
    }

    public Employee getEmployee() {
        return employee;
    }

    public int getDays() {
        return days;
    }

    public Status getStatus() {
        return status;
    }

    public void approve() {
        if (status != Status.PENDING) {
            System.out.println("Request has already been reviewed.");
            return;
        }

        if (!employee.canTakeLeave(days)) {
            System.out.println("Leave policy does not allow this request.");
            return;
        }

        status = Status.APPROVED;
        System.out.println("Leave request approved.");
    }

    public void reject() {
        if (status != Status.PENDING) {
            System.out.println("Request has already been reviewed.");
            return;
        }

        status = Status.REJECTED;
        System.out.println("Leave request rejected.");
    }

    public void displayRequest() {
        System.out.println("Employee: " + employee.getName());
        System.out.println("Leave Days: " + days);
        System.out.println("Status: " + status);
    }
}
