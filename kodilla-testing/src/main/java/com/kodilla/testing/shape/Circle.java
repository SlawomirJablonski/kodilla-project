package com.kodilla.testing.shape;

import static java.lang.Math.pow;

public class Circle implements Shape {
    final double Pi = 3.14;
    double field;
    double radius;

    public Circle(double radius){
        this.radius = radius;
    }



    @Override
    public String getShapeName() {
        return "circle";
    }

    @Override
    public double getField() {
        if (radius > 0) {
            field = Pi * pow(radius,2);
        }
        return field;
    }
}
