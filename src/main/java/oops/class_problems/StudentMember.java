package oops.class_problems;

public class StudentMember extends LibraryMember {

    private String course;

    public StudentMember(String memberId, int borrowLimit, String course) {
        super(memberId, borrowLimit);
        this.course = course;
    }

    @Override
    public void borrowBook() {
        super.borrowBook();
    }

    @Override
    protected void chargeFine(int amount) {
        super.chargeFine(amount / 2);
    }

    @Override
    public String displayInfo() {
        return "Student Member | Course: "
                + course
                + " | Books Borrowed: "
                + booksBorrowed;
    }

    public String getCourse() {
        return course;
    }
}