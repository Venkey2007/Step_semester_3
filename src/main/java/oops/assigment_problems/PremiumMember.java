package oops.assigment_problems;

public class PremiumMember extends GymMember {

    private String trainerName;

    public PremiumMember(

            String memberId,
            int monthlyFee,
            String trainerName) {

        super(memberId, monthlyFee);
        this.trainerName = trainerName;
    }
@Override
protected void chargeLateFee(int amount) {
    super.chargeLateFee(amount / 2);
}

    public String getTrainerName() {
        return trainerName;
    }

    @Override
    public String displayInfo() {
        return "Premium Member | Trainer: "
                + trainerName
                + " | Sessions: "
                + sessionsAttended;
    }
}