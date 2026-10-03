package oops.class_problems.week8;

import java.util.ArrayList;
import java.util.List;

public class Exam {

    private String examId;
    private String title;
    private List<Question> questions;
    private boolean attemptSubmitted;

    public Exam(String examId, String title) {
        this.examId = examId;
        this.title = title;
        this.questions = new ArrayList<>();
        this.attemptSubmitted = false;
    }

    public void addQuestion(Question question) {
        questions.add(question);
    }

    public String getExamId() {
        return examId;
    }

    public String getTitle() {
        return title;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public boolean isAttemptSubmitted() {
        return attemptSubmitted;
    }

    public void markAttemptSubmitted() {
        attemptSubmitted = true;
    }
}