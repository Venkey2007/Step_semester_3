package oops.assigment_problems.week8;

import java.time.LocalDate;

public class SubmissionPortal {

    public Submission submit(Student student, Assignment assignment,
                             LocalDate submissionDate) {

        Submission submission =
                new Submission(student, assignment, submissionDate);

        System.out.println(
                student.getName() + " submitted "
                        + assignment.getTitle()
                        + " on " + submissionDate
        );

        return submission;
    }

    public void grade(Submission submission, double awardedMarks) {

        submission.grade(awardedMarks);

        System.out.println(
                submission.getStudent().getName()
                        + " received "
                        + submission.getFinalMarks()
                        + " marks for "
                        + submission.getAssignment().getTitle()
        );
    }
}
