public class Drink extends Producrt {
    private double volume;

    public Drink(String name, int price, int quantity, double volume) {
        super(name, price, quantity);
        this.volume = volume;
        
    }
    
    @Override
    public String toString() {
        StringBuilder localString = new StringBuilder(super.toString());
        localString.append(String.format("Объем %f л.\n", volume));
        return localString.toString();    
    }
}
