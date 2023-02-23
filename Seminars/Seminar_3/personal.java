import java.util.Iterator;
import java.util.List;

public class personal implements Iterable<User>{
    private List <User> users;
    public personal(List <User> users) {
        this.users = users;
    }
    @Override
    public Iterator<User> iterator() {
        return new PersonalIterator();
    }
    protected class PersonalIterator implements Iterator<User>{
        private int index = 0;
        @Override
        public boolean hasNext() {
            return index < users.size();
        }
        @Override
        public User next() {
            return users.get(index++);
        }
    }   
}
