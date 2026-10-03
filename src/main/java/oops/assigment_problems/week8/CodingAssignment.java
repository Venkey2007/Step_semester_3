package oops.assigment_problems.week8;

public class CodingAssignment implements AssignmentType {

    @Override
    public String getName() {
        return "Coding";
    }

    @Override
    public double calculateFinalMarks(double awardedMarks, int lateDays) {
        double penalty = awardedMarks * 0.10 * lateDays;
        return Math.max(0, awardedMarks - penalty);
    }
}
