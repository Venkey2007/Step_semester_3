package oops.class_problems;

public class BookingReceipt {

    private final String bookingId;
    private final String[] seatNumbers;

    public BookingReceipt(String bookingId, String[] seatNumbers) {
        this.bookingId = bookingId;

        if (seatNumbers == null) {
            this.seatNumbers = new String[0];
        } else {
            this.seatNumbers = seatNumbers.clone();
        }
    }

    public String getBookingId() {
        return bookingId;
    }

    public String[] getSeatNumbers() {
        return seatNumbers.clone();
    }

    public BookingReceipt withUpdatedSeat(int index, String newSeat) {
        if (index < 0 || index >= seatNumbers.length) {
            return new BookingReceipt(bookingId, seatNumbers);
        }

        String[] updatedSeats = seatNumbers.clone();
        updatedSeats[index] = newSeat;

        return new BookingReceipt(bookingId, updatedSeats);
    }
}