package com.kodilla.testing.shape;

import java.util.ArrayList;


public class ShapeCollector {

    private ArrayList<Shape> shapeList = new ArrayList<>();

    public ArrayList<Shape> getShapeList() {
        return shapeList;
    }

    public void addFigure(Shape shape) {
        shapeList.add(shape);
    }

    public void removeFigure(Shape shape) {
        shapeList.remove(shape);
    }

    public Shape getFigure(int n) {
        if (n >= 0 && n < shapeList.size()) {
            return shapeList.get(n);
        } else {
            return null;
        }
    }

    public String showFigures() {
        return shapeList.toString();
    }
}


