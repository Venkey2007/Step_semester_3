package oops.assigment_problems.week8;

public class PremiumSeat implements Seat {

    private String seatNumber;

    public PremiumSeat(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    @Override
    public String getSeatNumber() {
        return seatNumber;
    }

    @Override
    public String getType() {
        return "Premium";
    }

    @Override
    public double getPrice() {
        return 250;
    }
}
