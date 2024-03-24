package geometric;

public class Rectangle implements GeometricFigure03 {

    double length;
    double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        System.out.println("Area of a Rectangle: ");
        return length * width;
    }
}
