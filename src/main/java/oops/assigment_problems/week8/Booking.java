package oops.assigment_problems.week8;

import java.util.ArrayList;
import java.util.List;

public class Booking {

    private Customer customer;
    private Show show;
    private List<Seat> selectedSeats;
    private boolean cancelled;

    public Booking(Customer customer, Show show, List<Seat> selectedSeats) {
        this.customer = customer;
        this.show = show;
        this.selectedSeats = new ArrayList<>(selectedSeats);
        this.cancelled = false;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Show getShow() {
        return show;
    }

    public List<Seat> getSelectedSeats() {
        return selectedSeats;
    }

    public boolean isCancelled() {
        return cancelled;
    }

    public double calculateTotal() {
        double total = 0;

        for (Seat seat : selectedSeats) {
            total += seat.getPrice();
        }

        return total;
    }

    public void cancel() {
        if (cancelled) {
            throw new IllegalStateException("Booking is already cancelled.");
        }

        cancelled = true;
    }
}
