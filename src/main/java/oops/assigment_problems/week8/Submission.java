package oops.assigment_problems.week8;

import java.time.LocalDate;

public class Submission {

    private Student student;
    private Assignment assignment;
    private LocalDate submissionDate;
    private String status;
    private double finalMarks;

    public Submission(Student student, Assignment assignment,
                      LocalDate submissionDate) {
        this.student = student;
        this.assignment = assignment;
        this.submissionDate = submissionDate;
        this.status = "Submitted";
        this.finalMarks = 0;
    }

    public Student getStudent() {
        return student;
    }

    public Assignment getAssignment() {
        return assignment;
    }

    public LocalDate getSubmissionDate() {
        return submissionDate;
    }

    public String getStatus() {
        return status;
    }

    public double getFinalMarks() {
        return finalMarks;
    }

    public void grade(double awardedMarks) {
        if (!status.equals("Submitted")) {
            throw new IllegalStateException(
                    "Only submitted work can be graded."
            );
        }

        if (awardedMarks < 0 || awardedMarks > assignment.getMaxMarks()) {
            throw new IllegalArgumentException(
                    "Awarded marks must be between 0 and max marks."
            );
        }

      long daysLate = submissionDate.toEpochDay()
        - assignment.getDueDate().toEpochDay();

int lateDays = (int) Math.max(0L, daysLate);
        finalMarks = assignment.getAssignmentType()
                .calculateFinalMarks(awardedMarks, lateDays);

        status = "Graded";
    }

    public void resubmit(LocalDate newSubmissionDate) {
        if (status.equals("Graded")) {
            throw new IllegalStateException(
                    "Resubmission is not allowed after grading."
            );
        }

        submissionDate = newSubmissionDate;
    }
}
