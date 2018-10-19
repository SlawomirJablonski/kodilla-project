package com.kodilla.testing.shape;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddFigure() {
        //Given
        ShapeCollector collector = new ShapeCollector();
        double radius = 2;
        Shape shape1 = new Circle(radius);
        double side = 3;
        Shape shape2 = new Square(side);
        double aSide = 4;
        double bSide = 6;
        double cSide = 7;
        Shape shape3 = new Triangle(aSide, bSide, cSide);
        //When
            collector.addFigure(shape1);
            collector.addFigure(shape2);
            collector.addFigure(shape3);
        //Then
        Assert.assertEquals(3,collector.getShapeList().size());

    }

    @Test
    public void testRemoveFigure() {
        //Given
        ShapeCollector collector = new ShapeCollector();
        double radius = 2;
        Shape shape1 = new Circle(radius);
        double side = 3;
        Shape shape2 = new Square(side);
        double aSide = 4;
        double bSide = 6;
        double cSide = 7;
        Shape shape3 = new Triangle(aSide, bSide, cSide);
        collector.addFigure(shape1);
        collector.addFigure(shape2);
        collector.addFigure(shape3);

        //When
        collector.removeFigure(shape1);
        collector.removeFigure(shape2);
        collector.removeFigure(shape3);

        //Then
        assertEquals(0, collector.getShapeList().size());

    }

    @Test
    public void testGetFigure() {
        //Given
        ShapeCollector collector = new ShapeCollector();
        double radius = 2;
        Shape circle = new Circle(radius);
        double side = 2;
        Shape square = new Square(side);
        double aSide = 4;
        double bSide = 6;
        double cSide = 7;
        Shape triangle = new Triangle(aSide, bSide, cSide);

        collector.addFigure(circle);
        collector.addFigure(square);
        collector.addFigure(triangle);
        //When
        Shape retrievedShape = collector.getFigure(1);
        //Then
        assertEquals(square, retrievedShape);
    }

    @Test
    public void testShowFigures() {
        //Given
        ShapeCollector collector1 = new ShapeCollector();

        double radius = 2;
        Shape circle = new Circle(radius);
        collector1.addFigure(circle);

        List<Shape> listForTest = new ArrayList<>();
        listForTest.add(circle);
        //When
        String retrievedFigures = collector1.showFigures();
        //Then
        assertEquals(listForTest.toString(), retrievedFigures);
    }
}

