package oops.assigment_problems.week8;

import java.time.LocalDate;

public class SubmissionDemo {

    public static void main(String[] args) {

        SubmissionPortal portal = new SubmissionPortal();

        Student asha = new Student("Asha");
        Student ravi = new Student("Ravi");

        Assignment codingAssignment = new Assignment(
                "Coding Assignment",
                LocalDate.of(2026, 3, 10),
                50,
                new CodingAssignment()
        );

        Assignment writtenAssignment = new Assignment(
                "Written Assignment",
                LocalDate.of(2026, 3, 12),
                50,
                new WrittenAssignment()
        );

        Submission ashaSubmission = portal.submit(
                asha,
                codingAssignment,
                LocalDate.of(2026, 3, 10)
        );

        System.out.println();

        Submission raviSubmission = portal.submit(
                ravi,
                writtenAssignment,
                LocalDate.of(2026, 3, 14)
        );

        System.out.println();

        portal.grade(ashaSubmission, 45);

        portal.grade(raviSubmission, 40);

        System.out.println();

        try {
            ashaSubmission.resubmit(LocalDate.of(2026, 3, 11));
        } catch (IllegalStateException e) {
            System.out.println("Asha resubmission blocked: " + e.getMessage());
        }
    }
}
