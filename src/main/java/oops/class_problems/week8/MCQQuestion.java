package oops.class_problems.week8;

public class MCQQuestion extends Question {

    private String[] options;

    public MCQQuestion(String questionText, String correctAnswer, String[] options) {
        super(questionText, correctAnswer);
        this.options = options;
    }

    public String[] getOptions() {
        return options;
    }

    @Override
    public boolean evaluateAnswer(String answer) {
        return getCorrectAnswer().equalsIgnoreCase(answer);
    }
}
