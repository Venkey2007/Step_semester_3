package oops.assigment_problems;

public class Employee {

    String name;
    double salary;

    Employee() {
        name = "Unknown";
        salary = 0.0;
    }

    Employee(String name) {
        this.name = name;
        salary = 0.0;
    }

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println();
    }

    public static void main(String[] args) {

        Employee employee1 = new Employee();
        Employee employee2 = new Employee("Rahul");
        Employee employee3 = new Employee("Priya", 50000);

        employee1.printDetails();
        employee2.printDetails();
        employee3.printDetails();
    }
}