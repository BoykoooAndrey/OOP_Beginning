import java.util.List;

import Armor.Armor;
import Armor.Сuirass;
import Armor.Helmet;
import Armor.Shield;
import Weapons.Bow;
import Weapons.Sword;

public class programm {
    public static void main(String[] args) {
        // ARMOR INVENTORY
        Armor lightСuirass = new Сuirass(0.1, 7);
        Armor averageСuirass = new Сuirass(0.15, 11);
        Armor heavyСuirass = new Сuirass(0.2, 14);
        //
        Armor lightHelm = new Helmet(0.01, 1);
        Armor averageHelm = new Helmet(0.02, 2);
        Armor heavyHelm = new Helmet(0.03, 3);
        //
        Armor smallShield = new Shield(0.02, 5);
        Armor averageShield = new Shield(0.04, 9);
        Armor bigShield = new Shield(0.08, 13);
        
        

        //FIGHT
        Warrior greg = new Archer("Eagle eye", new Bow());
        Warrior alt = new SwordMan("Dwarf", new Sword());
        greg.putArmor(smallShield);
        greg.putArmor(heavyHelm);
        alt.putArmor(bigShield);

        while (greg.getHealthPoint() > 0 && alt.getHealthPoint() > 0) {
            int damage1 = greg.hitDamage(alt);
            System.out.println();
            int damage2 = alt.hitDamage(greg);
            System.out.println();
            System.out.printf("Здоровье Грег: %d; \nЗдоровье Альта: %d\n", greg.getHealthPoint(), alt.getHealthPoint());
        }
        System.out.println();
        if (greg.healthPoint > 0) {
            System.out.println("Грег победил!");
        }
        else{
            System.out.println("Альт победил!");
        }

        //CREATE TEAM
        // Team<Archer> t1 = new Team<>("Archers");
        // t1.addWarrior(new Archer("Eagle eye", new Bow()))
        // .addWarrior(new Archer("Legolas", new Bow()))
        // .addWarrior(new Archer("Sokol", new Bow()));
        // System.out.println(t1);

        // Team<Warrior> t2 = new Team<>("Mixer");
        // t2.addWarrior(new Archer("Kolos", new Bow()))
        // .addWarrior(new SwordMan("Dwarf", new Sword()))
        // .addWarrior(new Archer("Elf", new Bow()));
        // System.out.println(t2);
    }
}
