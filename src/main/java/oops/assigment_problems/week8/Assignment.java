package oops.assigment_problems.week8;

import java.time.LocalDate;

public class Assignment {

    private String title;
    private LocalDate dueDate;
    private double maxMarks;
    private AssignmentType assignmentType;

    public Assignment(String title, LocalDate dueDate,
                      double maxMarks, AssignmentType assignmentType) {
        this.title = title;
        this.dueDate = dueDate;
        this.maxMarks = maxMarks;
        this.assignmentType = assignmentType;
    }

    public String getTitle() {
        return title;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public double getMaxMarks() {
        return maxMarks;
    }

    public AssignmentType getAssignmentType() {
        return assignmentType;
    }
}
