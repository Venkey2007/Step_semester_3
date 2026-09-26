package oops.class_problems;

public abstract class KitchenTool {

    private int speedLevel;

    public KitchenTool() {
        speedLevel = 1;
    }

    public abstract String prepare();

    public int getSpeedLevel() {
        return speedLevel;
    }

    public void setSpeedLevel(int speedLevel) {
        if (speedLevel < 1 || speedLevel > 5) {
            throw new IllegalArgumentException("Speed level must be between 1 and 5");
        }

        this.speedLevel = speedLevel;
    }
}