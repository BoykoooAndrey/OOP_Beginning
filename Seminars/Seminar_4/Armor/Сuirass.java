package Armor;

public class Сuirass implements Armor {

    double blockDmg;
    int weight;

    public Сuirass(double blockDmg, int weight) {
        this.blockDmg = blockDmg;
        this.weight = weight;
    }

    public double getBlockDmg() {
        return blockDmg;
    }

    public int getWeight() {
        return weight;
    }
}
