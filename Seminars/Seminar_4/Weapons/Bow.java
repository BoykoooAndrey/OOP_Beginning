package Weapons;

public class Bow implements Weapon {
    private int distance = 30;

    public int getDistance() {
        return distance;
    }

    @Override
    public int damage() {
        return 10;
    }

    @Override
    public String toString() {
        return "Bow [distance_atack = " + distance + " damage = " + damage()+ "]";
    }
    
}
