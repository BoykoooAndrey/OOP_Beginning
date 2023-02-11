
public class ProductWithLimitedLife extends Producrt {
    private String expireDate;

    public ProductWithLimitedLife(String name, int price, int quantity, String expireDate) {
        super(name, price, quantity);
        this.expireDate = expireDate;
    }
    @Override
    public String toString() {
        StringBuilder localString = new StringBuilder(super.toString());
        localString.append(String.format("Годен до %s\n", expireDate.toString()));
        return localString.toString();    
    }
}