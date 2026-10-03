package oops.assigment_problems.week8;

public class WrittenAssignment implements AssignmentType {

    @Override
    public String getName() {
        return "Written";
    }

    @Override
    public double calculateFinalMarks(double awardedMarks, int lateDays) {
        double penalty = awardedMarks * 0.20 * lateDays;
        return Math.max(0, awardedMarks - penalty);
    }
}
