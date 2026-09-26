package oops.class_problems;

public class FacultyMember extends LibraryMember {

    private String department;

    public FacultyMember(String memberId,
                          int borrowLimit,
                          String department) {
        super(memberId, borrowLimit);
        this.department = department;
    }

    public FacultyMember(int borrowLimit, String department) {
        super(borrowLimit);
        this.department = department;
    }

    @Override
    public String displayInfo() {
        return "Faculty Member | Department: "
                + department
                + " | Books Borrowed: "
                + booksBorrowed;
    }

    public String getDepartment() {
        return department;
    }
}