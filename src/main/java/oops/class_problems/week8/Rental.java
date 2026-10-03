package oops.class_problems.week8;

public class Rental {
    private Vehicle vehicle;
    private Customer customer;
    private int days;
    private double totalPrice;
    private boolean active;

    public Rental(Vehicle vehicle, Customer customer, int days) {
        this.vehicle = vehicle;
        this.customer = customer;
        this.days = days;
        this.totalPrice = vehicle.calculatePrice(days);
        this.active = true;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public Customer getCustomer() {
        return customer;
    }

    public int getDays() {
        return days;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public boolean isActive() {
        return active;
    }

    public void completeRental() {
        active = false;
        vehicle.setAvailable(true);
    }

    public void displayRentalDetails() {
        System.out.println("Customer: " + customer.getName());
        System.out.println("Vehicle: " + vehicle.getModel());
        System.out.println("Days: " + days);
        System.out.println("Total Price: $" + totalPrice);
        System.out.println("Rental Status: " + (active ? "Active" : "Completed"));
    }
}