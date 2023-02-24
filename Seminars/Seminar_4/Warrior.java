import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import Armor.*;
import Weapons.Weapon;

/**
 * Warrior
 */
public abstract class Warrior<T extends Weapon> {

    protected String name;
    protected T waepon;
    protected int healthPoint;
    protected Random rnd = new Random();
    
    protected List<Armor> ammunition = new ArrayList<>();
    protected double damageСoefficient = 1;
    protected int weightArmor = 0;
    protected int overLoadItems = 0;

    
    public Warrior(String name, T waepon) {
        this.name = name;
        this.waepon = waepon;
        healthPoint = 100;
    }

    public int hitDamage(Warrior<T> enemy) {
        int dmg = rnd.nextInt(waepon.damage());
        if (getOverLoadItems() == 1) {
            dmg = (int) (dmg * 0.5);
        }
        int damageWithEnemyArmor = (int) (dmg * enemy.damageСoefficient);
        enemy.reduceHealthPoint(damageWithEnemyArmor);
        System.out.printf("ДМГ = %d, ДМГ с учетом брони противника = %d", dmg, damageWithEnemyArmor);
        return dmg;
    }

    public void reduceHealthPoint(int dmg) {
        this.healthPoint -= dmg;
    }

    protected boolean checkingThereTypeArmor(Armor item){
        for (Armor armor : ammunition) {
            if (armor.getClass() == item.getClass()) {
                return true;
            }
        }
        return false;
    }

    public void putArmor(Armor item){
        if (!(checkingThereTypeArmor(item))) {
            ammunition.add(item);
            this.damageСoefficient =  this.damageСoefficient - item.getBlockDmg();
            this.weightArmor += item.getWeight();
            overLoadItems();
        }
        else{
            System.out.println(item.getClass().toString() + " уже надет!");
        }
        
        
    }

    protected void overLoadItems(){
        if (getWeightArmor() > 10) {
            this.overLoadItems = 1;
        }
    }

    @Override
    public String toString() {
        return "Warrior name = " + name + ", waepon = " + waepon + ", healthPoint = " + healthPoint + ", ";
    }


    // GETTERS
    public int getMaxDamage(){
        return waepon.damage();
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public List<Armor> getAmmunition() {
        return ammunition;
    }

    public double getDamageСoefficient() {
        return damageСoefficient;
    }

    public int getWeightArmor() {
        return weightArmor;
    }

    public int getOverLoadItems() {
        return overLoadItems;
    }

    
    
}