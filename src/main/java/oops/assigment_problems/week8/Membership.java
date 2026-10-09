
package oops.assigment_problems.week8;

public class Membership {

    private String membershipId;
    private Member member;
    private MembershipPlan plan;
    private String status;

    public Membership(String membershipId, Member member,
                      MembershipPlan plan) {
        this.membershipId = membershipId;
        this.member = member;
        this.plan = plan;
        this.status = "Active";
    }

    public String getMembershipId() {
        return membershipId;
    }

    public Member getMember() {
        return member;
    }

    public MembershipPlan getPlan() {
        return plan;
    }

    public String getStatus() {
        return status;
    }

    public double calculateFee() {
        return plan.calculateFee();
    }

    public void freeze() {
        if (status.equals("Expired")) {
            System.out.println("Expired membership cannot be frozen.");
            return;
        }

        if (status.equals("Frozen")) {
            System.out.println("Membership is already frozen.");
            return;
        }

        status = "Frozen";
        System.out.println(member.getName() + "'s membership is frozen.");
    }

    public void unfreeze() {
        if (status.equals("Expired")) {
            System.out.println("Expired membership cannot be unfrozen.");
            return;
        }

        if (status.equals("Active")) {
            System.out.println("Membership is already active.");
            return;
        }

        status = "Active";
        System.out.println(member.getName() + "'s membership is active again.");
    }

    public void expire() {
        status = "Expired";
        System.out.println(member.getName() + "'s membership has expired.");
    }

    public void checkIn() {
        if (status.equals("Active")) {
            System.out.println(member.getName() + " checked in successfully.");
        } else {
            System.out.println("Check-in denied. Membership status: " + status);
        }
    }
}

