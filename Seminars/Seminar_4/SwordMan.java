import Weapons.Sword;

/**
 * SwordMan
 */
public class SwordMan extends Warrior<Sword>{
    public SwordMan(String name, Sword waepon) {
        super(name, waepon);
    }
    
    @Override
    public String toString() {
        return super.toString() + "type = SwordMan";
    }

    
}