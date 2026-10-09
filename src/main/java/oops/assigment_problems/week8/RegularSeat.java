package oops.assigment_problems.week8;

public class RegularSeat implements Seat {

    private String seatNumber;

    public RegularSeat(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    @Override
    public String getSeatNumber() {
        return seatNumber;
    }

    @Override
    public String getType() {
        return "Regular";
    }

    @Override
    public double getPrice() {
        return 150;
    }
}
