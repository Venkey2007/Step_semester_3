package oops.class_problems;

public abstract class DeliveryNote {

    public DeliveryNote() {
    }

    public abstract String confirmDelivery();

    public String confirmDelivery(String signature) {
        return confirmDelivery() + ", signed by " + signature;
    }
}
