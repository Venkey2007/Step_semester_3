package oops.assigment_problems.week8;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Show {

    private String showName;
    private LocalDateTime startTime;
    private List<Seat> seats;

    public Show(String showName, LocalDateTime startTime) {
        this.showName = showName;
        this.startTime = startTime;
        this.seats = new ArrayList<>();
    }

    public String getShowName() {
        return showName;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void addSeat(Seat seat) {
        seats.add(seat);
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public Seat findSeat(String seatNumber) {
        for (Seat seat : seats) {
            if (seat.getSeatNumber().equals(seatNumber)) {
                return seat;
            }
        }

        return null;
    }
}
