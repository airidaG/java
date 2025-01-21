package lt.vtmc.praktiniai.users;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Praktiniai {

    public static Integer countUsersOlderThen25(List<User> users) {
        int count = 0;

        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getAge() > 25) {
                count++;
            }
        }
        return count;
    }

    public static double getAverageAge(List<User> users) {

        double count = 0;
        double sum = 0;

        for (User user : users) {
            count++;
            sum += user.getAge();
        }
        return sum / count;
    }

    // Naudokite klase Collections.min(). Paduokite Comparator
    public static Integer getMinAge(List<User> users) {

        return Collections.min(users, new AgeComparator()).getAge();
    }

    public static User findByName(List<User> users, String name) {


        for (int i = 0; i < users.size(); i++) {

            if (users.get(i).getName().equals(name)) {

                return users.get(i);
            }
        }
        return null;
    }

    // Naudokite klase Collections.sort(). Paduokite Comparator
    public static List<User> sortByAge(List<User> users) {

        users.sort(new Comparator<User>() {
            @Override
            public int compare(User user, User t1) {
                return Integer.compare(user.getAge(), t1.getAge());
            }
        });

        return users;
    }

    //  Naudokite klase Collections.max(). Paduokite Comparator
    public static User findOldest(List<User> users) {

        return Collections.max(users, new AgeComparator());
    }


    public static int sumAge(List<User> users) {


        int sum = 0;

        for (User user : users) {
            sum += user.getAge();
        }
        return sum;
    }
}


