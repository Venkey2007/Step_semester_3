package oops.class_problems;

public class HonorsStudentMember extends StudentMember {

    private int bonusLimit;

    public HonorsStudentMember(String memberId,
                               int borrowLimit,
                               String course,
                               int bonusLimit) {
        super(memberId, borrowLimit, course);
        this.bonusLimit = bonusLimit;
    }

    @Override
    public void borrowBook() {
        if (booksBorrowed < borrowLimit + bonusLimit) {
            booksBorrowed++;
        }
    }

    @Override
    public String displayInfo() {
        return "Honors Student Member | Course: "
                + getCourse()
                + " | Bonus Limit: "
                + bonusLimit
                + " | Books Borrowed: "
                + booksBorrowed;
    }

    public int getBonusLimit() {
        return bonusLimit;
    }
}