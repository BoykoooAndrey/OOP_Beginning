import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;


public class Producrt {
    private static Integer count = 0;
    private int ID;
    private String name;
    private int price;
    private int quantity;
    private LocalDate dateAdded;
    private LocalTime timeAdded;

    public Producrt(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.dateAdded = LocalDate.now();
        this.timeAdded = LocalTime.now(ZoneId.of("GMT+03:00"));
        this.ID = count;
        count ++;
    }

    public void changQuantity(Integer qwe){
        quantity = qwe - 1;
    }
    
    public String getName() {
        return name;
    }
    public int getQuantity() {
        return quantity;
    }
    public int getPrice() {
        return price;
    }
    public int getID() {
        return ID;
    }

    @Override
    public String toString() {
        return String.format("ID: %d\nПродукт: %s\nСтоимость: %d рублей\nКоличество: %d\nДата добавления: %s\nВермя добавления: %s:%s:%s\n", 
        ID, name, price, quantity,dateAdded.toString(), timeAdded.getHour(), timeAdded.getMinute(), timeAdded.getSecond());

    }
}
