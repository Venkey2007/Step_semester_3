package oops.assigment_problems;

public class LoanReceipt {

    private final String memberId;
    private final String[] bookIds;

    public LoanReceipt(String memberId, String[] bookIds) {
        this.memberId = memberId;

        if (bookIds == null) {
            this.bookIds = new String[0];
        } else {
            this.bookIds = bookIds.clone();
        }
    }

    public String getMemberId() {
        return memberId;
    }

    public String[] getBookIds() {
        return bookIds.clone();
    }

    public LoanReceipt withCorrectedBookId(int index, String newId) {
        if (index < 0 || index >= bookIds.length) {
            return new LoanReceipt(memberId, bookIds);
        }

        String[] correctedIds = bookIds.clone();
        correctedIds[index] = newId;

        return new LoanReceipt(memberId, correctedIds);
    }
}