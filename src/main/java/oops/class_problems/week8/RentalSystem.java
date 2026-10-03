package oops.class_problems.week8;

import java.util.ArrayList;
import java.util.List;

public class RentalSystem {

    private List<Rental> rentals = new ArrayList<>();

    public Rental rentVehicle(Vehicle vehicle, Customer customer, int days) {

        if (!vehicle.isAvailable()) {
            System.out.println(
                "Vehicle " + vehicle.getModel() + " is not available."
            );
            return null;
        }

        if (days <= 0) {
            System.out.println("Rental duration must be greater than 0.");
            return null;
        }

        vehicle.setAvailable(false);

        Rental rental = new Rental(vehicle, customer, days);
        rentals.add(rental);

        System.out.println(
            customer.getName() + " rented " + vehicle.getModel()
        );

        return rental;
    }

    public void returnVehicle(Rental rental) {

        if (rental == null) {
            System.out.println("Invalid rental.");
            return;
        }

        if (!rental.isActive()) {
            System.out.println("This rental is already completed.");
            return;
        }

        rental.completeRental();

        System.out.println(
            rental.getVehicle().getModel() + " has been returned."
        );
    }

    public void displayAllRentals() {
        for (Rental rental : rentals) {
            System.out.println("-------------------------");
            rental.displayRentalDetails();
        }
    }
}