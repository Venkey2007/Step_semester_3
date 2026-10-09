package oops.assigment_problems.week8;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class TicketBookingSystem {

    public Booking bookSeats(Customer customer, Show show,
                             List<String> seatNumbers) {

        if (seatNumbers == null || seatNumbers.isEmpty()) {
            System.out.println("Booking denied: Select at least one seat.");
            return null;
        }

        if (seatNumbers.size() > 6) {
            System.out.println("Booking denied: Maximum 6 seats per booking.");
            return null;
        }

        if (LocalDateTime.now().isAfter(show.getStartTime())) {
            System.out.println("Booking denied: Show has already started.");
            return null;
        }

        List<Seat> selectedSeats = new ArrayList<>();

        for (String seatNumber : seatNumbers) {
            Seat seat = show.findSeat(seatNumber);

            if (seat == null) {
                System.out.println("Booking denied: Seat "
                        + seatNumber + " does not exist.");
                return null;
            }

            if (isSeatBooked(show, seatNumber)) {
                System.out.println("Booking denied: Seat "
                        + seatNumber + " is already booked.");
                return null;
            }

            selectedSeats.add(seat);
        }

        Booking booking = new Booking(customer, show, selectedSeats);

        System.out.println(customer.getName() + " booked "
                + seatNumbers + " for " + show.getShowName());

        System.out.println("Total: ₹" + booking.calculateTotal());

        return booking;
    }

    private List<Booking> bookings = new ArrayList<>();

    public void saveBooking(Booking booking) {
        if (booking != null) {
            bookings.add(booking);
        }
    }

    private boolean isSeatBooked(Show show, String seatNumber) {
        for (Booking booking : bookings) {
            if (booking.getShow() == show && !booking.isCancelled()) {
                for (Seat seat : booking.getSelectedSeats()) {
                    if (seat.getSeatNumber().equals(seatNumber)) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    public void cancelBooking(Booking booking) {

        if (booking == null) {
            return;
        }

        if (LocalDateTime.now().isAfter(booking.getShow().getStartTime())) {
            System.out.println("Cancellation denied: Show has already started.");
            return;
        }

        booking.cancel();

        System.out.println("Booking cancelled for "
                + booking.getCustomer().getName());

        System.out.println("Seats released: "
                + booking.getSelectedSeats());
    }
}
