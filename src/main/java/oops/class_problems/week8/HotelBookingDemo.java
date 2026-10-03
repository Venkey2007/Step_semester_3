package oops.class_problems.week8;

import java.time.LocalDate;

public class HotelBookingDemo {

    public static void main(String[] args) {

        HotelBookingSystem bookingSystem =
                new HotelBookingSystem();

        Customer customer1 =
                new Customer("C1", "Alice");

        Customer customer2 =
                new Customer("C2", "Bob");

        Room standardRoom =
                new StandardRoom("101");

        Room deluxeRoom =
                new DeluxeRoom("202");

        Room suiteRoom =
                new SuiteRoom("303");

        LocalDate checkIn =
                LocalDate.of(2026, 10, 10);

        LocalDate checkOut =
                LocalDate.of(2026, 10, 13);

        System.out.println("1. Alice books Standard Room:");

        Reservation reservation1 =
                bookingSystem.bookRoom(
                        standardRoom,
                        customer1,
                        checkIn,
                        checkOut
                );

        System.out.println("\n2. Bob attempts to book the same room:");

        bookingSystem.bookRoom(
                standardRoom,
                customer2,
                checkIn,
                checkOut
        );

        System.out.println("\n3. Bob books a Deluxe Room:");

        Reservation reservation2 =
                bookingSystem.bookRoom(
                        deluxeRoom,
                        customer2,
                        checkIn,
                        checkOut
                );

        System.out.println("\n4. Cancelling Alice's reservation:");

        bookingSystem.cancelReservation(
                reservation1,
                LocalDate.of(2026, 10, 5)
        );

        System.out.println("\n5. Reservations:");

        bookingSystem.displayAllReservations();
    }
}
