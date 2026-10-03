package oops.class_problems.week8;

public class LeaveRequestDemo {

    public static void main(String[] args) {

        Employee fullTimeEmployee =
                new FullTimeEmployee("E1", "Alice");

        Employee partTimeEmployee =
                new PartTimeEmployee("E2", "Bob");

        Employee contractor =
                new Contractor("E3", "Charlie");

        System.out.println("1. Full-time employee requests 5 days:");
        LeaveRequest request1 =
                new LeaveRequest(fullTimeEmployee, 5);
        request1.displayRequest();

        System.out.println("\nReviewing request:");
        request1.approve();
        request1.displayRequest();

        System.out.println("\n2. Part-time employee requests 12 days:");
        LeaveRequest request2 =
                new LeaveRequest(partTimeEmployee, 12);
        request2.displayRequest();

        System.out.println("\nReviewing request:");
        request2.approve();
        request2.displayRequest();

        System.out.println("\n3. Contractor requests 3 days:");
        LeaveRequest request3 =
                new LeaveRequest(contractor, 3);
        request3.displayRequest();

        System.out.println("\nReviewing request:");
        request3.reject();
        request3.displayRequest();

        System.out.println("\n4. Attempting to change rejected request:");
        request3.approve();
    }
}
