package test;

import geometric.GeometricFigure03;
import geometric.Hexagon;
import geometric.Rectangle;
import geometric.Triangle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestGeometricTask {
    @Test
    public void testRectangleTrue() {
        GeometricFigure03 rectangle = new Rectangle(7,8);
        Assertions.assertEquals(56,rectangle.calculateArea());
    }

    @Test
    public void testTriangleTrue() {
        GeometricFigure03 triangle = new Triangle(3,6);
        Assertions.assertEquals(9,triangle.calculateArea());
    }

    @Test
    public void testHexagonTrue() {
        GeometricFigure03 hexagon = new Hexagon(4);
        Assertions.assertEquals(41.569219381653056,hexagon.calculateArea());
    }
    @Test
    public void testRectangleFalse() {
        GeometricFigure03 rectangle = new Rectangle(7,8);
        Assertions.assertNotEquals(50,rectangle.calculateArea());
    }

    @Test
    public void testTriangleFalse() {
        GeometricFigure03 triangle = new Triangle(3,6);
        Assertions.assertNotEquals(92,triangle.calculateArea());
    }

    @Test
    public void testHexagonTrueFalse() {
        GeometricFigure03 hexagon = new Hexagon(4);
        Assertions.assertNotEquals(44.569219381653056,hexagon.calculateArea());
    }


}
