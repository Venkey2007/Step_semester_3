package oops.assigment_problems;

public class TrackingManager {

    public static String getLocationIfTrackable(Object o) {

        if (o instanceof Trackable) {
            Trackable trackable = (Trackable) o;
            return trackable.getLocation();
        }

        return "Tracking not available";
    }
}