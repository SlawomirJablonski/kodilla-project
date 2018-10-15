package com.kodilla.testing.shape;

import org.junit.*;

import java.util.ArrayList;


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
        ArrayList<Shape> shapeList = new ArrayList<>();
        double radius = 2;
        Shape shape1 = new Circle(radius);
        double side = 2;
        Shape shape2 = new Square(side);
        double aSide = 2;
        double bSide = 4;
        double cSide = -2;
        Shape shape3 = new Triangle(aSide, bSide, cSide);
        //When
        if (radius > 0) {
            collector.addFigure(shape1);
        }
        if (radius > 0) {
            collector.addFigure(shape2);
        }
        if (aSide > 0 && bSide > 0 && cSide > 0) {
            collector.addFigure(shape3);
        }
        //Then
        Assert.assertEquals(2, shapeList.size());
    }

    @Test
    public void testRemoveFigure() {
        //Given
        ShapeCollector collector = new ShapeCollector();
        ArrayList<Shape> shapeList = new ArrayList<>();

        double radius = 2;
        Shape shape1 = new Circle(radius);
        if (radius > 0) {
            shapeList.add(shape1);
        }

        double side = 2;
        Shape shape2 = new Square(side);
        if (side > 0) {
            shapeList.add(shape2);
        }

        double aSide = 2;
        double bSide = 4;
        double cSide = -2;
        Shape shape3 = new Triangle(aSide, bSide, cSide);
        if (aSide > 0 && bSide > 0 && cSide > 0) {
            shapeList.add(shape3);
        }

        //When
        collector.removeFigure(shape1);
        collector.removeFigure(shape2);
        collector.removeFigure(shape3);

        //Then
        Assert.assertEquals(0, shapeList.size());

    }

    @Test
    public void testGetFigure() {
        //Given
        ShapeCollector collector = new ShapeCollector();
        ArrayList<Shape> shapeList = new ArrayList<>();
        double radius = 2;
        Shape circle = new Circle(radius);
        double side = 2;
        Shape square = new Square(side);
        double aSide = 2;
        double bSide = 4;
        double cSide = -2;
        Shape triangle = new Triangle(aSide, bSide, cSide);

        if (radius > 0) {
            shapeList.add(circle);
        }
        if (radius > 0) {
            shapeList.add(square);
        }
        if (aSide > 0 && bSide > 0 && cSide > 0) {
            shapeList.add(triangle);
        }
        //When
        Shape retrievedShape = collector.getFigure(1);
        //Then
        Assert.assertEquals(square, retrievedShape);
    }


    @Test
    public void testShowFigures() {
        //Given
        ShapeCollector collector = new ShapeCollector();
        ArrayList<Shape> shapeList = new ArrayList<>();
        double radius = -2;
        Shape circle = new Circle(radius);
        double side = -2;
        Shape square = new Square(side);
        double aSide = 2;
        double bSide = 4;
        double cSide = -2;
        Shape triangle = new Triangle(aSide, bSide, cSide);

        if (radius > 0) {
            shapeList.add(circle);
        }
        if (radius > 0) {
            shapeList.add(square);
        }
        if (aSide > 0 && bSide > 0 && cSide > 0) {
            shapeList.add(triangle);
        }
        //When
        ArrayList<Shape> retrievedFigures = collector.showFigures();
        //Then
        Assert.assertEquals("[]", retrievedFigures);
    }
}

