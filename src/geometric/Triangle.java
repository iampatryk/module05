package geometric;

public class Triangle implements GeometricFigure03 {
    private double base;
    private double height;

    public Triangle (double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        System.out.println("Area of a Triangle: ");
        return 0.5 * base * height;
    }
}
