package oops.assigment_problems;

public class LibraryMember {

    private String membershipPin;
    String branchCode;
    protected double finesOwed;
    public String displayName;

    private String membershipId;
    private String name;
    private boolean premiumMember;
    private String securityAnswer;

    public LibraryMember() {
    }

    public LibraryMember(String membershipPin,
                         String branchCode,
                         double finesOwed,
                         String displayName) {
        this.membershipPin = membershipPin;
        this.branchCode = branchCode;
        this.finesOwed = finesOwed;
        this.displayName = displayName;
    }

    public String getMembershipId() {
        return membershipId;
    }

    public void setMembershipId(String id) {
        if (membershipId == null) {
            membershipId = id;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isPremiumMember() {
        return premiumMember;
    }

    public void setPremiumMember(boolean premium) {
        this.premiumMember = premium;
    }

    public void setSecurityAnswer(String answer) {
        if (answer == null) {
            securityAnswer = null;
        } else {
            securityAnswer = Integer.toHexString(answer.hashCode());
        }
    }
}