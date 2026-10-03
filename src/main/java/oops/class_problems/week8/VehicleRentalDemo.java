package oops.class_problems.week8;

public class VehicleRentalDemo {

    public static void main(String[] args) {

        RentalSystem rentalSystem = new RentalSystem();

        Customer customer1 = new Customer("C1", "Customer 1");
        Customer customer2 = new Customer("C2", "Customer 2");
        Customer customer3 = new Customer("C3", "Customer 3");

        Vehicle sedanA = new Sedan("V1", "Sedan A");
        Vehicle suvB = new SUV("V2", "SUV B");

        System.out.println("1. Customer 1 rents Sedan A for 3 days:");
        Rental rental1 = rentalSystem.rentVehicle(sedanA, customer1, 3);

        System.out.println("\n2. Customer 2 attempts to rent Sedan A:");
        rentalSystem.rentVehicle(sedanA, customer2, 2);

        System.out.println("\n3. Customer 1 returns Sedan A:");
        rentalSystem.returnVehicle(rental1);

        System.out.println("\n4. Customer 3 rents SUV B for 5 days:");
        Rental rental2 = rentalSystem.rentVehicle(suvB, customer3, 5);

        System.out.println("\n5. Rental Details:");
        rentalSystem.displayAllRentals();
    }
}