package oops.assigment_problems;

public class ScoutDrone extends Drone {

    private String id;

    public ScoutDrone(String id) {
        this.id = id;
    }

    @Override
    public String fly() {
        return "Scout drone " + id + " flying";
    }
}