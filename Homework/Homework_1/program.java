/**
 * program
 */
public class program {

    public static void main(String[] args) {
        
        newList<Integer> myList = new newList<>();
        myList.add(60);
        myList.add(50);
        myList.add(40);
        myList.add(30);
        myList.add(20);
        System.out.println(myList.get(3));
        myList.forEach(item -> System.out.println(item));
        

    }
}