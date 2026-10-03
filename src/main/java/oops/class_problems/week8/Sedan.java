package oops.class_problems.week8;

public class Sedan extends Vehicle {

    private static final double PRICE_PER_DAY = 50.0;

    public Sedan(String vehicleId, String model) {
        super(vehicleId, model);
    }

    @Override
    public double calculatePrice(int days) {
        return PRICE_PER_DAY * days;
    }
}