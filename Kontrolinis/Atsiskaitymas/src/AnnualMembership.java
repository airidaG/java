public class AnnualMembership extends Membership {

    private final int membershipDuration;

    public AnnualMembership(int membershipId, int memberId) {
        super(membershipId, memberId);
        this.membershipDuration = 12;
    }

    @Override
    public double getCost() {
        return 300.0;
    }

    @Override
    public String toString() {
        return "AnnualMembership, Cost: " + getCost() +
                ", Duration: " + membershipDuration + " months";
    }
}
