package oops.class_problems.week8;

public class OnlineExamDemo {

    public static void main(String[] args) {

        Student student = new Student("S1", "John");

        Exam exam = new Exam("EX1", "Java OOP Exam");

        Question q1 = new MCQQuestion(
                "Which keyword is used to inherit a class?",
                "extends",
                new String[]{"extends", "implements", "inherits", "super"}
        );

        Question q2 = new TrueFalseQuestion(
                "Java supports method overloading.",
                "true"
        );

        Question q3 = new ShortAnswerQuestion(
                "What is the keyword used to create an object?",
                "new"
        );

        exam.addQuestion(q1);
        exam.addQuestion(q2);
        exam.addQuestion(q3);

        Attempt attempt = new Attempt(student, exam);

        System.out.println("Student: " + student.getName());
        System.out.println("Exam: " + exam.getTitle());

        System.out.println("\nAnswering questions:");

        attempt.answerQuestion(q1, "extends");
        attempt.answerQuestion(q2, "true");
        attempt.answerQuestion(q3, "new");

        System.out.println("All questions answered.");

        System.out.println("\nSubmitting exam:");
        attempt.submit();

        System.out.println("\nAttempt Status: " + attempt.getStatus());

        System.out.println("\nQuestion Results:");
        attempt.displayResults();

        System.out.println("\nTrying to change an answer after submission:");
        attempt.answerQuestion(q1, "implements");
    }
}