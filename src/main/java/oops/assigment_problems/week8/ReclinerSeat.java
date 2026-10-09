package oops.assigment_problems.week8;

public class ReclinerSeat implements Seat {

    private String seatNumber;

    public ReclinerSeat(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    @Override
    public String getSeatNumber() {
        return seatNumber;
    }

    @Override
    public String getType() {
        return "Recliner";
    }

    @Override
    public double getPrice() {
        return 400;
    }
}
