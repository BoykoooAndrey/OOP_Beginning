package Weapons;

public class Sword implements Weapon {

    @Override
    public int damage() {
        return 15;
    }

    @Override
    public String toString() {
        return "Sword [damage =" + damage() + "]";
    }

}
