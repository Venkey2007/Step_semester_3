
package oops.assigment_problems.week8;

public class MembershipDemo {

    public static void main(String[] args) {

        MembershipDesk desk = new MembershipDesk();

        Member asha = new Member("M101", "Asha", "CSE");
        Member ravi = new Member("M102", "Ravi", "ECE");
        Member neha = new Member("M103", "Neha", "IT");

        Membership ashaMembership =
                new Membership("FIT101", asha, new MonthlyPlan());

        Membership raviMembership =
                new Membership("FIT102", ravi, new QuarterlyPlan());

        Membership nehaMembership =
                new Membership("FIT103", neha, new AnnualPlan());

        System.out.println("=== FitZone Membership Desk ===\n");

        desk.registerMembership(ashaMembership);
        desk.registerMembership(raviMembership);
        desk.registerMembership(nehaMembership);

        System.out.println("\n=== Check-in Tests ===");
        desk.checkIn("FIT101");

        System.out.println("\n=== Freeze and Unfreeze Tests ===");
        desk.freezeMembership("FIT101");
        desk.checkIn("FIT101");
        desk.unfreezeMembership("FIT101");
        desk.checkIn("FIT101");

        System.out.println("\n=== Expiration Test ===");
        desk.expireMembership("FIT103");
        desk.checkIn("FIT103");
        desk.freezeMembership("FIT103");
        desk.unfreezeMembership("FIT103");
    }
}

