package solid.srp;

/**
 * SquareView
 */
public class SquareView {

    private int scale;
    private int side;
    private int scaleSide;

    public SquareView(int scale, int side) {
        this.scale = scale;
        this.side = side;
        scaleSide = scale * side;
    }

    public void draw() {
        printHorizontal();
        printVertical();
        printHorizontal();
        
    }
    private void printHorizontal() {
        for (int i = 0; i < scaleSide; i++) {
            System.out.print("* ");
        }
    }
    private void printVertical() {
        System.out.println();
        for (int i = 0; i < scaleSide - 2; i++) {
            System.out.print("* ");
            for (int j = 1; j < scaleSide - 1; j++) {
                System.out.print("  ");
            }
            System.out.println("*");
        }
    }

}