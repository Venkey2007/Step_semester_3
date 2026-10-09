
package oops.assigment_problems.week8;

import java.util.ArrayList;
import java.util.List;

public class MembershipDesk {

    private List<Membership> memberships;

    public MembershipDesk() {
        memberships = new ArrayList<>();
    }

    public void registerMembership(Membership membership) {
        memberships.add(membership);
        System.out.println(
            membership.getMember().getName()
            + " registered for the "
            + membership.getPlan().getName()
            + " plan. Fee: Rs. "
            + membership.calculateFee()
        );
    }

    public void checkIn(String membershipId) {
        Membership membership = findMembership(membershipId);

        if (membership == null) {
            System.out.println("Membership not found.");
            return;
        }

        membership.checkIn();
    }

    public void freezeMembership(String membershipId) {
        Membership membership = findMembership(membershipId);

        if (membership == null) {
            System.out.println("Membership not found.");
            return;
        }

        membership.freeze();
    }

    public void unfreezeMembership(String membershipId) {
        Membership membership = findMembership(membershipId);

        if (membership == null) {
            System.out.println("Membership not found.");
            return;
        }

        membership.unfreeze();
    }

    public void expireMembership(String membershipId) {
        Membership membership = findMembership(membershipId);

        if (membership == null) {
            System.out.println("Membership not found.");
            return;
        }

        membership.expire();
    }

    private Membership findMembership(String membershipId) {
        for (Membership membership : memberships) {
            if (membership.getMembershipId().equals(membershipId)) {
                return membership;
            }
        }

        return null;
    }
}

