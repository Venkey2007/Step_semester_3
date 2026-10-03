package oops.class_problems.week8;

public class SUV extends Vehicle {

    private static final double PRICE_PER_DAY = 70.0;

    public SUV(String vehicleId, String model) {
        super(vehicleId, model);
    }

    @Override
    public double calculatePrice(int days) {
        return PRICE_PER_DAY * days;
    }
}
