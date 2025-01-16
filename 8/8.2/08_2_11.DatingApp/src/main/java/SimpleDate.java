
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month &&
                this.day < compared.day) {
            return true;
        }

        return false;
    }

    public void advance() {

        if (day + 1 > 30 && month + 1 > 12) {
            month = 1;
            day = 1;
            year++;

        } else if (day + 1 > 30) {
            month++;
            day = 1;

        } else {
            day++;
        }
    }

    public void advance(int howManyDays) {

        if (day + howManyDays > 30 && month + 1 > 12) {
            month = 1;
//            day = day - howManyDays + 10;
            year++;

        } else if (day + howManyDays > 30) {
            month++;
//            day = day - howManyDays + 10;

        } else {
            day += howManyDays;
        }
    }

}
