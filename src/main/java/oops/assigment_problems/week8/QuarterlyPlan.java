
package oops.assigment_problems.week8;

public class QuarterlyPlan implements MembershipPlan {

    @Override
    public String getName() {
        return "Quarterly";
    }

    @Override
    public int getDurationMonths() {
        return 3;
    }

    @Override
    public double calculateFee() {
        return 2700.0;
    }
}


