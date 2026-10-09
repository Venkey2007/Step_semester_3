
package oops.assigment_problems.week8;

public class AnnualPlan implements MembershipPlan {

    @Override
    public String getName() {
        return "Annual";
    }

    @Override
    public int getDurationMonths() {
        return 12;
    }

    @Override
    public double calculateFee() {
        return 9000.0;
    }
}


