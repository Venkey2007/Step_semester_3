public class Employee {

    private String employeeId;
    private double salary;

    public Employee(String employeeId, double salary) {
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public void raiseSalary(double salary) {
        this.salary = this.salary + salary;
    }

    public void printSalary() {
        System.out.println(
            employeeId + " | Final Salary: Rs " + salary
        );
    }

    public static void main(String[] args) {

        double[] salaries = {
            40000,
            55000,
            62000,
            48000
        };

        String[] employeeIds = {
            "E-101",
            "E-102",
            "E-103",
            "E-104"
        };

        Employee[] employees = new Employee[salaries.length];

        for (int i = 0; i < employees.length; i++) {

            employees[i] =
                new Employee(employeeIds[i], salaries[i]);

            employees[i].raiseSalary(5000);
            employees[i].printSalary();
        }
    }
}