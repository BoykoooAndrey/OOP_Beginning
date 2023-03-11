package solid;

import solid.srp.Point;
import solid.srp.Square;
import solid.srp.SquareCalc;
import solid.srp.SquareView;

public class Main {
    public static void main(String[] args) {
        int side = 5;
        int scale = 1;
        Square square = new Square(new Point(1,1), side);
        System.out.printf("Площадь фигуры: %d \n", new SquareCalc(side).getArea());
        new SquareView(scale, side).draw();

    }
}
