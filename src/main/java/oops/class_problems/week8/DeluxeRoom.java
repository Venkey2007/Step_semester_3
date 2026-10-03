package oops.class_problems.week8;

public class DeluxeRoom extends Room {

    private static final double PRICE_PER_NIGHT = 150.0;

    public DeluxeRoom(String roomNumber) {
        super(roomNumber);
    }

    @Override
    public double calculatePrice(int nights) {
        return PRICE_PER_NIGHT * nights;
    }
}
