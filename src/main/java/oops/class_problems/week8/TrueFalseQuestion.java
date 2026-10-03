package oops.class_problems.week8;

public class TrueFalseQuestion extends Question {

    public TrueFalseQuestion(String questionText, String correctAnswer) {
        super(questionText, correctAnswer);
    }

    @Override
    public boolean evaluateAnswer(String answer) {
        return getCorrectAnswer().equalsIgnoreCase(answer);
    }
}
