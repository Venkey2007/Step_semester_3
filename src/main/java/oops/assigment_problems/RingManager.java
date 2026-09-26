package oops.assigment_problems;

public class RingManager {

    public static void ringAll(Ringable[] devices) {

        for (Ringable device : devices) {
            System.out.println(device.ring());
        }
    }
}