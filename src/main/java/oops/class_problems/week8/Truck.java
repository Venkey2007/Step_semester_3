package oops.class_problems.week8;

public class Truck extends Vehicle {

    private static final double PRICE_PER_DAY = 90.0;

    public Truck(String vehicleId, String model) {
        super(vehicleId, model);
    }

    @Override
    public double calculatePrice(int days) {
        return PRICE_PER_DAY * days;
    }
}