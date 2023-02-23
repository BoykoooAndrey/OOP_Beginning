import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class programm {
    public static void main(String[] args) {
        User u1 = new User("Andrey", "Ivanov", 56);
        User u2 = new User("Ivan", "Petrov", 23);
        User u3 = new User("Nikolay", "Valisyev", 43);
        User u4 = new User("Ivan", "Letob", 32);
        User u5 = new User("Andrey", "Ivanov", 43);
        User u6 = new User("Andrey", "Ceba", 43);


        List <User> users = new ArrayList<>();
        users.add(u1);
        users.add(u2);
        users.add(u3);
        users.add(u4);
        users.add(u5);
        users.add(u6);

        User.setSorter(new User.SorterFirstName());
        personal pers = new personal(users);
        for (User user : pers) {
            System.out.println(user.toString());
        }
        System.out.println();
        Collections.sort(users);
        for (User user : pers) {
            System.out.println(user.toString());
        }
    }
}
