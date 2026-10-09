package oops.assigment_problems.week8;

import java.time.LocalDateTime;
import java.util.Arrays;

public class TicketBookingDemo {

    public static void main(String[] args) {

        TicketBookingSystem bookingSystem = new TicketBookingSystem();

        Show show = new Show(
                "Campus Premiere",
                LocalDateTime.now().plusHours(2)
        );

        show.addSeat(new RegularSeat("A1"));
        show.addSeat(new RegularSeat("A2"));
        show.addSeat(new PremiumSeat("F5"));
        show.addSeat(new ReclinerSeat("R1"));

        Customer asha = new Customer("Asha");
        Customer ravi = new Customer("Ravi");
        Customer neha = new Customer("Neha");

        // Asha books A1, A2 and F5
        Booking ashaBooking = bookingSystem.bookSeats(
                asha,
                show,
                Arrays.asList("A1", "A2", "F5")
        );
        bookingSystem.saveBooking(ashaBooking);

        System.out.println();

        // Ravi attempts already booked A2
        Booking raviFirstBooking = bookingSystem.bookSeats(
                ravi,
                show,
                Arrays.asList("A2")
        );

        System.out.println();

        // Ravi books R1
        Booking raviBooking = bookingSystem.bookSeats(
                ravi,
                show,
                Arrays.asList("R1")
        );
        bookingSystem.saveBooking(raviBooking);

        System.out.println();

        // Asha cancels her booking
        bookingSystem.cancelBooking(ashaBooking);

        System.out.println();

        // Neha books released A2
        Booking nehaBooking = bookingSystem.bookSeats(
                neha,
                show,
                Arrays.asList("A2")
        );
        bookingSystem.saveBooking(nehaBooking);
    }
}