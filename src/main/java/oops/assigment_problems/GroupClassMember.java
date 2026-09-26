package oops.assigment_problems;

public class GroupClassMember extends GymMember {

    private String className;
public GroupClassMember(int monthlyFee, String className) {
    super(monthlyFee);
    this.className = className;
}

    public GroupClassMember(
            String memberId,
            int monthlyFee,
            String className) {

        super(memberId, monthlyFee);
        this.className = className;
    }

    @Override
    public String displayInfo() {
        return "Group Class Member | Class: "
                + className
                + " | Sessions: "
                + sessionsAttended;
    }
}