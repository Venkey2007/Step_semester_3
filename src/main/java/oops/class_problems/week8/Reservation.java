package oops.class_problems.week8;

import java.time.LocalDate;

public class Reservation {

    public enum Status {
        ACTIVE,
        CANCELLED
    }

    private Room room;
    private Customer customer;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;
    private double totalPrice;
    private Status status;

    public Reservation(
            Room room,
            Customer customer,
            LocalDate checkInDate,
            LocalDate checkOutDate) {

        this.room = room;
        this.customer = customer;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;

        long nights =
                java.time.temporal.ChronoUnit.DAYS.between(
                        checkInDate,
                        checkOutDate
                );

        this.totalPrice = room.calculatePrice((int) nights);
        this.status = Status.ACTIVE;
    }

    public Room getRoom() {
        return room;
    }

    public Customer getCustomer() {
        return customer;
    }

    public LocalDate getCheckInDate() {
        return checkInDate;
    }

    public LocalDate getCheckOutDate() {
        return checkOutDate;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public Status getStatus() {
        return status;
    }

    public void cancel() {
        if (status == Status.CANCELLED) {
            System.out.println("Reservation is already cancelled.");
            return;
        }

        status = Status.CANCELLED;
        room.setAvailable(true);
        System.out.println("Reservation cancelled successfully.");
    }

    public void displayReservation() {
        System.out.println("Customer: " + customer.getName());
        System.out.println("Room: " + room.getRoomNumber());
        System.out.println("Check-in: " + checkInDate);
        System.out.println("Check-out: " + checkOutDate);
        System.out.println("Total Price: $" + totalPrice);
        System.out.println("Status: " + status);
    }
}
