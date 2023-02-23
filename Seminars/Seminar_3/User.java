
public class User implements Comparable<User> {
    String firstName;
    String lastName;
    int age;

    private personal pers = new personal(null);
    static private Sorter sort;

    public static void setSorter(Sorter sort) {
        User.sort = sort;
    }

    public User(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public User(String firstName, String lastName, int age, personal pers) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.pers = pers;
    }


    @Override
    public String toString() {
        return String.format("%s %s - возраст %d", firstName, lastName, age);
    }

    @Override
    public int compareTo(User o) {
        return sort.compare(this, o);
    }

    public static abstract class Sorter {
        public abstract int compare(User u1, User u2);
    }   
    public static class SorterFirstName extends Sorter {
        @Override
        public int compare(User u1, User u2){
            return u1.firstName.compareTo(u2.firstName);
        }
    }
    public static class SorterLastName extends Sorter {
        @Override
        public int compare(User u1, User u2){
            return u1.lastName.compareTo(u2.lastName);
        }
    }

}