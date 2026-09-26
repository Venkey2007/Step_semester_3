package oops.assigment_problems;

public class EliteMember extends PremiumMember {

    private String lockerNumber;

    public EliteMember(
            String memberId,
            int monthlyFee,
            String trainerName,
            String lockerNumber) {

        super(memberId, monthlyFee, trainerName);
        this.lockerNumber = lockerNumber;
    }

    @Override
    public String displayInfo() {
        return "Elite Member | Trainer: "
                + getTrainerName()
                + " | Locker: "
                + lockerNumber
                + " | Sessions: "
                + sessionsAttended;
    }
}
