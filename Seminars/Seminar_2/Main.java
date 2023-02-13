import zoo.*;
import zoo.radio.Radio;
import zoo.radio.Sayable;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Animal> animalsList = List.of(
                new Cow("Мурка"),
                new Crocodile("Гена"),
                new Leo("Симба - Леопольд"),
                new Goat("Маруська"),
                new Duck("Дональд Дак"),
                new shark("Bill")
        );
        Zoo zoo = new Zoo(animalsList, new Radio());

        for (Sayable animal : zoo.getSayable()) {
            System.out.println(animal.say());
        }
        System.out.println("______________________");
        for (Runable animal : zoo.getRunableList()) {
            System.out.println(((Animal)animal).getName());
            System.out.println(((Animal)animal).say());
            System.out.println(animal.getSpeedRun() + "\n");
        }
        System.out.println("______________________");
        for (Flyable animal : zoo.getFlyableList()) {
            System.out.println(((Animal)animal).getName());
            System.out.println(((Animal)animal).say());
            System.out.println(animal.getSpeedFlyable());
            System.out.println(animal.getHigh() + "\n");
        }
        
        System.out.println(zoo.getRunChampion().getName());
        System.out.println(zoo.getFlightChampion().getName());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Плавающие обитатели:");
        for (String nameSwim : zoo.getSwimList()) {
            System.out.println(nameSwim);
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");




    }
}