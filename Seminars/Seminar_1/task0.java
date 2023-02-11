import java.io.IOException;
import java.util.Scanner;

public class task0 {
    public static void main(String[] args) throws IOException {
        VendingMachine machine = new VendingMachine();
        machine.addProduct(new Producrt("Mars", 80, 7));
        machine.addProduct(new Producrt("Lays", 100, 10));
        machine.addProduct(new Producrt("Mars", 90, 5));
        machine.addProduct(new ProductWithLimitedLife("Глазированный сырок", 100, 10, "25.02.2023"));
        machine.addProduct(new Drink("Sprite", 80, 5, 0.25));
        machine.addProduct(new DrinkWithLimitedLife("Milk", 60, 5, 0.25, "25.02.2023"));
        
        menuMachine(machine);
    
        

    }

    public static void menuMachine(VendingMachine machine) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while (i != 9) {
            System.out.println("Выберети пункт:\n1 - Добавить продукт\n2 - Добавить продукт с ограниченным сроком хранения"+
            "\n3 - Добавить напиток;\n4 - Добавить напиток с ограниченным сроком хранения;\n5 - Показать ассортимент;"+
            "\n6 - Совершить покупку;\n7 - Показать баланс;\n9 - Выйти из системы;");
            System.out.printf("--->");
            i = scanner.nextInt();
            if (i == 1) {
                System.out.printf("Введите название продукта:");
                String name = scanner.next();
                System.out.printf("Введите цену продукта:");
                int price = scanner.nextInt();
                System.out.printf("Введите количество продукта:");
                int quantity = scanner.nextInt();
                machine.addProduct(new Producrt(name, price, quantity));
                System.out.printf("\nПродукт %s добавлен", name);
            }
            if (i == 2) {
                System.out.printf("Введите название продукта:");
                String name = scanner.next();
                System.out.printf("Введите цену продукта:");
                int price = scanner.nextInt();
                System.out.printf("Введите количество продукта:");
                int quantity = scanner.nextInt();
                System.out.printf("Введите срок годности:");
                String expireDate = scanner.next();
                machine.addProduct(new ProductWithLimitedLife(name, price, quantity, expireDate));
                System.out.printf("\nПродукт %s добавлен", name);
            }
            if (i == 3) {
                System.out.printf("Введите название продукта:");
                String name = scanner.next();
                System.out.printf("Введите цену продукта:");
                int price = scanner.nextInt();
                System.out.printf("Введите количество продукта:");
                int quantity = scanner.nextInt();
                System.out.printf("Введите объем:");
                String volume = scanner.next();
                machine.addProduct(new Drink(name, price, quantity, Double.parseDouble(volume)));
                System.out.printf("\nПродукт %s добавлен", name);
            }
            if (i == 4) {
                System.out.printf("Введите название продукта:");
                String name = scanner.next();
                System.out.printf("Введите цену продукта:");
                int price = scanner.nextInt();
                System.out.printf("Введите количество продукта:");
                int quantity = scanner.nextInt();
                System.out.printf("Введите объем:");
                String volume = scanner.next();
                System.out.printf("Введите срок годности:");
                String expireDate = scanner.next();
                machine.addProduct(new DrinkWithLimitedLife(name, price, quantity, Double.parseDouble(volume), expireDate));
                System.out.printf("\nПродукт %s добавлен", name);
            }
            if (i == 5) {
                System.out.println(machine.toString());
            }
            if (i == 6) {
                System.out.printf("Введите ID продукта:");
                int ID = scanner.nextInt();
                machine.sellProduct(ID);
            }
            if (i == 7) {
                machine.showCash();
            }
        }
        scanner.close();
    }

}