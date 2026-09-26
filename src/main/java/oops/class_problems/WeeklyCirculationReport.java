package oops.class_problems;

public class LibraryMember {

    private static int membersEnrolled = 0;

    public final String memberNumber;

    private String memberId;
    protected int borrowLimit;
    protected int booksBorrowed;

    private int[] fineHistory;
    private int fineCount;
    private int totalFine;

    private String[] borrowedGenres;

    public LibraryMember(String memberId, int borrowLimit) {

        if (memberId == null
                || memberId.trim().isEmpty()
                || memberId.length() < 4) {
            throw new IllegalArgumentException("Invalid member ID");
        }

        if (borrowLimit <= 0) {
            throw new IllegalArgumentException("Borrow limit must be positive");
        }

        this.memberId = memberId;
        this.borrowLimit = borrowLimit;
        this.booksBorrowed = 0;

        membersEnrolled++;
        this.memberNumber = "LIB-" + (100 + membersEnrolled);

        this.fineHistory = new int[10];
        this.fineCount = 0;
        this.totalFine = 0;

        this.borrowedGenres = new String[borrowLimit];
    }

    public LibraryMember(int borrowLimit) {

        if (borrowLimit <= 0) {
            throw new IllegalArgumentException("Borrow limit must be positive");
        }

        this.memberId = "LIB-MEMBER";
        this.borrowLimit = borrowLimit;
        this.booksBorrowed = 0;

        membersEnrolled++;
        this.memberNumber = "LIB-" + (100 + membersEnrolled);

        this.fineHistory = new int[10];
        this.fineCount = 0;
        this.totalFine = 0;

        this.borrowedGenres = new String[borrowLimit];
    }

    public void borrowBook() {

        if (booksBorrowed < borrowLimit) {
            booksBorrowed++;
        }
    }

    public void borrowBook(String genre) {

        if (booksBorrowed < borrowLimit) {
            borrowedGenres[booksBorrowed] = genre;
            borrowBook();
        }
    }

    public int getBooksBorrowed() {
        return booksBorrowed;
    }

    public String getMemberId() {
        return memberId;
    }

    protected void chargeFine(int amount) {

        if (fineCount < fineHistory.length) {
            fineHistory[fineCount] = amount;
            fineCount++;
            totalFine += amount;
        }
    }

    public int[] getFineHistory() {

        int[] result = new int[fineCount];

        for (int i = 0; i < fineCount; i++) {
            result[i] = fineHistory[i];
        }

        return result;
    }

    public int getTotalFine() {
        return totalFine;
    }

    public String displayInfo() {
        return "General Member | Books Borrowed: "
                + booksBorrowed;
    }

    public static String enrollBatch(String[] memberIds, int borrowLimit) {

        int enrolled = 0;
        int rejected = 0;

        if (memberIds != null) {
            for (String memberId : memberIds) {
                try {
                    new LibraryMember(memberId, borrowLimit);
                    enrolled++;
                } catch (IllegalArgumentException e) {
                    rejected++;
                }
            }
        }

        return "Enrolled: " + enrolled
                + " | Rejected: " + rejected;
    }

    public static boolean isValidRenewalCode(String code) {

        if (code == null || code.length() != 4) {
            return false;
        }

        return code.charAt(0) == 'R'
                && Character.isDigit(code.charAt(1))
                && Character.isDigit(code.charAt(2))
                && Character.isUpperCase(code.charAt(3));
    }

    public static int getMembersEnrolled() {
        return membersEnrolled;
    }
}