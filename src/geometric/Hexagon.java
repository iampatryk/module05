package geometric;

public class Hexagon implements GeometricFigure03 {

    private double side;

    public Hexagon(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        System.out.println("Area of a Hexagon: ");
        return 3 * Math.sqrt(3) * side * side / 2;
    }
}
