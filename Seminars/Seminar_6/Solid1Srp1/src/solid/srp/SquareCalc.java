package solid.srp;

/**
 * SquareCalc
 */
public class SquareCalc {
    
    private int side;
    

    public SquareCalc(int side) {
        this.side = side;
    }

    public int getArea() {
        return side * side;
    }

    public int getSide() {
        return side;
    }
    
}



