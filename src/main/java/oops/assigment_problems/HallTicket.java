package oops.assigment_problems;

public class HallTicket {

    String studentName;
    String examHall;

    HallTicket(String studentName, String examHall) {
        this.studentName = studentName;
        this.examHall = examHall;
    }

    void printDetails() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Exam Hall: " + examHall);
        System.out.println();
    }

    public static void main(String[] args) {

        HallTicket ticket1 = new HallTicket("Rahul", "Hall A");

        HallTicket ticket2 = ticket1;

        ticket2.studentName = "Priya";

        ticket1.printDetails();
        ticket2.printDetails();
    }
}