package oops.class_problems.week8;

public class ShortAnswerQuestion extends Question {

    public ShortAnswerQuestion(String questionText, String correctAnswer) {
        super(questionText, correctAnswer);
    }

    @Override
    public boolean evaluateAnswer(String answer) {
        return getCorrectAnswer().equalsIgnoreCase(answer.trim());
    }
}
