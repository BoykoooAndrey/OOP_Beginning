import Armor.Armor;
import Weapons.Bow;

public class Archer extends Warrior<Bow> implements DistanceAttacker{
    int distance;


    public Archer(String name, Bow waepon) {
        super(name, waepon);
        distance = waepon.getDistance() + rnd.nextInt(10);
    }
    


    @Override
    public String toString() {
        return super.toString() + "type = Archer, distance=" + distance;
    }

    public int getDistance() {
        return distance;
    }
    
}
