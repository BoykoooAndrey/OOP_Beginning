public class DrinkWithLimitedLife  extends Drink {
    private String expireDate;

    public DrinkWithLimitedLife(String name, int price, int quantity, double volume, String expireDate) {
        super(name, price, quantity, volume);
        this.expireDate = expireDate;

    }
    
    @Override
    public String toString() {
        StringBuilder localString = new StringBuilder(super.toString());
        localString.append(String.format("Годен до: %s\n", expireDate));
        return localString.toString();    
    }

}
