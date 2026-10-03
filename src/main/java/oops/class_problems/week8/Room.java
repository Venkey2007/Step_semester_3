package oops.class_problems.week8;

public abstract class Room {

    private String roomNumber;
    private boolean available;

    public Room(String roomNumber) {
        this.roomNumber = roomNumber;
        this.available = true;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public abstract double calculatePrice(int nights);
}
