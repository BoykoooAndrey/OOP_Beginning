package Armor;

public class Shield implements Armor{
    
    double blockDmg;
    int weight;

    public Shield(double blockDmg, int weight) {
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
