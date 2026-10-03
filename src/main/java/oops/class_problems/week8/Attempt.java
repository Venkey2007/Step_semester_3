package oops.class_problems.week8;

import java.util.HashMap;
import java.util.Map;

public class Attempt {

    public enum Status {
        IN_PROGRESS,
        SUBMITTED
    }

    private Student student;
    private Exam exam;
    private Map<Question, String> answers;
    private Status status;

    public Attempt(Student student, Exam exam) {

        if (exam.isAttemptSubmitted()) {
            throw new IllegalStateException(
                    "This exam already has a submitted attempt."
            );
        }

        this.student = student;
        this.exam = exam;
        this.answers = new HashMap<>();
        this.status = Status.IN_PROGRESS;
    }

    public void answerQuestion(Question question, String answer) {

        if (status == Status.SUBMITTED) {
            System.out.println("Submitted answers cannot be changed.");
            return;
        }

        if (!exam.getQuestions().contains(question)) {
            System.out.println("Question does not belong to this exam.");
            return;
        }

        answers.put(question, answer);
    }

    public void submit() {

        if (status == Status.SUBMITTED) {
            System.out.println("This attempt has already been submitted.");
            return;
        }

        status = Status.SUBMITTED;
        exam.markAttemptSubmitted();

        System.out.println("Exam submitted successfully.");
    }

    public void displayResults() {

        if (status != Status.SUBMITTED) {
            System.out.println(
                    "Submit the exam before calculating the results."
            );
            return;
        }

        int correctAnswers = 0;

        for (Question question : exam.getQuestions()) {

            String answer = answers.get(question);

            boolean correct =
                    answer != null && question.evaluateAnswer(answer);

            if (correct) {
                correctAnswers++;
            }

            System.out.println(
                    question.getQuestionText()
                    + " -> "
                    + (correct ? "Correct" : "Incorrect")
            );
        }

        double score =
                (correctAnswers * 100.0) / exam.getQuestions().size();

        System.out.println("Overall Score: " + score + "%");
    }

    public double calculateScore() {

        if (status != Status.SUBMITTED) {
            System.out.println(
                    "Submit the exam before calculating the score."
            );
            return 0;
        }

        int correctAnswers = 0;

        for (Question question : exam.getQuestions()) {

            String answer = answers.get(question);

            if (answer != null && question.evaluateAnswer(answer)) {
                correctAnswers++;
            }
        }

        return (correctAnswers * 100.0)
                / exam.getQuestions().size();
    }

    public Status getStatus() {
        return status;
    }

    public Student getStudent() {
        return student;
    }

    public Exam getExam() {
        return exam;
    }
}