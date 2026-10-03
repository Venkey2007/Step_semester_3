package oops.class_problems.week8;

public class StandardRoom extends Room {

    private static final double PRICE_PER_NIGHT = 100.0;

    public StandardRoom(String roomNumber) {
        super(roomNumber);
    }

    @Override
    public double calculatePrice(int nights) {
        return PRICE_PER_NIGHT * nights;
    }
}