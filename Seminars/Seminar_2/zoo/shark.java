package zoo;

public class shark extends Predator implements swimingInterface{
    private int swimSpeed = 30;
    public shark(String name) {
        super(name);
        
    }

    @Override
    public String say() {
        return "Arrrch";
    }

    @Override
    public int getSwinSpeed() {
        return this.swimSpeed;
    }
    
}
