package Armor;

public class Helmet implements Armor {

    double blockDmg;
    int weight;


    public Helmet(double blockDmg, int weight) {
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
