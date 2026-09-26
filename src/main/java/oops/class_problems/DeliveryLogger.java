package oops.class_problems;

public class DeliveryLogger {

    public static void logAll(DeliveryNote[] notes) {

        for (DeliveryNote note : notes) {
            System.out.println(note.confirmDelivery());
        }
    }
}