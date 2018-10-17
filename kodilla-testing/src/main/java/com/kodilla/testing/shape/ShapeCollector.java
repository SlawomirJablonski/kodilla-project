package com.kodilla.testing.shape;

import java.util.ArrayList;


public class ShapeCollector {

    private ArrayList<Shape> shapeList = new ArrayList<>();

    public void addFigure(Shape shape) {
        if(shape.getShapeName()=="circle"){
            double tempField = shape.getField();
            if(tempField>0) {
                shapeList.add(shape);
            }
        }
        if(shape.getShapeName()=="square"){
            double tempField = shape.getField();
            if(tempField>0) {
                shapeList.add(shape);
            }
        }
        if(shape.getShapeName()=="triangle"&&shape.getField()>0){
            double tempField = shape.getField();
            if(tempField>0) {
                shapeList.add(shape);
            }
        }
    }

    public void removeFigure(Shape shape) {

    }

    public Shape getFigure(int n) {
        return null;
    }

    public ArrayList<Shape> showFigures() {
        return null;
    }
}

