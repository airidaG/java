public class MonthlyMembership extends Membership {

    private int membershipDuration;

    public MonthlyMembership(int membershipId, int memberId, int membershipDuration) {
        super(membershipId, memberId);
        this.membershipDuration = membershipDuration;

    }

    @Override
    public double getCost() {
        return membershipDuration * 30;
    }

    @Override
    public String toString() {

        if (membershipDuration == 1) {
            return "MonthlyMembership, Cost: " + getCost() +
                    ", Duration: " + membershipDuration + " month";
        }
        return "MonthlyMembership, Cost: " + getCost() +
                ", Duration: " + membershipDuration + " months";
    }
}
