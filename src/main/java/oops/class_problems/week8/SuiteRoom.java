package oops.class_problems.week8;

public class SuiteRoom extends Room {

    private static final double PRICE_PER_NIGHT = 250.0;

    public SuiteRoom(String roomNumber) {
        super(roomNumber);
    }

    @Override
    public double calculatePrice(int nights) {
        return PRICE_PER_NIGHT * nights;
    }
}
