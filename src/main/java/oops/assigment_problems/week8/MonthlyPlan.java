
package oops.assigment_problems.week8;

public class MonthlyPlan implements MembershipPlan {

    @Override
    public String getName() {
        return "Monthly";
    }

    @Override
    public int getDurationMonths() {
        return 1;
    }

    @Override
    public double calculateFee() {
        return 1000.0;
    }
}
