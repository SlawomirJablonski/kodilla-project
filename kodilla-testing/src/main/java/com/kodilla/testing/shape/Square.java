package com.kodilla.testing.shape;

import static java.lang.Math.pow;

public class Square implements Shape {
    double side;
    double field;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public String getShapeName() {
        return "square";
    }

    @Override
    public double getField() {
        double side = 0;
        if (side>0){
            field = pow(side,2);
        }
        return field;
    }
}
