import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private List<Producrt> locallist = new ArrayList<>();
    
    private static Integer cash = 0;



    public List<Producrt> getLocallist() {
        return locallist;
    }

    public boolean addProduct(Producrt inputProducrt)  {
        for (Producrt producrt : locallist) {
            if (producrt.getName().equals(inputProducrt.getName())) {
                Producrt tmpProduct = new Producrt(inputProducrt.getName(), inputProducrt.getPrice(),
                        inputProducrt.getQuantity() + producrt.getQuantity());
                
                locallist.add(tmpProduct);
                locallist.remove(producrt);
                return true;
            }
        }
        locallist.add(inputProducrt);
        return true;
    }

    public void sellProduct(int ID){
        for (Producrt producrt : locallist) {
            if (producrt.getID() == ID) {
                producrt.changQuantity(producrt.getQuantity());
                cash += producrt.getPrice();
                System.out.printf("Покупка совершена, стоимость покупки составила %d рублей\n", producrt.getPrice());
            }
        }
        
    }

    public void showCash(){
        System.out.printf("%d рублей\n", cash);
    }

    
    @Override
    public String toString() {
        StringBuilder localString = new StringBuilder();
        for (Producrt producrt : locallist) {
            localString.append(producrt.toString());
            localString.append("\n");
        }
        return localString.toString();
    }
}
