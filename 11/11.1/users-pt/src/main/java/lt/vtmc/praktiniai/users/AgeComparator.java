package lt.vtmc.praktiniai.users;

import java.util.Comparator;

public class AgeComparator implements Comparator<User> {


    @Override
    public int compare(User user, User t1) {
        return Integer.compare(user.getAge(), t1.getAge());
    }
}
