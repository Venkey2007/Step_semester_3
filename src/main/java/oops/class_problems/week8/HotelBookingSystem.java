package oops.class_problems.week8;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class HotelBookingSystem {

    private List<Reservation> reservations = new ArrayList<>();

    public Reservation bookRoom(
            Room room,
            Customer customer,
            LocalDate checkInDate,
            LocalDate checkOutDate) {

        if (!room.isAvailable()) {
            System.out.println(
                    "Room " + room.getRoomNumber() + " is not available."
            );
            return null;
        }

        if (!checkOutDate.isAfter(checkInDate)) {
            System.out.println(
                    "Check-out date must be after check-in date."
            );
            return null;
        }

        long nights =
                java.time.temporal.ChronoUnit.DAYS.between(
                        checkInDate,
                        checkOutDate
                );

        room.setAvailable(false);

        Reservation reservation = new Reservation(
                room,
                customer,
                checkInDate,
                checkOutDate
        );

        reservations.add(reservation);

        System.out.println(
                customer.getName()
                + " booked room "
                + room.getRoomNumber()
                + " for "
                + nights
                + " nights."
        );

        return reservation;
    }

    public void cancelReservation(
            Reservation reservation,
            LocalDate cancellationDate) {

        if (reservation == null) {
            System.out.println("Invalid reservation.");
            return;
        }

        if (reservation.getStatus() == Reservation.Status.CANCELLED) {
            System.out.println("Reservation is already cancelled.");
            return;
        }

        if (!cancellationDate.isBefore(
                reservation.getCheckInDate())) {

            System.out.println(
                    "Reservation can only be cancelled before check-in."
            );
            return;
        }

        reservation.cancel();
    }

    public void displayAllReservations() {

        for (Reservation reservation : reservations) {
            System.out.println("-------------------------");
            reservation.displayReservation();
        }
    }
}
