package solid.lsp;

public class Order extends AbstractOrder implements Orderable{


    public Order(int qnt, int price) {
        super(price, qnt);
    }
    @Override
    public int getAmount() {
        return qnt * price;
    }

    @Override
    public String toString() {
        return String.format("Количество = %d, Цена = %d", qnt, price);
    }
}
